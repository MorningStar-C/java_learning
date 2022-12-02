package day12.demo.Human;

public class Teacher extends Human {
    private int salary;

    public Teacher() {

    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void teach() {
        System.out.println("Teaching");
    }

    public void action() {
        System.out.println("Teaching, Eating, Sleeping");
    }
}
