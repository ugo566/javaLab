package verify; 

public class Student {

	private static final String Student = null;
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object Oj) {
		if(Oj instanceof Student ) {
			Student student  = (Student) Oj;
		}
		return true;	
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	private void Student() {
		// TODO Auto-generated method stub	
	}
	
}

