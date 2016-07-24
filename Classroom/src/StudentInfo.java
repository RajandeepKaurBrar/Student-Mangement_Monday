
public class StudentInfo {
	private String StuName;
	private int stuID;
	private String studPhone;

public StudentInfo(String stuName, int stuID, String studPhone) {
		super();
		StuName = stuName;
		this.stuID = stuID;
		this.studPhone = studPhone;
	}

public void displayInfo(){
	System.out.println("Student Name:"+StuName);
	System.out.println("Student ID"+stuID);
	System.out.println("Contact Number:"+studPhone);
}

}
