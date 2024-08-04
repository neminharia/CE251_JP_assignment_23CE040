class GradingSystem{
    private Student1[] students;
    private Grade[] grades;
    private int[] courseCredits;
    private int studentCount;
    private int gradeCount;

    public GradingSystem(int studentCapacity, int gradeCapacity, int courseCapacity) {
        students = new Student1[studentCapacity];
        grades = new Grade[gradeCapacity];
        courseCredits = new int[courseCapacity];
        studentCount = 0;
        gradeCount = 0;
    }

    public void addStudent(Student1 student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Student array is full. Cannot add more students.");
        }
    }

    public void addGrade(Grade grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        } else {
            System.out.println("Grade array is full. Cannot add more grades.");
        }
    }

    public void addCourseCredits(int courseId, int credits) {
        if (courseId < courseCredits.length) {
            courseCredits[courseId] = credits;
        } else {
            System.out.println("Invalid course ID. Cannot add credits.");
        }
    }

    public double calculateGPA(int studentId) {
        int totalPoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < gradeCount; i++) {
            if (grades[i].getStudentId() == studentId) {
                int courseId = grades[i].getCourseId();
                totalPoints += gradeToPoints(grades[i].getGrade()) * courseCredits[courseId];
                totalCredits += courseCredits[courseId];
            }
        }
        return totalCredits == 0 ? 0 : (double) totalPoints / totalCredits;
    }

    private int gradeToPoints(char grade) {
        switch (grade) {
            case 'A': return 4;
            case 'B': return 3;
            case 'C': return 2;
            case 'D': return 1;
            case 'F': return 0;
            default: return 0;
        }
    }
    public void printGradeReport(int studentId) {
        Student1 student = null;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                student = students[i];
                break;
            }
        }

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Grade Report for " + student.getName() + " (ID: " + student.getStudentId() + ")");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < gradeCount; i++) {
            if (grades[i].getStudentId() == studentId) {
                System.out.println("Course ID: " + grades[i].getCourseId() + ", Grade: " + grades[i].getGrade());
            }
        }
        System.out.println("GPA: " + calculateGPA(studentId));
        System.out.println("-------------------------------------------------");
    }

}