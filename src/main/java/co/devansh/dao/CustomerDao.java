package co.devansh.dao;

import co.devansh.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface CustomerDao {
    // CRUD OPERATIONS

    @Insert("insert into customer (name, city, email, phone) values (#{name}, #{city}, #{email}, #{phone})")
    public void addCustomer(Customer customer);

    @Select()
    public Customer getCustomerById(Integer id);

    // QUERIES
}
