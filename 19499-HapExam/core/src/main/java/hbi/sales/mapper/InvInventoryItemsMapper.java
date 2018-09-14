package hbi.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.sales.dto.InvInventoryItems;

import java.util.List;

public interface InvInventoryItemsMapper extends Mapper<InvInventoryItems>{

    List<InvInventoryItems> selectItemMsg(InvInventoryItems invInventoryItems);
}