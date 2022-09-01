import java.util.Scanner;
/**
 * 在主方法中通过键盘录入三个整数。
 * 定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class PrintVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printVar(a, b, c);
    }

    public static void printVar(int a, int b, int c) {
        if(a > b) {
            if(a > c) {
                System.out.printf("%d ", a);
                if (b > c) {
                    System.out.printf("%d ", b);
                    System.out.printf("%d ", c);
                }else {
                    System.out.printf("%d ", c);
                    System.out.printf("%d ", b);
                }
            } 
            
        }else {
            if(c > b) {
                System.out.printf("%d ", c);
                if (b > a) {
                    System.out.printf("%d ", b);
                    System.out.printf("%d ", a);
                }else {
                    System.out.printf("%d ", a);
                    System.out.printf("%d ", b);
                }
            }
        }
    }
}
