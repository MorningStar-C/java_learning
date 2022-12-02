package day08.practise.Manager;
/**
 * Manager Worker测试
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setId(999);
        m.setName("老王");
        m.setSalary(19000);
        m.setBonus(5000);
        m.work();

        Coder c = new Coder("老李", 199, 12000);
        c.work();
    }
}
