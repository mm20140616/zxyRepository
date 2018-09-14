package hbi.sales.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.sales.dto.OmOrderHeaders;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IOmOrderHeadersService extends IBaseService<OmOrderHeaders>, ProxySelf<IOmOrderHeadersService>{

    //查询lov
    List<OmOrderHeaders> mySelectCompanyAndCustomer(IRequest requestContext, OmOrderHeaders dto, int page, int pageSize);

    //保存头行
    List<OmOrderHeaders> batchSubmit(IRequest request,List<OmOrderHeaders> list);

    //删除头行
    int headAndlineDelete(IRequest request, List<OmOrderHeaders> dto) throws Exception;
}