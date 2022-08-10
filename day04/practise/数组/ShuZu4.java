/**
 * 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字
 * 从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推
 * 请编写程序计算，这个数组所表示的整数值
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ShuZu4 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 4};
        int num = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            num += arr[i];
            num *= 10;
        }
        System.out.println(num+arr[arr.length-1]);
    }
}
