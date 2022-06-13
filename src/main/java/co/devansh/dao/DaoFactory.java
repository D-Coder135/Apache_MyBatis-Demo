/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 14-06-2022/06/2022
 *   Time: 12:00 AM
 *   File: DaoFactory
 */

package co.devansh.dao;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

public final class DaoFactory {

    private DaoFactory() {
    }

    public static CustomerDao getCustomerDao() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    }
}
