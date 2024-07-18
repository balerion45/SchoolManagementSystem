public class Main {
    public static void main(String[] args) {
        School school = new School("Greenfield School");
        
        Teacher teacher1 = new Teacher(1, "Alice", "Math");
        Teacher teacher2 = new Teacher(2, "Bob", "Science");
        
        Student student1 = new Student(1, "John Doe", 10);
        Student student2 = new Student(2, "Jane Doe", 10);
        
        Course course1 = new Course("Math101", teacher1);
        Course course2 = new Course("Science101", teacher2);
        
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        
        school.addStudent(student1);
        school.addStudent(student2);
        
        school.addCourse(course1);
        school.addCourse(course2);
        
        school.enrollStudentInCourse(student1, course1);
        school.enrollStudentInCourse(student2, course2);
        
        student1.addGrade(new Grade(course1, 95));
        student2.addGrade(new Grade(course2, 88));
        
        student1.addAttendance(new Attendance(course1, true));
        student2.addAttendance(new Attendance(course2, false));
        
        school.printSchoolDetails();
        school.printStudentReport(student1);
        school.printTeacherReport(teacher1);
    }
}
