public class Student1 {
    private int studentId;
    private String name;

    public Student1(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return  "studentId = " + studentId + ", name = " + name ;
    }
}
