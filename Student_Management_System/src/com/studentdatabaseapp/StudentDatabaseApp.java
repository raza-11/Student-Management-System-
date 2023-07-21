package com.studentdatabaseapp;
/*
 * . Student Management System
- Learner will be learning how to add new students to the database, how to generate a 5 digit unique
studentID for each student, how to enroll students in the given courses. Also, you will be
implementing the following operations enroll, view balance, pay tuition fees, show status, etc. The
status will show all the details of the student including name, id, courses enrolled and balance. 
 */
import java.util.Scanner;

public class StudentDatabaseApp {

	
	//Create number of new students
	
	public static void main(String []args) {
	
		
	/*Student s2=new Student();
		s2.enroll();
		s2.viewBalance();
		s2.payTution();
		System.out.println(s2.toString());*/
		
		
		//Ask how many users we want to add
		
		System.out.println("Enter number of new Students to enroll:");
		
		Scanner sc=new Scanner(System.in);
		
		int noofStudents=sc.nextInt();
		//creating array to store student size data
		Student[]students=new Student[noofStudents];
		//int[]a=new int[];

		//Create number of new students
		
		for(int n=0; n<noofStudents ;n++) {
			students[n]= new Student();//student constructor
			students[n].enroll();//enroll()method
			students[n].viewBalance();//viewBalance()method
			students[n].payTution();//payTution()method
			
		}
		for(int n=0; n<noofStudents ;n++) {
			System.out.println(students[n].toString());}
		
	
}
}