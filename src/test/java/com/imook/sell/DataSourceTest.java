package com.imook.sell;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import javax.sql.DataSource;
import java.sql.Connection;


/**
 * @ClassName DataSourceTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataSourceTest {
    @Autowired
    DataSource da;
    @Test
    public void DataSourceTest() throws Exception{
        Connection con = da.getConnection();
        System.out.print(con);
        System.out.print("++++++++++++++++++++++");
        con.close();
    }

}
