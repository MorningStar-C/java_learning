/**
 * 获取数字，在数组中的索引位置，将结果返回给调用处，
 * 如果有重复的，只要获取第一个即可
 */

public class GetIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 4;
        System.out.println(contains(arr, n));

    }

    public static int contains(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                return i;
            }
        }

        return -1;
    }
} 
