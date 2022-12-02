package day12.demo.Human;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("老王");
        t.setAge(30);
        t.setSalary(5000);
        System.out.println("老师姓名：" + t.getName() + " " + "年龄：" + t.getAge() + " " + "薪水：" + t.getSalary());
        t.teach();
        t.action();

        Student stu = new Student();
        stu.setName("小明");
        stu.setAge(15);
        System.out.println("学生姓名：" + stu.getName() + " " + "年龄：" + stu.getAge());
        stu.learn();
        stu.action();

    }
}
