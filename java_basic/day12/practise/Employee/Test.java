package day12.practise.Employee;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("00001", "老王", "老师");
        System.out.println(t.getId() + " " + t.getName() + " " +t.getJob());
        t.work();

        Tutor tu = new Tutor("00002", "老六", "助教");
        System.out.println(tu.getId() + " " + tu.getName() + " " +tu.getJob());
        tu.work();
    }
}
