/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class Teacher extends Person {
    int numCourses;   
   String[] courses; 
   private static final int MAX_COURSES = 5; 
    boolean removeCourse;
   
   public Teacher(String name, String address) {
      super(name, address);
      numCourses = 0;
      courses = new String[MAX_COURSES];
   }
   
   @Override
   public String toString() {
      return "Dosen : " + super.toString();
   }
   
   public boolean addCourse(String course) {
      for (int i = 0; i < numCourses; i++) {
         if (courses[i].equals(course)) return false;
      }
      courses[numCourses] = course;
      numCourses++;
      return true;
   }
   
   public void printCourses() {
        System.out.println("=================================================");
        System.out.println("Mata kuliah yang diajar yaitu : ");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i]);
        }
        System.out.println("=================================================");
    }
   public boolean removeCourse(String course) {
      boolean found = false;
      int courseIndex = -1;  
      for (int i = 0; i < numCourses; i++) {
         if (courses[i].equals(course)) {
            courseIndex = i;
            found = true;
            break;
         }
      }
      if (found) {
         for (int i = courseIndex; i < numCourses-1; i++) {
            courses[i] = courses[i+1];
         }
         numCourses--;
         return true;
      } else {
         return false;
      }
   }
}