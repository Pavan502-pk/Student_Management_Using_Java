import java.sql.*;
import java.io.*;

public class dat{
    public static void main(String args[])throws Exception
    {       
       try
       {
System.out.println("sa8i");
           Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("sa8i");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password");
           Statement st=con.createStatement();
            st.executeUpdate("create table studentdetails(name varchar(40),id varchar(15),father varchar(40),hall10th varchar(15),pre10th varchar(4),polycethall varchar(15),region varchar(10),cast varchar(10),gender varchar(10),dob varchar(15),dateofjoin varchar(15),aadhar varchar(15),admission varchar(10),phon varchar(15),email varchar(40),fee varchar(10),PRIMARY Key(id))");
           st.executeUpdate("create table addresss(pin varchar(15),door varchar(20),street varchar(20),village varchar(20),town varchar(20),state varchar(20),pincode varchar(10),district varchar(20),FOREIGN KEY(pin)  references studentdetails(id) )");
            st.executeUpdate("create table sem1(roll varchar(15),eng int,mat1 int,ps int,chem int,bce int,pc int,draw int,pcl int,psl int,cheml int,bcel int,tot int,pf varchar(5),FOREIGN KEY(roll)  references studentdetails(id))");
	st.executeUpdate("create table sem3(sroll varchar(15),math2 int,deca int,os int,ds int,dbms int,dsl int,dbmsl int,communicationl int,del int,tot int,pf varchar(5),FOREIGN KEY(sroll)  references studentdetails(id));");
	st.executeUpdate("create table sem4(ssroll varchar(15),chn int,oops int,se int,mp int,wd int,wdl int,javal int,chnl int,mpl int,total int,pf varchar(5),FOREIGN KEY(ssroll)  references studentdetails(id))");
	st.executeUpdate("create table sem6(ipin varchar(15),it int,total int,pf varchar(4),FOREIGN KEY(ipin)  references studentdetails(id))");
           System.out.println("created");
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
}
}
