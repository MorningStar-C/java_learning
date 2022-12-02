import java.util.Scanner;
/**
 * 键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根
 * 结果只保留整数部分 ，小数部分将被舍去
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        while(n < 2) {
            System.out.println("Error");
            n = sc.nextInt();
        }

        for(int i = 1; i <= n; i++) {
            if(i * i > n) {
                System.out.println(i-1);
                break;
            }else if(i * i == n) {
                System.out.println(i);
                break;
            }
        }
    }
}
