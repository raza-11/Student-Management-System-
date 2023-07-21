package com.studentdatabaseapp;
/*
Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.*/
import java.io.*;
import java.util.Scanner; 
class WorkerDetail 
  { 
      int salary; 
      String empName; 
      String DOJ;
      void SetData() 
     
        { 
           Scanner sc=new Scanner(System.in);
           
            System.out.println("Enter Employee name :"); 
            empName=sc.next(); 
          System.out.println("Enter Basic Salary "); 
           salary=sc.nextInt();
           System.out.println("Enter Employee Date of Joining :"); 
           DOJ=sc.next(); 
             
        } 
           void ShowDetail() 
           { 
              System.out.println("Name :"+ empName); 
           
              System.out.println("Salary :"+salary); 
              System.out.println("Date of Joining : "+DOJ); 
           } 
 } 
         public  class EmployeesArrayofObjects 
             { 
                 public static void main(String args[]) 
                    { 
                       int i; 
                         
                        	 Scanner sc=new Scanner(System.in);
                        	 System.out.println("Enter size of array");
                        	 int size=sc.nextInt();
                        	 //Array of object to store the employee data
                               WorkerDetail Worker[]=new WorkerDetail[size]; 
                               System.out.println("Enter the Details of  Workers"); 
                               for(i=0;i<Worker.length;i++) 
                                   { 
                                       Worker[i]=new WorkerDetail(); 
                                       Worker[i].SetData(); 
                                   } 
                                      System.out.println("The details of  Worker are :"); 
                                      for(i=0;i<Worker.length;i++) 
                                           { 
                                               Worker[i].ShowDetail(); 
                                            } 
                           } 
                                
                    }             