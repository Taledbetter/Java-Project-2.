//Project 2 Grade calculating program
//Filename: GradeApp.java
//Name:Tiffany Ledbetter
//Date: 10/25/2023

import java.util.Scanner;

public class GradeApp
{
   public static void main(String[] args)
   {
      displayGreeting();
      StudentGradeSet Student1 = getStudentData();
      StudentGradeSet Student2 = getStudentData();
      
      displayStudentGrades(Student1);
      displayStudentGrades(Student2);
   }
   public static StudentGradeSet getStudentData()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the Student's First Name: ");
      String fName = input.nextLine();
      System.out.print("Enter the Student's Last Name: ");
      String lName = input.nextLine();
      System.out.print("Enter the Student's ID number: ");
      String studentID = input.nextLine();
      System.out.print("Enter the Student's Lab average: ");
      double lab = input.nextDouble();
      System.out.print("Enter the Student's Project average: ");
      double project = input.nextDouble();
      System.out.print("Enter the Student's Test average: ");
      double test = input.nextDouble();
      System.out.print("Enter the Student's Final Exam Grade: ");
      double finalExam = input.nextDouble();
      
      double courseGrade = (lab * 0.3) + (project * 0.3) + (test * 0.3) + (finalExam * 0.1);
      
      StudentGradeSet student = new StudentGradeSet(fName, lName, studentID, lab, project, test, finalExam, courseGrade);
      return student;      
   }
      
   public static void displayGreeting()
   {
      System.out.println("Hello! Welcome to the Student Grading Program!");
   }
   
   public static void displayStudentGrades(StudentGradeSet Student)
   {
      System.out.println("Date and Time: " + Student.getDate());
      System.out.println("Student's first name: " + Student.getFirstName());
      System.out.println("Students last name: " + Student.getLastName());
      System.out.println("Student's ID: " + Student.getStudentID());
      System.out.println("Lab Average:" + Student.getLabAvg());
      System.out.println("Project Average: " + Student.getProjectAvg());
      System.out.println("Test Average: " + Student.getTestAvg());
      System.out.println("Final Exam Grade: " + Student.getFinalExamGrade());
      System.out.println("Course Grade: " + Student.calculateFinalGrade());
      System.out.println("Is the Student passing? " + Student.passingGrade());

   }   
}   
