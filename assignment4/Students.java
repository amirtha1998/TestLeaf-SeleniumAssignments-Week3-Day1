package week3.day1.assignment4;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student Info method");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student Info method-id");
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Info method-id,name");
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student Info method-email,phone number");
	}

	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo();
		st.getStudentInfo(1);
		st.getStudentInfo(1, "Amirthavalli");
		st.getStudentInfo("amirtha@gmail.com", "9874563210");
	}
}
