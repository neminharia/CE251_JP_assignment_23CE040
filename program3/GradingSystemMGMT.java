import java.util.Scanner;

public class GradingSystemMGMT {
    public static void main(String[] args) {
        GradingSystem system = new GradingSystem(10, 20, 5);
        Scanner sc = new Scanner(System.in);
        int option;
        do 
        {
            System.out.println("Enter 1 to Add student");
            System.out.println("Enter 2 to Add grade");
            System.out.println("Enter 3 to Add course credits");
            System.out.println("Enter 4 to Calculate GPA");
            System.out.println("Enter 5 to Print grade report");
            System.out.println("Enter 6 to Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:{
                    System.out.println("Enter student id");
                    int studentId = sc.nextInt();
                    System.out.println("Enter student name");
                    String studentName = sc.next();
                    system.addStudent(new Student1(studentId, studentName));
                    break;
                }
                case 2:{
                    System.out.println("Enter student id");
                    int studentId = sc.nextInt();
                    System.out.println("Enter course id");
                    int courceId = sc.nextInt();
                    System.out.println("Enter grade");
                    char grade = sc.next().charAt(0);
                    system.addGrade(new Grade(studentId, courceId, grade));
                    break;
                }
                case 3:{
                    System.out.println("Enter course id");
                    int courseId = sc.nextInt();
                    System.out.println("Enter cource credits");
                    int credits = sc.nextInt();
                    system.addCourseCredits(courseId, credits);
                    break;
                }
                case 4:{
                    System.out.println("Enter student id");
                    int studentId = sc.nextInt();
                    double gpa = system.calculateGPA(studentId);
                    System.out.println("GPA is " + gpa);

                    break;
                }
                case 5:{
                    System.out.println("Enter student id");
                    int studentId = sc.nextInt();
                    system.printGradeReport(studentId);
                    break;
                }

                case 6:{
                    System.out.println("Exiting");
                    break;
                }
            }

        }while(option != 6);
        System.out.println("Done by Nemin Haria - 23CE040");
    }
}
