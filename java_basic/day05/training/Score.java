package day05.training;
import java.util.Scanner;
/**
 * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
 * 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
 * @version v0.1 2022-09-06
 * @author MorningStar
 */
public class Score {
    public static void main(String[] args) {
        int[] score = scoreArr();
        int max = getMax(score);
        int min = getMin(score);
        int sum = getSum(score);
        int avg = (sum - max - min) / 4;
        System.out.println(avg);

    }

    public static int[] scoreArr() {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];

        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        sc.close();
        return score;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for(int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for(int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for(int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }
}
