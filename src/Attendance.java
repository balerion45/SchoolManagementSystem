public class Attendance {
    private Course course;
    private boolean present;

    public Attendance(Course course, boolean present) {
        this.course = course;
        this.present = present;
    }

    @Override
    public String toString() {
        return "Course: " + course.getName() + ", Present: " + (present ? "Yes" : "No");
    }
}
