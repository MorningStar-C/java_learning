/**
 * 将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
 * @version v0.1 2022-09-01
 * @author MorningStar
 */

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] newArr = copyOf(arr, 6);

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for(int i = 0; i < newArr.length; i++) {
            System.out.printf("%d ", newArr[i]);
        }
        System.out.println();
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        for(int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
