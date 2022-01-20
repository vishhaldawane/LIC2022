import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
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
			
			PreparedStatement pst = conn.prepareStatement("insert into dept_lic values (?,?,?)");
			
			System.out.println("3. PreparedStatement created...");
			
			pst.setInt(1, 67);
			pst.setString(2, "MedInsurance");
			pst.setString(3, "Churchgate");
			
			
			System.out.println("4. Query being fired....");
			int rows  = pst.executeUpdate();
			System.out.println("5. rows created...."+rows);
			
			
			
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

*/
