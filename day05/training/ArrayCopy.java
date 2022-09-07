package day05.training;
/**
 * 把一个数组中的元素复制到另一个新数组中去。
 * @version v0.1 2022-09-06
 * @author MorningStar
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
