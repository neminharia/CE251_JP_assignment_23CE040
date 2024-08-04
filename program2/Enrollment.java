public class Enrollment {
    private int[][] studentCourses;
    private int[] count;

    public Enrollment(int maxStudents, int maxCourses) {
        studentCourses = new int[maxStudents][maxCourses];
        count = new int[maxStudents];
    }

    public void enroll(int studentID, int courseID) {
        if (count[studentID] < studentCourses[studentID].length) {
            studentCourses[studentID][count[studentID]++] = courseID;
            System.out.println("Student " + studentID + " enrolled in course " + courseID);
        } else {
            System.out.println("Student " + studentID + " cannot enroll in more courses.");
        }
    }

    public void drop(int studentID, int courseID) {
        boolean found = false;
        for (int i = 0; i < count[studentID]; i++) {
            if (studentCourses[studentID][i] == courseID) {
                found = true;
                for (int j = i; j < count[studentID] - 1; j++) {
                    studentCourses[studentID][j] = studentCourses[studentID][j + 1];
                }
                count[studentID]--;
                System.out.println("Student " + studentID + " dropped course " + courseID);
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + studentID + " is not enrolled in course " + courseID);
        }
    }

    public void getEnrolledCourses(int studentID, Cource[] courseCatalog) {
        if (count[studentID] > 0) {
            System.out.println("Student " + studentID + " is enrolled in the following courses:");
            for (int i = 0; i < count[studentID]; i++) {
                for (Cource course : courseCatalog) {
                    if (course.getCourseID() == studentCourses[studentID][i]) {
                        System.out.println(course);
                    }
                }
            }
        } else {
            System.out.println("Student " + studentID + " is not enrolled in any courses.");
        }
    }

}
