public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    private static final int MAX_STUDENTS = 60;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[MAX_STUDENTS];
    }

    public void addStudent(String student) {
        if (numberOfStudents >= MAX_STUDENTS) {
            throw new RuntimeException("Sınıf doluyken öğrenci eklenemez");
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new RuntimeException("Öğrenci bulunamadı");
        }
        for (int i = index; i < numberOfStudents - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
