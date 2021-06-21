import java.sql.*;
import java.io.*;
import java.util.*;
import java.time.*;
class newage
{
 public static void main(String ar[])throws Exception
 {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
  PreparedStatement ps=con.prepareStatement("insert into sadate values(?,?,?)");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name:");
String name=br.readLine();
ps.setString(1,name);
System.out.println("enter your dob:");
String x=br.readLine();
LocalDate da= LocalDate.parse(x);
Period a=Period.between(da,LocalDate.now());
System.out.println("Your age is:"+a.getYears());
int z=a.getYears();
ps.setInt(2,z);
ps.setString(3,x);
ps.executeUpdate();
con.close();
}
}