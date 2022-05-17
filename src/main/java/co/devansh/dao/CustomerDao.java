package co.devansh.dao;

import co.devansh.entity.Customer;
import org.apache.ibatis.annotations.Insert;

public interface CustomerDao {
    // CRUD OPERATIONS

    @Insert("insert into customer (name, city, email, phone) values (#{name}, #{city}, #{email}, #{phone})")
    public void addCustomer(Customer customer);

    // QUERIES
}
