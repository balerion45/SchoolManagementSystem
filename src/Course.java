import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        teacher.assignCourse(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course: " + name + ", Teacher: " + teacher.getName();
    }
}
