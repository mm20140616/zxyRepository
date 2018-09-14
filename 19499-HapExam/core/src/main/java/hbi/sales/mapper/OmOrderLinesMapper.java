package hbi.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.sales.dto.OmOrderLines;

import java.util.List;

public interface OmOrderLinesMapper extends Mapper<OmOrderLines>{

    List<OmOrderLines> mySelect(OmOrderLines dto);
}