import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    Connection conn = null;
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/boc","root","");
            //JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException q){
            JOptionPane.showMessageDialog(null, q);
            return null;
        }
    }
}






















