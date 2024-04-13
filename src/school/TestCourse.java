package school;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Steve Smith");
        course2.addStudent("Hai");
        course2.addStudent("Nguyen");
        displayCourseName(course1.getCourseName());
        displayStudentsInCourse(course1.getStudents(), course1.getNumberOfStudents());
        displayCourseName(course2.getCourseName());
        displayStudentsInCourse(course2.getStudents(), course2.getNumberOfStudents());
        course1.locateAndDropStudent("Peter jones");
        displayCourseName(course1.getCourseName());
        displayStudentsInCourse(course1.getStudents(), course1.getNumberOfStudents());

    }

    public static void displayStudentsInCourse(String[] students, int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Number " + (i + 1) + ": " + students[i]);
        }
    }

    public static void displayCourseName(String CourseName) {
        System.out.println("The Students in " + CourseName + " ");
    }
}
