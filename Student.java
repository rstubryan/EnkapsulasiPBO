/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class Student extends Person {
    private String[] courses = new String[30];
    private double[] grades = new double[30];
    private int numCourses = 0;

    public Student(String name, String nim) {
        super(name, nim);
    }

    @Override
    public String toString() {
      return "Student : " + super.toString();
   }
   
    public void addCourseGrade(String course, double grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    
    public void printGrades() {
        System.out.println("=================================================");
        System.out.println("Mata Kuliah yang diambil yaitu : ");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + " " + grades[i]);
        }
        System.out.println("=================================================");
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return sum / numCourses;
    }
}
