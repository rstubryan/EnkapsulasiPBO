
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String name = input.nextLine();
        System.out.print("Masukan NIM/NIDN : ");
        String nim = input.nextLine();
        System.out.print("Masukan Role (student/teacher) : ");
        String type = input.nextLine();
        if (type.equals("student")) {
            Student student = new Student(name, nim);
            System.out.print("Banyak Mata Kuliah : ");
            int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print("Masukan nama Mata Kuliah ke-"+ (i+1) +" : ");
                String course = input.next();
                System.out.print("Masukan nilai Mata Kuliah ke-"+ (i+1) +" : ");
                double grade = input.nextDouble();
                student.addCourseGrade(course, grade);
            }
            student.printGrades();
            System.out.print("Nilai Rata - ratanya yaitu " + student.getAverageGrade());
        } 
        else if (type.equals("teacher")) {
            Teacher teacher = new Teacher(name, nim);
            System.out.print("Masukan jumlah Mata Kuliah yang diajar : ");
            int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print("Masukan nama Mata Kuliah ke-"+ (i+1) +" : ");
                String course = input.next();
                if (teacher.addCourse(course)) {
                    System.out.println("Mata Kuliah "+ course + " ditambahkan\n");
                } 
                else {
                    System.out.println("Mata Kuliah "+ course + " sudah ada tidak bisa ditambahkan lagi\n");
                }
                teacher.printCourses();
                teacher.addCourse(course);
            }
            System.out.print("Masukan jumlah Mata Kuliah yang akan dihapus : ");
            num = input.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print("Masukan nama Mata Kuliah ke-"+ (i+1) +" : ");
                String course = input.next();
                if (teacher.removeCourse(course)) {
                    System.out.print("Mata Kuliah "+ course +" dihapus\n");
                } 
                else {
                    System.out.print("Mata Kuliah "+ course +" tidak ada, tidak bisa dihapus\n");
                }
                teacher.printCourses();
            }
        }
    }
}
