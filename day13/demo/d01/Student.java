package day13.demo.d01;

public class Student extends Person{
    
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("学生的信息：" + getName() + ", " + getAge());
    }

    public void learn() {
        System.out.println("学生学习");
    }
}
