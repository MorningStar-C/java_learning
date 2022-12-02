package day12.practise.Employee;

public class Employee {
    private String id;
    private String name;
    private String job;

    public Employee() {
    }

    public Employee(String id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void work() {
        System.out.println("工作内容");
    }

}
