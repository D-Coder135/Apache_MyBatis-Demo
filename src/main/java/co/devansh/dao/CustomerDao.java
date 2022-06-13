package co.devansh.dao;

import co.devansh.entity.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CustomerDao {
    // CRUD OPERATIONS

    @Insert("insert into customer (name, city, email, phone) values (#{name}, #{city}, #{email}, #{phone})")
    public void addCustomer(Customer customer);

    @Select("select * from customer where id=#{id}")
    public Customer getCustomerById(Integer id);

    @Update("update customer set name=#{name}, city=#{city}, email=#{email}, phone=#{phone} where id=#{id}")
    public void updateCustomer(Customer customer);

    @Delete("delete from customer where id=#{id}")
    public void deleteCustomer(Integer id);

    // QUERIES
    public List<Customer> getAllCustomers();
}
