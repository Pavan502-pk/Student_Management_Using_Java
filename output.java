import java.sql.*;
import java.io.*;
class output
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
String query="select * from registration";
rs=s.executeQuery(query);
while(rs.next())
{
String pins=rs.getString("pin");
if(pin.equals(pins))
{
System.out.println("Name:"+rs.getString("name"));
System.out.println("Father's Name:"+rs.getString("father_name"));
String datea=rs.getString("dob");
System.out.println("Age:");
System.out.println("Contact Number:"+rs.getLong("contact_no"));
System.out.println("E-mail id:"+rs.getString("email_id"));
break;
}
}
}
catch(Exception e)
{
System.out.println("error occurs:"+e);
}
}
}