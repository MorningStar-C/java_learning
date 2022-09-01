/**
 * 定义一个方法fill(int[] arr,int value)
 * 将数组arr中的所有元素的值改为value
 * @version v0.1 2022-08-10
 * @author MorningStar
 */

public class ArrFill {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();


        fill(arr, 9);
    }

    public static void fill(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
