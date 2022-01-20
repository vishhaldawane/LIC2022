import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		
		//1. load the driver
		try
		{
			System.out.println("1. Trying to load the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver Loaded...");
			
			System.out.println("2. Trying to connect to the db");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected to the DB ");
			
			PreparedStatement pst = conn.prepareStatement("update dept_lic set deptname=?, deptloc=? where deptno=?");
			
			System.out.println("3. PreparedStatement created...");
			

			pst.setString(1, "MedicalInsurance");
			pst.setString(2, "BORIVALI");
			pst.setInt(3, 67);
			
			
			System.out.println("4. Query being fired....");
			int rows  = pst.executeUpdate();
			System.out.println("5. rows updated...."+rows);
			
			
			
			pst.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("SQL Exception "+e);
		}
	}
}

// for hsqldb DB
//Driver    : org.hsqldb.jdbc.JDBCDriver
//DB URL    : jdbc:hsqldb:hsql://localhost/mydb
//User name : SA
//Password  : 

/*
 * CREATE TABLE DEPT_LIC
(
   DEPTNO INT,
   DEPTNAME VARCHAR(20),
   DEPTLOC VARCHAR(20)
)
 * 
 */

// for Oracle DB
//Driver    : oracle.jdbc.OracleDriver
//DB URL    : jdbc:oracle:thin:@localost:1521:oraDBNameHere
//User name : oracle user 
//Password  : oracle password

/*


CREATE TABLE DEPT_LIC
(
   DEPTNO NUMBER,
   DEPTNAME VARCHAR2(20),
   DEPTLOC VARCHAR2(20)
)

INSERT INTO DEPT_LIC VALUES (10,'IT','NEW YORK');
INSERT INTO DEPT_LIC VALUES (20,'SALES','NEW PANVEL');
INSERT INTO DEPT_LIC VALUES (30,'QMS','NEW MUMBAI');
INSERT INTO DEPT_LIC VALUES (40,'TESTING','NEW DELHI');
INSERT INTO DEPT_LIC VALUES (50,'ACCOUNTS','NEW PUNE');


CREATE TABLE student
(
   std varchar2(10),
   div varchar2(5),
   rollno NUMBER,
   
   studname VARCHAR2(20),
   marks number,
   primary key (std,div,rollno)
)

select * from student
where std='X';

select * from student
where std='X' and div='A';

select * from student
where std='X' and div='A' and rollno=1;



*/
