import javax.xml.namespace.QName;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        connection conn = new connection();
        conn.connect();
        DatabaseHelper data = new DatabaseHelper();
        Scanner sc = new Scanner(System.in);
       System.out.println("how many entries ");
       int n = sc.nextInt();
       for (int i = 0; i < n ; i++) {
            System.out. println("enter id ");
            int id = sc.nextInt();
            System.out.println("enter name");
            String name = sc.next();
            data.insert(id, name);
       }
        System.out.println("enter the nnake");
        String bname = sc.next();
        System.out.println("ddddd");
        int bid=sc.nextInt();

        data.display();
        data.update(bid,bname);
    }
}
