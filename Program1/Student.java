public class Student {
    private String studentId;
    private String name;
    private int age;
    private String department;

    public Student(String studentId, String name, int age, String department) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "studentId = " + studentId + ", name = " + name  + ", age = " + age + ", department = " + department  ;
    }
}
