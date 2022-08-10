import java.util.Random;

/**
 * 随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class ShuZu3 {
    public static void main(String[] args) {
        Random r = new Random();
        final int LENGTH = 6;
        int[] arr = new int[LENGTH];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            sum += arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.printf("\n%d\n", sum);

    }
}
