/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 01:17 PM
 *   File: DeleteCustomer
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;
import co.devansh.entity.Customer;

import java.io.IOException;

public class DeleteCustomer {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();

        int id = 9;
        Customer c1 = dao.getCustomerById(id);
        System.out.println("Customer with id 9 is deleted.");
    }
}
