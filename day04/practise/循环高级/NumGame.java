import java.util.Random;
import java.util.Scanner;
/**
 * 程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class NumGame {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while(c != num) {
            if(c > num) {
                System.out.println("Big");
                c = sc.nextInt();
            }else if (c < num) {
                System.out.println("Small");
                c = sc.nextInt();
            }
        }
        System.out.println("Congratulation!");
    }
}
