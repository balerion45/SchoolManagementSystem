import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String subject;
    private List<Course> courses;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }

    @Override
    public void printReport() {
        System.out.println("Courses Taught:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
