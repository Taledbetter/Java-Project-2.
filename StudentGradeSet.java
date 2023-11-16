//Project 2 Grade calculating program
//Filename: StudentGradeSet.java
//Name:Tiffany Ledbetter
//Date: 10/25/2023

import java.time.LocalDateTime;

public class StudentGradeSet
{
    private String firstName;
    private String lastName;
    private String studentID;
    private double labAvg;
    private double projectAvg;
    private double testAvg;
    private double finalExamGrade;
    private double courseGrade;
    private LocalDateTime date;
    
    public StudentGradeSet(String fName, String lName, String iD, double lab, double project, double test, double finalExam, double grade)
   {
      firstName = fName;
      lastName = lName;
      studentID = iD;
      labAvg = lab;
      projectAvg = project;
      testAvg = test;
      finalExamGrade = finalExam;
      courseGrade = grade;
      date = LocalDateTime.now();
   }
   public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public double getLabAvg()
    {
        return labAvg;
    }

    public double getProjectAvg()
    {
        return projectAvg;
    }

    public double getTestAvg()
    {
        return testAvg;
    }

    public double getFinalExamGrade()
    {
        return finalExamGrade;
    }

   public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setStudentID(String iD) {
        studentID = iD;
    }

    public void setLabAvg(double lab) {
        labAvg = lab;
    }

    public void setProjectAvg(double project) {
        projectAvg = project;
    }

    public void setTestAvg(double test) {
        testAvg = test;
    }

    public void setFinalExamGrade(double finalExam) {
        finalExamGrade = finalExam;
    }

    public double calculateFinalGrade() {
        return (labAvg * 0.3) + (projectAvg * 0.3) + (testAvg * 0.3) + (finalExamGrade * 0.1);
    }

    public boolean passingGrade() {
        return calculateFinalGrade() >= 60;
    }

    public LocalDateTime getDate() {
        return date;
    }
}