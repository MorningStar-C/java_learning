package day05.training;
import java.util.Random;
/**
 * 一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
 * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
 * 打印效果如下：（随机顺序，不一定是下面的顺序）
 * 888元的奖金被抽出
 * 588元的奖金被抽出
 * 10000元的奖金被抽出
 * 1000元的奖金被抽出
 * 2元的奖金被抽出
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class Bonus {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            System.out.println(index);
            //随机arr.length次，最终得到一个交换的index队列，从而只有一个随机抽奖序列
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
