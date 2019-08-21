package iTLClass7;

import java.sql.*;


public class JdbcHelper {
	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;

	public JdbcHelper()
	{
		try {
		//	Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">>>>>>>>Driver loaded ");
		}
		
		catch (Exception e) 
		{
			System.out.println("Some error " +e);
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
	
	public void createDB()
	{
		try {
			String sql = "CREATE TABLE `student` ( `StudentId` INT(10) NULL DEFAULT NULL , `StudentName` VARCHAR(50) NULL DEFAULT NULL , `StudentClass` VARCHAR(5) NULL DEFAULT NULL , `StudentMarks` INT(5) NULL DEFAULT NULL ) ENGINE = InnoDB"; 
			stmt = con.createStatement();   		
			int i = stmt.executeUpdate(sql);		
			if (i==0) {
			System.out.println("<<succesfully table created");
			}
			else {
				System.out.println("<<Some issues while creating table " + i);
			}
		} catch ( Exception e)
		{
			System.out.println("Some error "+e);
		}
	}
	
  	public void insertStudent(student Student)
	{
		try {
		//	String sql = "INSERT INTO `employee`(`Eid`,`EmployeeName`, `Salary`, `email`) VALUES (102,'Zoeya Afreen',19000,'zoeya@gmail.com')";
		 String X = "VALUES ("+Student.StudentId+",'"+Student.StudentName+"','"+Student.StudentClass+"',"+Student.StudentMarks+")";
			String sql = "INSERT INTO `student`(`StudentId`,`StudentName`, `StudentClass`, `StudentMarks`) "
					+ X ;
			stmt = con.createStatement();   		
			int i = stmt.executeUpdate(sql);		
			if (i>0) {
			System.out.println("<<succesfully inserted");
			}
			else {
				System.out.println("<<Some issues while inserting ");
			}
			
			
		}
		catch (Exception e) {
			System.out.println("Some error "+e);
		}
	}
  	
  	public void UpdateStudent(int StudentMarks, int StudentId )
	{
  		System.out.println("StudentMarks== " + StudentMarks + "StudentId == " + StudentId);
		try {
		//	String sql = "INSERT INTO `employee`(`Eid`,`EmployeeName`, `Salary`, `email`) VALUES (102,'Zoeya Afreen',19000,'zoeya@gmail.com')";
		// String X = "VALUES ("+Student.StudentId+",'"+Student.StudentName+"','"+Student.StudentClass+"',"+Student.StudentMarks+")";
			String sql = "UPDATE student SET StudentMarks=? WHERE StudentId=?";
		    pStmt = con.prepareStatement(sql);
		//	stmt = con.createStatement();
			
			pStmt.setInt(1, StudentMarks);
			pStmt.setInt(2, StudentId );
			int i = pStmt.executeUpdate();
		//	int i = stmt.executeUpdate(sql);
			if (i>0) {
			System.out.println("<<succesfully updated");
			}
			else {
				System.out.println("<<Some issues while inserting ");
			}
			
			
		}
		catch (Exception e) {
			System.out.println("Some error "+e);
		}
	}
  	
  	public void Delete(int StudentId)
	{
	//	System.out.println("employee Id :" + eid);
		try {
			String sql1 = "Delete  from student where StudentId=?";
			pStmt = con.prepareStatement(sql1);
			pStmt.setInt(1, StudentId);
			int i  = pStmt.executeUpdate();	
			if ( i > 0)
			{
				System.out.println(" Deleted Emp Id  : " + StudentId );
			} else 
			{
				System.out.println(" Not deleted Emp Id  : " + StudentId );
			}
			
		}
		
		catch (Exception e){
			System.out.println("Some error "+e);
		}
	}
  	public void BrowseAll()
	{
	  System.out.println("Browse all function called ");
		try {
			String sql1 = "Select * from student";
			pStmt = con.prepareStatement(sql1);
			ResultSet rs = pStmt.executeQuery();	
			if ( rs.next() == false)
			{
				System.out.println(" No Results found for employee table :");
			} else 
			do {
			System.out.println("<<succesfully read student:  " + rs.getInt(1));
			System.out.println("StudentId  = :" + rs.getInt(1));
			System.out.println("StudentName = :" + rs.getString(2));
			System.out.println("StudentClass  = :" + rs.getString(3));
			System.out.println("StudentMarks = :" + rs.getInt(4));
			} while (rs.next());
			
		}
		
		catch (Exception e){
			System.out.println("Some error "+e);
		}
	}
	
  	public void processTransaction(){ 

  		 
 		try { 
 			 
 			String sql1 = "delete from student where StudentId=201"; 
 			String sql2 = "delete from student where StudentId=202"; 
 			 
 			stmt = con.createStatement(); 
 			con.setAutoCommit(false); 
 			 
 			// Creating a Batch 
 			stmt.addBatch(sql1); 
 			stmt.addBatch(sql2); 
 			 
 			stmt.executeBatch(); 
 		//	con.rollback();
 			con.commit(); // Make Sure the batch is executed as a transaction 
 			System.out.println("==Transaction Processed=="); 
 		} catch (Exception e) { 
 			 
 			System.out.println("Some Exception: "+e); 
 			try { 
 				con.rollback(); 
 				System.out.println("DB Changes Roll Backed !!"); 
 			} catch (SQLException e1) { 
 				e1.printStackTrace(); 
 			}  
 		} 
 	} 

		public void closeConnection(){

			try {

				con.close();

				System.out.println(">> Connection Closed");

			} catch (Exception e) {

				System.out.println("Some Exception: "+e);

			}

		}

}
