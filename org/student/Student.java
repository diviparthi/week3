package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Divya");
	}

	public void studentDept() {
		System.out.println("Student department is ECE");
	}

	public void studentId() {
		System.out.println("Student id is 600782");
	}
	public static void main(String[] args) {
		Student objStud = new Student();
		objStud.studentName();
		objStud.studentDept();
		objStud.studentId();
		objStud.deptName();
		objStud.collegeName();
		objStud.collegeCode();
		objStud.collegeRank();

	}
}

