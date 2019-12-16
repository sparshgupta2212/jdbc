import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection{
    public static Connection conn = null;
    void connect() throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connecting...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","");
            System.out.println("connected!");


    }


}
