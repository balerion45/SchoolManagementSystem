import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School("Greenfield School");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the School Management System");
            System.out.println("1. Add Teacher");
            System.out.println("2. Add Student");
            System.out.println("3. Add Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Add Grade for Student");
            System.out.println("6. Add Attendance for Student");
            System.out.println("7. Print School Details");
            System.out.println("8. Print Student Report");
            System.out.println("9. Print Teacher Report");
            System.out.println("10. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Teacher ID: ");
                    int teacherId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Teacher Name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherId, teacherName, subject);
                    school.addTeacher(teacher);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Grade Level: ");
                    int gradeLevel = scanner.nextInt();
                    Student student = new Student(studentId, studentName, gradeLevel);
                    school.addStudent(student);
                    break;
                case 3:
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter Teacher ID for the Course: ");
                    int courseTeacherId = scanner.nextInt();
                    Teacher courseTeacher = school.getTeacherById(courseTeacherId);
                    if (courseTeacher != null) {
                        Course course = new Course(courseName, courseTeacher);
                        school.addCourse(course);
                    } else {
                        System.out.println("Teacher not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    int enrollStudentId = scanner.nextInt();
                    System.out.print("Enter Course Name: ");
                    scanner.nextLine(); // consume newline
                    String enrollCourseName = scanner.nextLine();
                    Student enrollStudent = school.getStudentById(enrollStudentId);
                    Course enrollCourse = school.getCourseByName(enrollCourseName);
                    if (enrollStudent != null && enrollCourse != null) {
                        school.enrollStudentInCourse(enrollStudent, enrollCourse);
                    } else {
                        System.out.println("Student or Course not found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    int gradeStudentId = scanner.nextInt();
                    System.out.print("Enter Course Name: ");
                    scanner.nextLine(); // consume newline
                    String gradeCourseName = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    int gradeScore = scanner.nextInt();
                    Student gradeStudent = school.getStudentById(gradeStudentId);
                    Course gradeCourse = school.getCourseByName(gradeCourseName);
                    if (gradeStudent != null && gradeCourse != null) {
                        gradeStudent.addGrade(new Grade(gradeCourse, gradeScore));
                    } else {
                        System.out.println("Student or Course not found!");
                    }
                    break;
                case 6:
                    System.out.print("Enter Student ID: ");
                    int attendanceStudentId = scanner.nextInt();
                    System.out.print("Enter Course Name: ");
                    scanner.nextLine(); // consume newline
                    String attendanceCourseName = scanner.nextLine();
                    System.out.print("Present (true/false): ");
                    boolean isPresent = scanner.nextBoolean();
                    Student attendanceStudent = school.getStudentById(attendanceStudentId);
                    Course attendanceCourse = school.getCourseByName(attendanceCourseName);
                    if (attendanceStudent != null && attendanceCourse != null) {
                        attendanceStudent.addAttendance(new Attendance(attendanceCourse, isPresent));
                    } else {
                        System.out.println("Student or Course not found!");
                    }
                    break;
                case 7:
                    school.printSchoolDetails();
                    break;
                case 8:
                    System.out.print("Enter Student ID: ");
                    int reportStudentId = scanner.nextInt();
                    Student reportStudent = school.getStudentById(reportStudentId);
                    if (reportStudent != null) {
                        school.printStudentReport(reportStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 9:
                    System.out.print("Enter Teacher ID: ");
                    int reportTeacherId = scanner.nextInt();
                    Teacher reportTeacher = school.getTeacherById(reportTeacherId);
                    if (reportTeacher != null) {
                        school.printTeacherReport(reportTeacher);
                    } else {
                        System.out.println("Teacher not found!");
                    }
                    break;
                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
