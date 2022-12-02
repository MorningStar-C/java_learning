package day12.practise.Employee;

public class Teacher extends Employee{

    public Teacher() {
    }

    public Teacher(String id, String name, String job) {
        super(id, name, job);
    }
    
    @Override
    public void work() {
        System.out.println("老师上课");
    }
}
