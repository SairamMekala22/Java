import java.sql.*;
import java.sql.DriverManager;

class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Jaffa@1977");
        
    }
}