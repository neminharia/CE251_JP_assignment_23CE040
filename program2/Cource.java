public class Cource {
    private int courseID;
    private String courseName;
    private int credits;

    public Cource(int courseID, String courseName, int credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }
    public String toString() {
        return "CourseID: " + courseID + ", CourseName: " + courseName + ", Credits: " + credits;
    }
    
}
