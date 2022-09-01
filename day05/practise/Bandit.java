import java.util.Random;
/*
 * 一个大V直播抽奖，奖品是现金红包，
 * 分别有{2,588,888,1000,10000}五个奖金。
 * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
 * 打印效果如下：（随机顺序，不一定是下面的顺序）
 * 888元的奖金被抽出
 * 588元的奖金被抽出
 * 10000元的奖金被抽出
 * 1000元的奖金被抽出
 * 2元的奖金被抽出
 * @version v0.1 2022-09-01
 * @author MorningStar
 */

public class Bandit {
    public static void main(String[] args) {
        Random r = new Random();
        int[] bonus = {2, 588, 888, 1000, 10000};
        
        int[] arr = new int[bonus.length];

        for(int i = 0; i < bonus.length; ) {
            int index = r.nextInt(bonus.length);
            if(arr[index] != bonus[index]) {
                arr[index] = bonus[index];
                System.out.printf("%d元的奖金被抽出\n", bonus[index]);
                i++;
            }else{
                continue;
            }
        } 
    }
}
