/**
 * 定义一个方法copyOfRange(int[] arr,int from, int to)
 * 将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
 * 并将新数组返回。
 * @verison v0.1 202-09-01
 * @author MorningStar
 */

public class ArrCopy2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = copyOfRange(arr, 2, 8);

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for(int i = 0; i < newArr.length; i++) {
            System.out.printf("%d ", newArr[i]);
        }
        System.out.println();

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        for(int i = from, j = 0; i < to; i++, j++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }
}
