import java.sql.*;
import java.io.*;
import java.util.*;
class generaloutput
{
 public static void main(String ar[])throws Exception
 {
try
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
Statement s=con.createStatement();
  ResultSet rs;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("******STUDENT PORTAL*******");
System.out.println("enter your pin_no:");
String pin=br.readLine();
String query="select * from registration,address where registration.pin_no=address.pin_no";
rs=s.executeQuery(query);
while(rs.next())
{
String pins=rs.getString("pin_no");
if(pin.equals(pins))
{
System.out.println("Name:"+rs.getString("name"));
System.out.println("Pin:"+rs.getString("pin_no"));
System.out.println("Father's Name:"+rs.getString("father_name"));
System.out.println("Date of birth:"+rs.getString("dob"));
System.out.println("Contact Number:"+rs.getLong("contact_no"));
System.out.println("E-mail id:"+rs.getString("email_id"));
System.out.println("Door number:"+rs.getString("door_no"));
System.out.println("Town:"+rs.getString("town"));
System.out.println("State:"+rs.getString("state"));
System.out.println("Pincode:"+rs.getString("pincode"));
break;
}
else
{
System.out.println("Invalid pin");
}
}
}
catch(Exception e)
{
System.out.println("error occurs:"+e);
}
}
}