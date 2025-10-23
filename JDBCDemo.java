package JDBC;
import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args)throws Exception {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	String userName="root";
	String passWord="Saravanan_2005";
	String query="select*from employee";
	
	Connection con=DriverManager.getConnection(url,userName,passWord);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	System.out.println("id is="+rs.getInt(1));
	System.out.println("Name is="+rs.getString(2));
	System.out.println("Salary is="+rs.getInt(3));
    con.close();
	}

}
