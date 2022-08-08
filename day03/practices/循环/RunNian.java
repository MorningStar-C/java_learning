/**
 * 打印出1988年到2019年的所有闰年年份
 * @version v0.1 2022-08-08
 * @author MorningStar
 */

public class RunNian {
    public static void main(String[] args) {
        for(int i = 1988; i <= 2019; i++) {
            if(i % 4 == 0 && i % 100 != 0) {
                System.out.println(i);
            }
            else if(i % 400 == 0) {
                System.out.println(i);
            }
        }
    }
}
