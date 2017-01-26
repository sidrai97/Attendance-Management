/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancesystem;

/**
 *
 * @author pc
 */

import java.sql.*;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
   /* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    System.out.println("driver used");
    //Connection con=DriverManager.getConnection("jdbc:odbc:Sas");
    Connection con=DriverManager.getConnection("jdbc:odbc:Sas","pc","spit123");
    System.out.println("connection established");
    */

    //oracle db connection new

    Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("\nDriver used");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jarvis");
    System.out.println("\nConnection established");


    Statement st=con.createStatement();
   /*
    String s1,s2,s3,s4;
    s1="create table teacher(tid int primary key,tname char(20),tpwd char(20));";
    s2="create table student(sid int primary key,sname char(20),sbranch char(5),semester int,spwd char(50));";
    s3="create table subject(subjid int,subjname char(15),sem int,branch char(5),tid int);";
    s4="create table attendance(sid int,subjid int,status number,p_date date);";
    st.execute(s1);
    st.execute(s2);
    st.execute(s3);
    st.execute(s4);
    */
    new Login().setVisible(true);

    }

}
