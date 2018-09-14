package hbi.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.sales.dto.ArCustomers;

import java.util.List;

public interface ArCustomersMapper extends Mapper<ArCustomers>{
    List<ArCustomers> mySelectCustomer(ArCustomers arCustomers);
}