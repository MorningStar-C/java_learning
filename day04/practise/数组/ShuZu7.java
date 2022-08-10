/**
 * 定义一个数组其中包含多个数字。
 * 用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
 * （可以创建其他数组，不必须在原数组中改变)
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ShuZu7 {
    public static void main(String[] args) {
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] arr1 = new int[arr.length];
        int right = 0;
        int left = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                arr1[right] = arr[i];
                right++;
            }
            else{
                arr1[left] = arr[i];
                left--;
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr1[i]);
        }

        System.out.println();

        int right1 = 0;
        int left1 = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                for(int j = arr.length-1; j >i; j--) {
                    if(arr[j] % 2 != 0) {
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();
 
    }
}
