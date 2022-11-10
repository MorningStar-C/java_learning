package day12.demo.Human;

public class Human {
    private String name;
    private int age;

    public Human() {

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void action() {
        System.out.println("Eat");
        System.out.println("Sleep");
    }

}