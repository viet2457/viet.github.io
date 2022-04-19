package ck2;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class connect {
    private static String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
 
   
    public static void main(String args[]) {
        try {
            
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            
            Statement stmt = conn.createStatement();
          
            ResultSet rs = stmt.executeQuery("select * from chat");
           
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
 
    
    public static Connection getConnection(String dbURL, String userName, 
        String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        
        return conn;
    }
}
