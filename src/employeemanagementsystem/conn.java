/* This class is responsible for establishing connection between Database and a Java Application */
package employeemanagementsystem;

/*Importing SQL library, there are classes - Connection, Statement*/
import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;
    
    //Declaring a method//
    public conn()
    {
        try
        {
           /*Location of the driver in the computer*/
           Class.forName("com.mysql.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "KirtiChaudhari@95");
           s = c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
