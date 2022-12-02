/**
 * 获取数组中元素的最大值
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class ArrMax {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};

        int number = getMax(arr);

        System.out.println(number);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
