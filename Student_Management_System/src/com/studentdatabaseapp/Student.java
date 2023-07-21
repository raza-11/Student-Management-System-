package com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentID;
	private String courses=" ";
	private int tutionBalance=0;
	private  static int costOfCourse=600;
	
	private static int id=1001;
	//Constructor:prompt user to enter students name and year
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student first name:");
		
		this.firstName=in.nextLine();
	
		  System.out.println("Enter Student last name:");
		
		this.lastName=in.nextLine();
	
		 System.out.println("1-fresher \n2-Experienced \n3-Junior \n4-Senior \nEnter class level:");
		
		this.gradeYear=in.nextInt();
		
		setStudentID();	
		
	}
	
	//Generate an unique 5 digit ID 
	private void setStudentID() {
		
		id++;
		//Grade Level+id
		this.StudentID=gradeYear+"   "+id;
		
	}
	
	//Enroll in courses
	public void enroll()
	{
		do {
		System.out.println("Enter course to enroll(Q for quit)");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equals("Q")) {
			courses=courses+"\n"+course;  //5 courses 600*5=3500
			tutionBalance=tutionBalance+costOfCourse;
		}
		else {
			System.out.println("BREAK__________");
			break;
		}
		}
		while(1!='Q');
		
	
	
	}
//show the current balance after paying advance
    public void viewBalance()
    {
    	System.out.println("Your Tution fees (Total/pending)is:$"+tutionBalance);
    	
    }
    public void payTution() {
    	
    	System.out.println("Enter your payment:$");
    	Scanner s=new Scanner(System.in);
    	int payment=s.nextInt();
    	tutionBalance=tutionBalance-payment;
    	//3500-1000=2500
    	System.out.println("Thank you for payment:$"+payment);
    	viewBalance();
    	
    }
    public String toString()
    {
    	return "Name:"+firstName+" "+lastName+
    			"\nGrade Level:"+gradeYear+
    			"\nStudent ID:"+StudentID+
    			"\nCourse Enrolled:"+courses+"\nBalance is:"+tutionBalance;
    			
    }
	
	
}
