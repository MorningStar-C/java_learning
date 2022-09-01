import java.util.Scanner;
/**
 * 定义一个方法，方法能够得到小数类型数字的绝对值并返回。
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class PrintAbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        System.out.println(printAbs(num));
    }

    public static Double printAbs(double num) {
        if(num > 0) {
            return num;
        }else{
            return -num;
        }
    }
}
