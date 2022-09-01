/**
 * 设计一个方法可以获取两个数的较大值，数据来自于参数
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class MethodTest2 {
    public static void main(String[] args) {
        int result = getMax(10, 20);
        System.out.println(result);

        System.out.println(getMax(10, 20));
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
