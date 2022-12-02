import java.util.Scanner;

/**
 * 键盘年输入两个数字，表示一个范围，统计范围内可以被3和5整除的数
 * @version v0.1 2022-08-08
 * @author MorningStar
 */

 public class FanWei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = 0;

        if(a > b) {
            for(int i = b; i < a; i++) {
                if(i % 3 == 0 && i % 5 == 0) {
                    n++;
                }
            }
        }
        else{
            for(int i = a; i < b; i++) {
                if(i % 3 == 0 && i % 5 == 0) {
                    n++;
                }
            }
        }

        System.out.println(n);
    }
 }