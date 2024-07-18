import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(Student student, Course course) {
        student.enrollCourse(course);
        course.addStudent(student);
    }

    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Course getCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return course;
            }
        }
        return null;
    }

    public void printSchoolDetails() {
        System.out.println("School Name: " + name);
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printStudentReport(Student student) {
        System.out.println("Report for " + student.getName() + ":");
        student.printReport();
    }

    public void printTeacherReport(Teacher teacher) {
        System.out.println("Report for " + teacher.getName() + ":");
        teacher.printReport();
    }
}
