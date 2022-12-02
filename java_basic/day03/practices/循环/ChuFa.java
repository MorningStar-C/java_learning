import java.util.Scanner;

/**
 * 给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围）
 * 将两数相除，要求不使用乘法、除法和 % 运算符,得到商和余数
 * @version v0.1 2022-08-08
 * @author MorningStar
 */

public class ChuFa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int s = 0;
        int y = 0;

        while(a >= b){
            a = a - b;
            s++;
        }
        y = a;

        System.out.println("商=" + s + " ,余数=" + y);
    }    
}
