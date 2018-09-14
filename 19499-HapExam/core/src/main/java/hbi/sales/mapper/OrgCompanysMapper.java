package hbi.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.sales.dto.OrgCompanys;

import java.util.List;

public interface OrgCompanysMapper extends Mapper<OrgCompanys>{

    List<OrgCompanys> mySelectCompany(OrgCompanys orgCompanys);
}