public class Grade {
    private int studentId;
    private int courseId;
    private char grade;

    public Grade(int studentId, int courseId, char grade) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public char getGrade() {
        return grade;
    }

    public String toString() {
        return "studentId = " + studentId + ", courseId = " + courseId + ", grade = " + grade ;
    }
}
