/**
 * 使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

 public class SevenPass {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("Pass " + i);
                continue;
            }
            System.out.println(i);
        }
    }
 }