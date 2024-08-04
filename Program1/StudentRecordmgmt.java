import java.util.Scanner;

public class StudentRecordmgmt {
    public static void main(String[] args) {
        StudentManagementSystem management = new StudentManagementSystem(10); // Capacity of 10 students
    
        Scanner sc = new Scanner(System.in);
        int option;
        do 
        {
            System.out.println("Enter 1 for adding a student data");
            System.out.println("Enter 2 for getting a student data by Student id ");
            System.out.println("Enter 3 to print all student details");
            System.out.println("Enter 4 to exit");
            option = sc.nextInt();
            switch (option) {
                case 1:{
                    
                    System.out.println("Enter student id");
                    String id = sc.next();
                    System.out.println("Enter student name");
                    String name = sc.next();
                    System.out.println("Enter student age");
                    int age = sc.nextInt();
                    System.out.println("Enter student department");
                    String department = sc.next();
                    management.addStudent(new Student(id, name, age, department));
                    break;
                }
                case 2:{
                    System.out.println("Enter student id to check");
                    String id = sc.next();
                    Student student = management.getStudent(id);
                    System.out.println(student);
                    break;
                }
                case 3:{
                    management.displayAllStudents();
                    break;
                }
                case 4:{
                    System.out.println("Exiting");
                    break;
                }
            }
        }while(option != 4);
        System.out.println("Done by Nemin Haria - 23CE040");
    }
}
