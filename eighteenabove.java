import java.sql.*;
import java.io.*;
import java.util.*;
class eighteenabove
{
 public static void main(String ar[])throws Exception
 {
try
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
Statement s=con.createStatement();
ResultSet rs;
System.out.println("******STUDENTS ABOVE 18 YEARS*******");
String query="select * from registration where age>=18";
rs=s.executeQuery(query);
int count=0;
while(rs.next())
{
System.out.println("Name:"+rs.getString("name"));
System.out.println("Pin:"+rs.getString("pin_no"));
System.out.println("Father's Name:"+rs.getString("father_name"));
System.out.println("Date of birth:"+rs.getString("dob"));
System.out.println("Age:"+rs.getInt("age"));
System.out.println("Contact Number:"+rs.getLong("contact_no"));
System.out.println("E-mail id:"+rs.getString("email_id"));
count++;
System.out.println("---------------------------------------");
}
System.out.println("----------STUDENTS COUNT---------");
System.out.println("Number of students="+count);
}
catch(Exception e)
{
System.out.println("error occurs:"+e);
}
}
}