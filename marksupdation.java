import java.sql.*;
import java.io.*;
class marksupdation
{
 public static void main(String ar[])throws Exception
 {
try
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
PreparedStatement pm=con.prepareStatement("insert into marks values(?,?,?,?,?,?,?)");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("------------------MARKS UPDATION--------------------");
System.out.println("Enter your pin_no: ");
String p=br.readLine();
System.out.println("Which semister marks you want to update");
int year=Integer.parseInt(br.readLine());
if(year==1)
{
System.out.println("Enter your 1st year marks:");
int first=Integer.parseInt(br.readLine());
pm.setInt(2,first);
}
else if(year==3)
{
System.out.println("Enter your 3rd sem marks:");
int third=Integer.parseInt(br.readLine());
pm.setInt(3,third);
}
else if(year==4)
{
System.out.println("Enter your 4th sem marks:");
int fourth=Integer.parseInt(br.readLine());
pm.setInt(4,fourth);
}
else if(year==5)
{
System.out.println("Enter your 5th sem marks:");
int fifth=Integer.parseInt(br.readLine());
pm.setInt(5,fifth);
}
else if(year==6)
{
System.out.println("Enter your 6th sem marks:");
int sixth=Integer.parseInt(br.readLine());
pm.setInt(6,sixth);
}

System.out.println("Have you recieved your original degree certificate? (y/n)");
String od=br.readLine();
pm.setString(7,od);
int z=pm.executeUpdate();
}
catch(Exception e)
{
System.out.println("error occurs:"+e);
}
}
}