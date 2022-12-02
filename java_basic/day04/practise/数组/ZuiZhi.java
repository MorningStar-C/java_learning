/**
 * 求数组中的最大值
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ZuiZhi {
    public static void main(String[] args) {
        int[] arr = {33, 5, 44, 55, 22};

        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
