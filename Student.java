package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName() 
	{
		System.out.println("Student Name is - student1");
	}
	public void studentDept() 
	{
		System.out.println("Student Dept is - Testing");
	}
	public void studentId() 
	{
		System.out.println("Student Id is - 101");
	}
	public static void main(String[] args) 
	{
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	}

}
