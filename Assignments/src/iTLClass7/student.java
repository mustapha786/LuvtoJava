package iTLClass7;

public class student {
	
	public int StudentId ;
	public String StudentName;
	public String StudentClass ;
	public int StudentMarks;
	
	
	public student() {
		super();
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.StudentClass = StudentClass;
		this.StudentMarks = StudentMarks;
	}


	@Override
	public String toString() {
		return "student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentClass=" + StudentClass
				+ ", StudentMarks=" + StudentMarks + "]";
	}
	
	

}
