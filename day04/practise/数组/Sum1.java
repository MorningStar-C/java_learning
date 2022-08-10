//package practise;

/**
 * 遍历数组得到每一个元素，求数组里面所有的数据和
 * @version v0.1 2022-08-09
 * @author MoningStar
 */
public class Sum1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
