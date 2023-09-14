package javacrud;

public class student {
	private int studentId;
	private String studentname;
	private String studentphone;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String studentname, String studentphone) {
		super();
		this.studentname = studentname;
		this.studentphone = studentphone;
	}
	public student(int studentId, String studentname, String studentphone) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentphone = studentphone;
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ "]";
	}


}
