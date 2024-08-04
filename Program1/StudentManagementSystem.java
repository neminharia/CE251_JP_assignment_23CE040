
public class StudentManagementSystem {
    private Student[] students;
    private int count;

    public StudentManagementSystem(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more students.");
        }
    }

    public Student getStudent(String studentId) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                return students[i];
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }   

}
