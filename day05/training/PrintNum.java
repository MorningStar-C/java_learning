package day05.training;

/**
 * 判断101~200之间有多少个素数，并输出所有素数。
 * @version v0.1 2022-09-06
 * @author MorningStar
 */

public class PrintNum {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101; i <= 200; i++) {
            boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.printf("%d ", i);
                count++;
            }
        }

        System.out.printf("\n质数有 %d 个\n", count);
    }
}
