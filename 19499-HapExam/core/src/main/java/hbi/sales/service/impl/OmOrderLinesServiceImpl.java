package hbi.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.sales.mapper.OmOrderLinesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hbi.sales.dto.OmOrderLines;
import hbi.sales.service.IOmOrderLinesService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderLinesServiceImpl extends BaseServiceImpl<OmOrderLines> implements IOmOrderLinesService{

    @Autowired
    IOmOrderLinesService orderLinesService;

    @Autowired
    OmOrderLinesMapper mapper;

    @Override
    public List<OmOrderLines> myBatchSubmit(IRequest request, List<OmOrderLines> list) {
        if(list != null && !list.isEmpty()){
            for(int i = 0 ; i<list.size();i++){
                OmOrderLines omOrderLines = list.get(i);
                Long lineId = omOrderLines.getLineId();
                if(lineId == null || lineId == 0){
                    //说明是新增一个行信息
                    orderLinesService.insertSelective(request,omOrderLines);
                }else{
                    //更新一个行信息
                    orderLinesService.updateByPrimaryKeySelective(request,omOrderLines);
                }
            }
        }
        return list;

    }

    @Override
    public List<OmOrderLines> mySelect(IRequest requestContext, OmOrderLines dto, int page, int pageSize) {

        PageHelper.startPage(page,pageSize);
        List<OmOrderLines> list =  mapper.mySelect(dto);
        return list;
    }

}