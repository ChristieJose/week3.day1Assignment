package org.student;

import org.college.College;


public class Student extends College {
	public void studentName()
	{
	System.out.println("Student name is Kartik Vasudevan");	
	}
	public void studentDept()
	{
	System.out.println("Student department is Mca");	
	}
	public void studentId()
	{
		System.out.println("Student id is 101" );
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		
		
	}
	}

