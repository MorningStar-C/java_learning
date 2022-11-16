package day14.demo.d01;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }
    
    @Override
    public void work() {
        System.out.println("经理管理员工");
    }
}
