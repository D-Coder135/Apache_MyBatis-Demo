package co.devansh.dao;

import co.devansh.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CustomerDao {
    // CRUD OPERATIONS

    @Insert("insert into customer (name, city, email, phone) values (#{name}, #{city}, #{email}, #{phone})")
    public void addCustomer(Customer customer);

    @Select("select * from customer where id=#{id}")
    public Customer getCustomerById(Integer id);

    @Update("update customer set name=#{name}, city=#{city}, email=#{email}, phone=#{phone} where id=#{id}")
    public void updateCustomer(Customer customer);
    // QUERIES
}
