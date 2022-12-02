/**
 * 计算并输出学生的平均成绩
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ShuZu5 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
}
