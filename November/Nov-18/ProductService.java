import java.sql.*;

public class ProductService {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Jaffa@1977");
        Statement stmt = con.createStatement();
        
        // Insert new record
        String insertQuery = "INSERT INTO student VALUES (4, 'John Smith', 85.5)";
        stmt.executeUpdate(insertQuery);
        
        // Update existing record
        String updateQuery = "UPDATE student SET name='Jane Doe', marks=92.0 WHERE id=4";
        stmt.executeUpdate(updateQuery);
        
        // Display updated records
        getAllProducts(stmt);
        
        // Close resources
        stmt.close();
        con.close();
    }

    public static void getAllProducts(Statement stmt) throws SQLException {
    String selectQuery = "SELECT * FROM student";
    ResultSet rs = stmt.executeQuery(selectQuery);
    
    while(rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name"); 
        double marks = rs.getDouble("marks");
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
    rs.close();
    }    
    public static void insertStudent(Statement stmt, int id, String name, double marks) throws SQLException {
        String query = String.format("INSERT INTO student VALUES (%d, '%s', %f)", id, name, marks);
        stmt.executeUpdate(query);
    }
    
    public static void updateStudent(Statement stmt, int id, String name, double marks) throws SQLException {
        String query = String.format("UPDATE student SET name='%s', marks=%f WHERE id=%d", name, marks, id);
        stmt.executeUpdate(query);
    }
}    