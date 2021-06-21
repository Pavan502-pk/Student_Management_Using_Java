import java.sql.*;
class sample
{
 public static void main(String ar[])throws Exception
 {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
  Statement stmt=con.createStatement();
  int i=stmt.executeUpdate("insert into registration values('johncena',134007,'brucelee',1234256,90,545296212,'christian','bc-a','m','17-jul-02','10-JUN-12',153459423,45453438,334343269,'jonnn@gmail.com',600)");
System.out.println(i+" rows updated");
stmt.close();
con.close();
}
}











