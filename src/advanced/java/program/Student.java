package advanced.java.program;

public class Student {

	private String stuname;  
	private int stuage;  
	private String stuemail;
	private String studept;
	private String stucourse;
	private String stuid;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public String getStuemail() {
		return stuemail;
	}
	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}
	public String getStudept() {
		return studept;
	}
	public void setStudept(String studept) {
		this.studept = studept;
	}
	public String getStucourse() {
		return stucourse;
	}
	public void setStucourse(String stucourse) {
		this.stucourse = stucourse;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	@Override
	public String toString() {
		return "Student [stuname=" + stuname + ", stuage=" + stuage + ", stuemail=" + stuemail + ", studept=" + studept
				+ ", stucourse=" + stucourse + ", stuid=" + stuid + "]";
	}
	

}
