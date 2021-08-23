package week3.day1.assignments;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student information");

	}

	public void getStudentInfo(int studentId) {
		System.out.println("ID of the student is " + studentId);
	}

	public void getStudentInfo(int studentId, String studentName) {
		System.out.println("Id of the Student is " + studentId);
		System.out.println("Name of the Student is " + studentName);
	}

	public void getStudentInfo(String emailId, long phoneNumber) {
		System.out.println("Email address of student is " + emailId);
		System.out.println("Phone number of student is " + phoneNumber);
	}

	public static void main(String[] args) {
		Students objStuds = new Students();
		objStuds.getStudentInfo();
		objStuds.getStudentInfo(379215);
		objStuds.getStudentInfo(589624, "Divya");
		objStuds.getStudentInfo("test35@gmail.com", 98840884752L);
	}
}
