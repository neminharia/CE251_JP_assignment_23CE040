import java.util.Scanner;
public class CourseEnrollment {
    private Cource[] courseCatalog;
    private Enrollment enrollment;

    public CourseEnrollment(Cource[] courseCatalog, int maxStudents, int maxCourses) {
        this.courseCatalog = courseCatalog;
        this.enrollment = new Enrollment(maxStudents, maxCourses);
    }
    public static void main(String[] args) {
        Cource[] courseCatalog = {
            new Cource(1, "Mathematics", 3),
            new Cource(2, "Physics", 4),
            new Cource(3, "Chemistry", 3)
        };

        int maxStudents = 100;
        int maxCourses = 10;
        CourseEnrollment courseEnrollment = new CourseEnrollment(courseCatalog, maxStudents, maxCourses);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enroll in a course");
            System.out.println("2. Drop a course");
            System.out.println("3. View enrolled courses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    int courseID = scanner.nextInt();
                    courseEnrollment.enrollment.enroll(studentID, courseID);
                    break;
                    case 2:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    courseID = scanner.nextInt();
                    courseEnrollment.enrollment.drop(studentID, courseID);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    courseEnrollment.enrollment.getEnrolledCourses(studentID, courseCatalog);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

                
                
