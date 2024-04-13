package school;

public class Student extends Person {
    public Student() {
    }

    private Name name;
    private Address address;
    private Course[] courseList;

    public void studying() {
    }

    public void walking() {
        System.out.println("Student is walking");
    }

    public void sleeping() {
        System.out.println("Student is sleeping");
    }

}