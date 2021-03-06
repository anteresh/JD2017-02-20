package by.it.kolenda.jd03_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Created by user on 05.05.2017.
 */
public class ConnectionCreator {

    public static  Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (connection==null || connection.isClosed())  {
            synchronized (CN.URL_DB){
                if (connection==null || connection.isClosed())
                    connection= DriverManager.getConnection(CN.URL_DB, CN.USER_DB, CN.PASSWORD_DB);
            }
        }
        return connection;
    }

}
