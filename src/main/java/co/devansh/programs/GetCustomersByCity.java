/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 01:50 PM
 *   File: GetCustomersByCity
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;

public class GetCustomersByCity {
    public static void main(String[] args) {
        CustomerDao dao = DaoFactory.getCustomerDao();
    }
}
