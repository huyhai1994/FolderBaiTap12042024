package school;

public class Course {
    private String courseName;
    private String[] studentsList = new String[100];
    private int numberOfStudents;
    private int locationOfStudent;

    public Course() {
        this("anonymous");
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void addStudent(String student) {
        boolean isTheStudentListFull = numberOfStudents >= studentsList.length;
        if (isTheStudentListFull) {
            studentsList = createNewStudentsListTwiceAsTheCurrentList();
        }
        studentsList[numberOfStudents] = student;
        numberOfStudents++;
    }

    private String[] createNewStudentsListTwiceAsTheCurrentList() {
        String[] temporaryList = new String[studentsList.length * 2];
        System.arraycopy(studentsList, 0, temporaryList, 0, studentsList.length);
        studentsList = temporaryList;
        return studentsList;
    }

    public void locateAndDropStudent(String student) {
        locationOfStudent = locationOfStudent(student);
        for (int i = locationOfStudent; i < numberOfStudents; i++) {
            studentsList[i] = studentsList[i + 1];
        }
        numberOfStudents--;
    }

    private int locationOfStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentsList[i].equals(student)) {
                locationOfStudent = i;
            }
        }
        return locationOfStudent;
    }

    public String[] getStudents() {
        return studentsList;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumbersOfStudents() {
        return numberOfStudents;
    }

    public static class Faculty {
        public Faculty() {
        }
    }
}