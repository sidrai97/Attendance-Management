/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancesystem;
import java.sql.*;
/**
 *
 * @author pc
 */
public class AccessConnect {

    AccessConnect()
    { }
    Statement connecttoSAS() throws Exception
    {
        /*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   System.out.println("driver used");
    //Connection con=DriverManager.getConnection("jdbc:odbc:Sas");
    Connection con=DriverManager.getConnection("jdbc:odbc:Sas","pc","spit123");
   System.out.println("connection established");
    Statement st=con.createStatement();
    return(st);
         *
         */
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("\nDriver used");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jarvis");
        System.out.println("\nConnection established");
        
        Statement st=con.createStatement();
        return(st);
    }
    Connection connecttoSAS1() throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   System.out.println("driver used");
    //Connection con=DriverManager.getConnection("jdbc:odbc:Sas");
    Connection con=DriverManager.getConnection("jdbc:odbc:Sas","pc","spit123");
   System.out.println("connection established");
    PreparedStatement st=con.prepareStatement(null);
    return(con);
    }
}
