package hbi.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.sales.dto.OmOrderHeaders;

import java.util.List;

public interface OmOrderHeadersMapper extends Mapper<OmOrderHeaders>{

    //查询companyName和customerName
    List<OmOrderHeaders> selectCompanyAndCustomer(OmOrderHeaders dto);

}