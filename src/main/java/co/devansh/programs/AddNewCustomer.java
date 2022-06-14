/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 12:00 AM
 *   File: AddNewCustomer
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;
import co.devansh.entity.Customer;

import java.io.IOException;

public class AddNewCustomer {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();

        Customer c1 = new Customer();
        c1.setName("Satya");
        c1.setCity("Shimla");
    }
}
