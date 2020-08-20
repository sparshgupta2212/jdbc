import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DatabaseHelper extends connection{
    void insert(int id, String name) throws SQLException {
            String sql = "Insert into table_name values(?,?)";
            int row=0;
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,id);
        pst.setString(2,name);
        row +=pst.executeUpdate();
        System.out.println(row+" rows inserted");
    }
    boolean update(int bid, String bname) throws SQLException {
        String sql = "update table_name set name=? where id =?";
        PreparedStatement pst =conn.prepareStatement(sql);
        pst.setString(1,bname);
        pst.setInt(2,bid);
        int row=pst.executeUpdate();
        return row>=1;
    }
    void display() throws SQLException {
        String sql = "select * from table_name";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet result = pst.executeQuery();
        while (result.next()){
            System.out.println("id "+result.getInt(1)+" Name "+result.getString(2)+", ");
        }
    }
}
