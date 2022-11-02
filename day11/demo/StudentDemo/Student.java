package day11.demo.StudentDemo;

public class Student {
    private String sid;
    private String name;
    private int age;

    public Student() {

    }

    public Student(String sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSid() {
        return this.sid;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }



}
