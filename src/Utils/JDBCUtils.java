package Utils;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * @program: Body
 * @description: JDBC工具类
 * @author: Wang Jun
 * @create: 2020-04-04 20:42
 */
public class JDBCUtils {
    private static BasicDataSource dataSource = new BasicDataSource();
    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/body");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
}
