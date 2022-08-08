import com.horstmann.corejava.*;
// the Employee class is defined in that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages.
 * @version v0.1 2022-08-04
 * @author MorningStar
 */
public class PackageTest {
    public static void main(String[] args){
        // because of the import statement, we don't have to use
        // com.horstmann.corejava.Employee here
        var harry = new Employee("Harry Hacker", 50000, 1980, 10, 1);

        harry.raiseSalary(5);

        // because of the static import sdtatement, we don't have to use System.out here
        out.println("name=" + harry.getName() + " ,salary=" + harry.getSalary());
    }
}
