/**
 * 带参数方法练习
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class MethodTest1 {
    public static void main(String[] args) {
        getMax(10, 20);

        int a = 20; 
        int b = 10;
        getMax(a, b);
    }

    public static void getMax(int a, int b) {
        System.out.println(a > b ? a : b);
    }
}
