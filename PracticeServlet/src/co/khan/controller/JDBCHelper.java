package co.khan.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import co.khan.user;

public class JDBCHelper {
	
		
		Connection con;
		Statement stmt;
		PreparedStatement pStmt;
		public int i;
		boolean GrantAccess;

		public JDBCHelper()
		{
			try {
			//	Class.forName("com.mysql.jdbc.Driver");
			//	Class.forName("com.mysql.cj.jdbc.Driver");
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println(">>>>>>>>Driver loaded ");
			}
			
			catch (Exception e) 
			{
				System.out.println("Some error while loading the driver " +e);
			}
		}
		
		// 2  creating connection 
		public void createConnection()
		{
			try {
				String user = "root";
				String password = "";
				String url = "jdbc:mysql://localhost/gmk" ;
				
				con = DriverManager.getConnection(url, user, password);
				System.out.println(">>>> Connection CReated");
				
			} catch (Exception e){
				
			}
		}
		
		//3 write sql statment 
		//4 execute sql statmenet 
		
		public int insertId(user user1)
		{
			
			try {
			//	String sql = "INSERT INTO `employee`(`Eid`,`EmployeeName`, `Salary`, `email`) VALUES (102,'Zoeya Afreen',19000,'zoeya@gmail.com')";
		//	 String X = "VALUES ("+ user1.name +",'"+user1.password+"','"+user1.email+"')";
				String sql = "INSERT INTO `access`(`userid`,`password`, `email`) VALUES (?,?,?)" ;
				pStmt = con.prepareStatement(sql);
				pStmt.setString(1, user1.name);
				pStmt.setString(2, user1.password);
				pStmt.setString(3, user1.email);
				System.out.println("Inside inset Method");
			//	stmt = con.createStatement();   		
				int i = pStmt.executeUpdate();		
				if (i>=0) {
				System.out.println("<<succesfully Registered");
				}
				else {
					System.out.println("<<Some issues during Registration ");
				}
				
				
			}
			catch (Exception e) {
				System.out.println("Some error "+e);
			}
			System.out.println("Value of return code i :" +i);
			return i;
		}
		//4.1 execute sql statmenet query for a single row 
		
	public boolean Login(String userid, String password)
			{
			//	System.out.println("employee Id :" + eid);
		System.out.println("Inside Login" + userid + password );
				try {
					String sql1 = "Select * from `access` where userid=? and password=?";
					pStmt = con.prepareStatement(sql1);
					System.out.println("Before userid assignment query:::" + pStmt.toString());
					pStmt.setString(1, userid);
					pStmt.setString(2, password);
					System.out.println("After userid assignment query:::" + pStmt.toString());
					ResultSet rs = pStmt.executeQuery();
					GrantAccess = rs.next();
			//		System.out.println("Read results:"+ GrantAccess);
				    
			//		System.out.println("resultsetXXX:"+rs.getString(1));
					do {
						System.out.println("<<succesfully read user:  " + rs.getString(1));
						System.out.println("UserId  = :" + rs.getString(1));
						System.out.println("Password = :" + rs.getString(2));
						System.out.println("Email  = :" + rs.getString(3));
		
						} while (rs.next()); 
				
				
					
				}
				
				catch (Exception e){
					System.out.println("Some error "+e); 
				} 
				
				return  GrantAccess;
			}
		
		
		
	
		//5. Close Connection

			public void closeConnection(){

				try {

					con.close();

					System.out.println(">> Connection Closed");

				} catch (Exception e) {

					System.out.println("Some Exception: "+e);

				}

			}
	}


