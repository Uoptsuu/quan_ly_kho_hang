
package QLKHModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseModel {
    
    protected Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String urlDB = "jdbc:sqlserver://localhost:1433; databaseName=quan_ly_kho_hang; encrypt=false";
            String userName = "sa";
            String passwordUser = "123456";
            conn = DriverManager.getConnection(urlDB, userName, passwordUser);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return conn;
    }
}
