package iTLClass7;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		student Student = new student();
		Student.StudentId = 104;
		Student.StudentName = "Golam Khan";
		Student.StudentClass = "PG";
		Student.StudentMarks = 900;
	//	System.out.println("in main method");
		
		JdbcHelper helper = new JdbcHelper();
		helper.createConnection();
	//	helper.createDB();
	//	helper.insertStudent(Student);
	//	helper.UpdateStudent(851,101);
		// helper.Browse(105);
          //helper.BrowseAll();
    //       helper.Delete(104);
			helper.BrowseAll();
			helper.processTransaction();
		   	helper.closeConnection();
		
	}

}
