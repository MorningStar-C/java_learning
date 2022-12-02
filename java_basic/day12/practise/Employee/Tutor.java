package day12.practise.Employee;

public class Tutor extends Employee{

    public Tutor() {
    }

    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }
    
    @Override
    public void work() {
        System.out.println("助教改作业");
    }
}
