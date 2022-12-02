/**
 * 定义一个方法，求一家商场每个季度的营业额。根据方法结果再计算出全年营业额
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class MethodTest3 {
    public static void main(String[] args) {
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(10, 20, 30);
        int sum3 = getSum(10, 20, 30);

        int sum = sum1 + sum2 + sum3;
        System.out.println(sum);
    }

    public static int getSum(int month1, int month2, int month3) {
        int sum = month1 + month2 + month3;
        return sum;
    }

}
