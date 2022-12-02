package day13.demo.d01;

public class Administrator extends Person{

    
    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("管理员信息：" + this.getName() + ", " + this.getAge());
    }

    public void admin() {
        System.out.println("管理员管理");
    }
}
