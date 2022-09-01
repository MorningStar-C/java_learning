/**
 * 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class GetMin {
    public static void main(String[] args) {
        double a = 12.3;
        double b = 11.5;
        System.out.println(getMin(a,b));
    }   
    
    public static double getMin(double a, double b) {
        return a > b ? b : a;
    }
}
