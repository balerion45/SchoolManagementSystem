public class Grade {
    private Course course;
    private int score;

    public Grade(Course course, int score) {
        this.course = course;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Course: " + course.getName() + ", Score: " + score;
    }
}
