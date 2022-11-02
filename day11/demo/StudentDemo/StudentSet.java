package day11.demo.StudentDemo;
import java.util.ArrayList;


public class StudentSet {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("小张", 19);
        Student s2 = new Student("小明", 19);
        Student s3 = new Student("小红", 20);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
