package hbi.sales.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.sales.dto.OmOrderLines;

import java.util.List;

public interface IOmOrderLinesService extends IBaseService<OmOrderLines>, ProxySelf<IOmOrderLinesService>{

    //保存行
    List<OmOrderLines> myBatchSubmit(IRequest request, List<OmOrderLines> list);

    List<OmOrderLines> mySelect(IRequest requestContext, OmOrderLines dto, int page, int pageSize);

}