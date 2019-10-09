
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class db 
{
    Connection conn=null;
    public static Connection db_java()
    {
        try 
        {
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\Belgeler\\New Folder\\PayPos\\paypos.sqlite");
         return conn;
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
