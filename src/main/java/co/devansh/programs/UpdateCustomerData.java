/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 01:02 PM
 *   File: UpdateCustomerData
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;

import java.io.IOException;

public class UpdateCustomerData {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();
    }
}
