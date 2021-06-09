package com.cyient.student;

public class Student 
{
         public int RollNo;
         public String StName;
         public String StEMailId;
         public String StAddress;
         public double StPercent;
         public static String ScAddress;
         public static String ScName;
 
 
         public static void printStudentsDetails(Student s)
         {
                System.out.println("Roll No of the Student:" +s.RollNo);
                System.out.println("Name of the Student:" +s.StName);
                System.out.println("Email Id of the Student:" +s.StEMailId);
                System.out.println("Address of the Student:" +s.StAddress);
                System.out.println("Percentage of the Student:" +s.StPercent);

                System.out.println("School Address:" +Student.ScAddress);
                System.out.println("School Name:" +Student.ScName);  
         }
}
