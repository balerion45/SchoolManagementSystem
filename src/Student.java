import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int gradeLevel;
    private List<Course> courses;
    private List<Grade> grades;
    private List<Attendance> attendanceRecords;

    public Student(int id, String name, int gradeLevel) {
        super(id, name);
        this.gradeLevel = gradeLevel;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.attendanceRecords = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void addAttendance(Attendance attendance) {
        attendanceRecords.add(attendance);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade Level: " + gradeLevel + ", Courses: " + courses;
    }

    @Override
    public void printReport() {
        System.out.println("Courses Enrolled:");
        for (Course course : courses) {
            System.out.println(course);
        }
        System.out.println("Grades:");
        for (Grade grade : grades) {
            System.out.println(grade);
        }
        System.out.println("Attendance:");
        for (Attendance attendance : attendanceRecords) {
            System.out.println(attendance);
        }
    }
}
