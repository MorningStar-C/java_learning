package day11.demo.StudentDemo;
import java.util.ArrayList;

public class Exist {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("0001", "小张", 19);
        Student s2 = new Student("0002", "小明", 19);
        Student s3 = new Student("0003", "小红", 20);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        boolean result = isExist(list, "0002");

        System.out.println(result);


    }   
    
    public static boolean isExist(ArrayList<Student> list, String sid) {
        
        for(int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(sid.equals(stu.getSid())) {
                return true;
            }
        }
        return false;
    }
}
