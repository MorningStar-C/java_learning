import java.util.Scanner;

/**
 * 如果 x 是一个回文整数，打印 true ，否则，返回 false
 * @version v0.1 2022-08-08
 * @author MorningStar
 */

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int x = t;
        int g = 0;
        int num = 0;

        while(x != 0) {
            g = x % 10;
            x = x / 10;
            num =  num * 10 + g; 
        }

        System.out.println(num == t ? "True" : "False");

    }
}
