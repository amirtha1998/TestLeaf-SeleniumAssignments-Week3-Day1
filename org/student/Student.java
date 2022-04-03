package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Sudent Name called");
	}

	public void studentDept() {
		System.out.println("Student Department method");
	}

	public void studentId() {
		System.out.println("StudentId Method");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
		stud.deptName();
		stud.collegeRank();
		stud.collegeName();
		stud.collegeCode();
	}
}
