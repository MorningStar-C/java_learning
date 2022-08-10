/**
 * 小数数组{12.9, 53.54, 75.0, 99.1, 3.14}, 找出数组中的最小值并打印
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ShuZu2 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};

        double min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }    
}
