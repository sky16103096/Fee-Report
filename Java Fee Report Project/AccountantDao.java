import java.sql.*;
import java.util.*;

public class AccountantDao
{
  //------------ 1. Getting a connection ------------
  public static Connection getCon()
  {
    Connection con=null;

    try
    {
      //This Class is present in java.lang package and automatically imported
      //forName() method does, is just return the Class object for the paramater that was loaded by the class loader.
      //So then what happens is you call Class.forName(...) it returns com.mysql.jdbc.Driver.class.
      Class.forName("com.mysql.cj.jdbc.Driver");
      //jdbc:mysql://localhost:3306/phpmyadmin
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phpmyadmin","root","");
    }
    catch(Exception e)
    {      System.out.println(e);    }

    return con;
  }

  //------------ 2. Validate Accountant------------
  public static boolean validate(String name, String password)
  {
    boolean status = false;

    try
    {
      //Creating a Connection
      Connection con = getCon();
      //Prepared STatements
      PreparedStatement ps = con.prepareStatement("select * from feereport_accountant where name=? and password=?");
      ps.setString(1,name);
      ps.setString(2,password);
      //Result Set
      ResultSet rs = ps.executeQuery();
      //Checking Status
      status = rs.next();
      //CLosing the Connection
      con.close();
    }
    catch(Exception e)
    {      System.out.println(e);    }

    return status;
  }

  //------------ 3. Saving Accountant Details Into The Database------------
  public static int save(Accountant A)
  {
    int status = 0;
    try
    {
      //Getting the connection
      Connection con = getCon();
      //Prepared Statements --> In this we are sending the data from class into database
      PreparedStatement ps = con.prepareStatement("insert into feereport_accountant(name,password,email,contactno) values(?,?,?,?)");
      ps.setString(1,A.getName());
      ps.setString(2,A.getPassword());
      ps.setString(3,A.getEmail());
      ps.setString(4,A.getContactno());
      //Checking status
      status = ps.executeUpdate();
      //Closing the connection
      con.close();
    }
    catch(Exception e)
    {      System.out.print(e);    }

    return status;
  }

  //------------ 4. View ------------
  public static List<Accountant> view()
  {
    List<Accountant> list = new ArrayList<>();

    try
    {
      //Get a Connection
      Connection con = getCon();
      //PrepareStatements
      PreparedStatement ps = con.prepareStatement("select * from feereport_accountant");
      //Result Set
      ResultSet rs = ps.executeQuery();
      //Fetching the details and adding it to the list
      while(rs.next())
      {
        Accountant A = new Accountant();
        A.setId(rs.getInt(1));
        A.setName(rs.getString(2));
        A.setPassword(rs.getString(3));
		A.setEmail(rs.getString(4));
		A.setContactno(rs.getString(5));
		list.add(A);
      }
      con.close();
    }
    catch(Exception e)
    {      System.out.println(e);    }

    //Returning the List prepared
    return list;
  }
}
