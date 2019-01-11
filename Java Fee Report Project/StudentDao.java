import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao 
{
	//------------ 1. Saving Student Details Into The Database------------
	public static int save(Student s)
	{
		int status=0;
		try{
			//Getting a Connection
			Connection con=AccountantDao.getCon();  // Query : What is AccountantDao.getCon() dong here ?
			
			//Prepared Statements -> Sending info into the database
			PreparedStatement ps=con.prepareStatement("insert into feereport_student(name,email,course,fee,paid,due,address,city,state,country,contactno) values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setInt(4,s.getFee());
			ps.setInt(5,s.getPaid());
			ps.setInt(6,s.getDue());
			ps.setString(7,s.getAddress());
			ps.setString(8,s.getCity());
			ps.setString(9,s.getState());
			ps.setString(10,s.getCountry());
			ps.setString(11,s.getContactno());
			
			//Status
			status=ps.executeUpdate();
			
			//Closing the connection
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}
		
		//Returning the status
		return status;
	}
	
	//------------ 2. Update ------------
	public static int update(Student s)
	{
		int status=0;
		try{
			//Getting a Connection
			Connection con=AccountantDao.getCon();
			
			//Prepared Statements
			PreparedStatement ps=con.prepareStatement("update feereport_student set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,city=?,state=?,country=?,contactno=? where rollno=?");
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setInt(4,s.getFee());
			ps.setInt(5,s.getPaid());
			ps.setInt(6,s.getDue());
			ps.setString(7,s.getAddress());
			ps.setString(8,s.getCity());
			ps.setString(9,s.getState());
			ps.setString(10,s.getCountry());
			ps.setString(11,s.getContactno());
			ps.setInt(12,s.getRollno());
			
			//Status
			status=ps.executeUpdate();
			
			//Connection Close
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}
		
		//Returning the status
		return status;
	}
	
	//------------ 3. View the List ------------
	public static List<Student> view()
	{
		List<Student> list=new ArrayList<Student>();
		try{
			//Getting a Connection
			Connection con=AccountantDao.getCon();
			
			//Prepared Statements
			PreparedStatement ps=con.prepareStatement("select * from feereport_student");
			
			//Result Set
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Student s=new Student();
				
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				
				//Adding the student info into the List
				list.add(s);
			}
			
			//Closing the Connection
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}
		
		//Returning the List
		return list;
	}
	
	//------------ 4. Get Student By Roll Number ------------
	public static Student getStudentByRollno(int rollno)
	{
		Student s=new Student();
		try{
			//Creating a Connection
			Connection con=AccountantDao.getCon();
			
			//Prepared Statements
			PreparedStatement ps=con.prepareStatement("select * from feereport_student where rollno=?");
			ps.setInt(1,rollno);
			
			//Result Set
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
			}
			
			//Connection Close
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}
		
		//Returning the object of Student
		return s;
	}
	
	//------------ 5. Due ------------
	public static List<Student> due()
	{
		List<Student> list=new ArrayList<Student>();
		
		try{
			//Connection
			Connection con=AccountantDao.getCon();
			
			//Prepared Staements
			PreparedStatement ps=con.prepareStatement("select * from feereport_student where due>0");
			
			//Result Set
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Student s=new Student();
				
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				
				//Adding the students with due into the list
				list.add(s);
			}
			
			//Connection Close
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}
		
		//Returning the List
		return list;
	}
}
