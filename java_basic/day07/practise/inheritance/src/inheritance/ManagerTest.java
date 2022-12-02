package inheritance;

/**
 * This program demonstrates inheritance
 * @version 0.1 2022-08-08
 * @author MorningStar
 */

public class ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        var boss = new Manager("Carl Cracker", 80000, 1999, 10, 11);
        boss.setBonus(5000);

        var staff = new Employee[3];

        // fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1998, 10, 1);
        staff[2] = new Employee("Tommy Tester", 60000, 1999, 9, 10);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + " ,salary=" + e.getSalary());
        }
    }
}
