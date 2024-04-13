package school;

public abstract class Person {
    private double height;
    private int weight;

    public Person() {
        this(160.0, 80);
    }

    public Person(double height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public abstract void walking();

    public abstract void sleeping();
}