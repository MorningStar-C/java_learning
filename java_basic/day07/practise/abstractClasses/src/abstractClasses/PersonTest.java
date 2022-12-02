package abstractClasses;

/**
 * This program demonstrates abstract classes.
 * @version v0.1 2022-08-10
 * @author MorningStar
 */


 /**
  * 在运行有包的java程序时，需要在包外进行编译
  * 编译命令是在包的上一级目录，若在包内编译，便要在包内找包，故无法编译运行
  * $ javac abstractClasses/PersonTest.java
  * $ java abstractClasses/PersonTest
  */

public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];
        
        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1999, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for(Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }    
}
