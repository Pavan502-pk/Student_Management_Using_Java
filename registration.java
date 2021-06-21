import java.sql.*;
import java.io.*;
import java.util.*;
import java.time.*;
class registration
{
 public static void main(String ar[])throws Exception
 {
try
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
  PreparedStatement ps=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
PreparedStatement pp=con.prepareStatement("insert into address values(?,?,?,?,?,?,?,?)");
PreparedStatement pm=con.prepareStatement("insert into marks values(?,?,?,?,?,?,?)");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("-----------Student registration form------------");
  System.out.println("------------------GENERAL DATA--------------------");
System.out.println("Enter your name: ");
String n=br.readLine();
System.out.println("Enter your pin_no: ");
String p=br.readLine();
System.out.println("Enter your father's name: ");
String f=br.readLine();
System.out.println("Enter your ssc hall ticket no:");
Long tht=Long.parseLong(br.readLine());
System.out.println("Enter your ssc marks percentage:");
int per=Integer.parseInt(br.readLine());
System.out.println("Enter your polycet hall ticket no:");
Long pht=Long.parseLong(br.readLine());
System.out.println("Enter your religion:");
String rel=br.readLine();
System.out.println("Enter your caste:");
String cas=br.readLine();
System.out.println("Enter your gender (m/f):");
String gen=br.readLine();
System.out.println("Enter your D.O.B:");
String dob=br.readLine();
LocalDate da= LocalDate.parse(dob);
Period a=Period.between(da,LocalDate.now());
int z=a.getYears();
System.out.println("Enter your D.O.JOIN:");
String doj=br.readLine();
System.out.println("Enter your Aadhaar no:");
Long adr=Long.parseLong(br.readLine());
System.out.println("Enter your Admission no:");
Long adm=Long.parseLong(br.readLine());
System.out.println("Enter your Contact no:");
Long cnt=Long.parseLong(br.readLine());
System.out.println("Enter your E-mail id:");
String email=br.readLine();
System.out.println("Enter your Fee amount:");
int fee=Integer.parseInt(br.readLine());
ps.setString(1,n);
ps.setString(2,p);
ps.setString(3,f);
ps.setLong(4,tht);
ps.setInt(5,per);
ps.setLong(6,pht);
ps.setString(7,rel);
ps.setString(8,cas);
ps.setString(9,gen);
ps.setString(10,dob);
ps.setString(11,doj);
ps.setLong(12,adr);
ps.setLong(13,adm);
ps.setLong(14,cnt);
ps.setString(15,email);
ps.setInt(16,fee);
ps.setInt(17,z);
System.out.println("done");
int x=ps.executeUpdate();
System.out.println("------------------ADDRESS FIELD--------------------");
pp.setString(1,p);
System.out.println("Enter your Door no:");
String dn=br.readLine();
System.out.println("Enter your Street:");
String st=br.readLine();
System.out.println("Enter your Village:");
String vil=br.readLine();
System.out.println("Enter your Town:");
String tn=br.readLine();
System.out.println("Enter your District:");
String dis=br.readLine();
System.out.println("Enter your State:");
String sta=br.readLine();
System.out.println("Enter your Pin code:");
int pc=Integer.parseInt(br.readLine());
pp.setString(2,dn);
pp.setString(3,st);
pp.setString(4,vil);
pp.setString(5,tn);
pp.setString(6,dis);
pp.setString(7,sta);
pp.setInt(8,pc);
int y=pp.executeUpdate();
System.out.println((x+y)+" rows updated");
ps.close();
pp.close();
pm.close();
con.close();
}
catch(Exception e)
{
System.out.println("error occurs:"+e);
}
}
}











