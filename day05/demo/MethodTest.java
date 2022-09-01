/**
 * 无参数方法练习
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class MethodTest {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;

        System.out.println(a > b ? a : b);
    }
}
