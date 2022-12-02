import java.util.Random;

import java.util.Random;

/**
 * 定义一个数组，存入1~5。要求打乱数组中所有数据的顺序
 * @version v0.1 2022-08-09
 * @author MorningStar
 */

public class Chaos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tmp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
