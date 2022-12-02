/**
 * 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class GetMax {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 9;

        System.out.println(getMax(a, b, c));
    }   
    
    public static int getMax(int a, int b, int c) {
        return a > b ? (a > c ? a : (c > b ? c : b)) : (b > c ? b : (a > c ? a : c));
    }
}
