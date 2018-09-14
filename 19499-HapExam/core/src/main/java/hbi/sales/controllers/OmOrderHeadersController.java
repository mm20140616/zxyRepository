package hbi.sales.controllers;

import com.hand.hap.core.impl.RequestHelper;
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import hbi.sales.dto.OmOrderHeaders;
import hbi.sales.service.IOmOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

    @Controller
    public class OmOrderHeadersController extends BaseController{

    @Autowired
    private IOmOrderHeadersService service;


    @RequestMapping(value = "/hap/om/order/headers/query")
    @ResponseBody
    public ResponseData query(OmOrderHeaders dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        //关联查询出所有数据
        return new ResponseData(service.mySelectCompanyAndCustomer(requestContext, dto, page, pageSize));

    }

    @RequestMapping(value = "/hap/om/order/headers/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<OmOrderHeaders> dto, BindingResult result, HttpServletRequest request){
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchSubmit(requestCtx, dto));
    }

    @RequestMapping(value = "/hap/om/order/headers/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<OmOrderHeaders> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    @RequestMapping(value = "/hap/om/order/headers/headAndLineDelete")
    @ResponseBody
    public ResponseData headAndlineDelete(HttpServletRequest request,@RequestBody List<OmOrderHeaders> dto) throws Exception{
        IRequest iRequest = createRequestContext(request);
        //IRequest requestContext = RequestHelper.newEmptyRequest();
        service.headAndlineDelete(iRequest,dto);
        return new ResponseData();
    }

}