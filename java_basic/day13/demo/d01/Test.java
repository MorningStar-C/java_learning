package day13.demo.d01;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("小敏", 18);

        Administrator a = new Administrator("小红", 20);

        register(s);
        register(a);

        Person p = s;
        //p.learn();
        //编译报错，编译看左边，运行看右边，Person没有这个方法
        Student s1 = (Student) p;
        s1.learn();
        //类型转换异常
        //Administrator a1 = (Administrator) p;
        //a1.admin();

        if(p instanceof Student) {
            Student s2 = (Student) p;
            s2.learn();
        }else if(p instanceof Administrator) {
            Administrator a2 = (Administrator) p;
            a2.admin();
        }

        if(p instanceof Student s2) {
            //Student s2 = (Student) p;
            s2.learn();
        }else if(p instanceof Administrator a2) {
            //Administrator a2 = (Administrator) p;
            a2.admin();
        }


    }

    public static void register(Person p) {
        p.show();
    }
}
