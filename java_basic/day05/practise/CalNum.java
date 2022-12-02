import java.util.Scanner;
/**
 * 定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class CalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(calNum(n));
    }

    public static int calNum(int n) {
        int i = 0;
        while(n > 0) {
            n /= 10;
            i++;
        }

        return i;
    }
}
