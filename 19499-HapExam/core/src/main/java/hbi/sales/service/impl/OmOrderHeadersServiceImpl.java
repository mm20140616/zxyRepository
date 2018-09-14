package hbi.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.code.rule.exception.CodeRuleException;
import com.hand.hap.code.rule.service.ISysCodeRuleProcessService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.sales.dto.OmOrderLines;
import hbi.sales.mapper.OmOrderHeadersMapper;
import hbi.sales.service.IOmOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hbi.sales.dto.OmOrderHeaders;
import hbi.sales.service.IOmOrderHeadersService;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderHeadersServiceImpl extends BaseServiceImpl<OmOrderHeaders> implements IOmOrderHeadersService {

    @Autowired
    OmOrderHeadersMapper orderHeadersMapper;

    @Autowired
    ISysCodeRuleProcessService sysCodeRuleProcessService;

    @Autowired
    IOmOrderHeadersService omOrderHeadersService;

    @Autowired
    private IOmOrderLinesService orderLinesService;

    @Override
    public List<OmOrderHeaders> mySelectCompanyAndCustomer(IRequest requestContext, OmOrderHeaders dto, int page, int pageSize) {

        PageHelper.startPage(page, pageSize);
        List<OmOrderHeaders> list = orderHeadersMapper.selectCompanyAndCustomer(dto);
        return list;
    }

    @Override
    public List<OmOrderHeaders> batchSubmit(IRequest request, List<OmOrderHeaders> list) {

        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                OmOrderHeaders omOrderHeaders = list.get(i);
                //通过headerId 来判断是更新还是新增操作
                Long headerId = omOrderHeaders.getHeaderId();
                if (headerId == null || headerId == 0) {
                    //是新增
                    String codeRule = "";
                    try {
                        codeRule = sysCodeRuleProcessService.getRuleCode("HAP_OM_ORDER_HEADER_S");
                    } catch (CodeRuleException e) {
                        e.printStackTrace();
                    }

                    omOrderHeaders.setHeaderId((long) Integer.parseInt(codeRule));
                    //System.out.println(omOrderHeaders.getHeaderId());
                    omOrderHeaders.setOrderNumber(codeRule);
                    omOrderHeadersService.insertSelective(request, omOrderHeaders);
                    //mybatis保存成功后会回写这个对象，所以开始的对象中就有数据了
                    headerId = omOrderHeaders.getHeaderId();
                    //再保存行
                    List<OmOrderLines> linesList = omOrderHeaders.getOmOrderLinesList();
                    if (linesList != null && !linesList.isEmpty()) {
                        for (int j = 0; j < linesList.size(); j++) {
                            //加入hearId值
                            linesList.get(j).setCompanyId(omOrderHeaders.getCompanyId());
                            linesList.get(j).setHeaderId(headerId);
                        }
                    }
                    orderLinesService.myBatchSubmit(request, linesList);

                } else {
                    omOrderHeadersService.updateByPrimaryKey(request, omOrderHeaders);
                    //是更新操作
                    List<OmOrderLines> linesList = omOrderHeaders.getOmOrderLinesList();
                    if (linesList != null && !linesList.isEmpty()) {
                        for (int j = 0; j < linesList.size(); j++) {
                            //加入hearId值
                            linesList.get(j).setCompanyId(omOrderHeaders.getCompanyId());
                            linesList.get(j).setHeaderId(headerId);
                        }
                    }
                    orderLinesService.myBatchSubmit(request, linesList);
                }
            }
        }

        return list;

    }

    @Override
    public int headAndlineDelete(IRequest request, List<OmOrderHeaders> dto) throws Exception {
        int count = 0;
        if (dto != null && !dto.isEmpty()) {
            //存在demoBANK的对象
            for (int i = 0; i < dto.size(); i++) {
                OmOrderHeaders omOrderHeaders = dto.get(i);
                Long headerId = omOrderHeaders.getHeaderId();
                if (headerId == null) {
                    throw new Exception("缺失主键");
                }
                OmOrderLines omOrderLines = new OmOrderLines();
                omOrderLines.setHeaderId(headerId);
                //select参数：后面两个参数为第一页查所有
                List<OmOrderLines> orderLines = orderLinesService.select(request, omOrderLines, 1, 0);
                if (orderLines != null && !orderLines.isEmpty()) {
                    //批量删除行
                    orderLinesService.batchDelete(orderLines);
                }
                //删除头
                int n = omOrderHeadersService.deleteByPrimaryKey(omOrderHeaders);
                count += n;
            }
        }
        return count;
    }

}