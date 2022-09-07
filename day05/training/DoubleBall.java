package day05.training;
import java.util.Random;
import java.util.Scanner;
/**
 * 投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色号码在1-33选择
 * 蓝色号码在1-16选择
 * 规则见综合训练练习9
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class DoubleBall {
    public static void main(String[] args) {
        int[] bonusNum = numGenerator();
        System.out.print("中奖号码：");
        printNum(bonusNum);
        int[] userNum = getNum();
        System.out.print("用户号码：");
        printNum(userNum);
        checkBonus(bonusNum, userNum);
    }

    public static int[] numGenerator() {
        Random r = new Random();
        int[] num = new int[7];
        //red ball number
        for(int i = 0; i < num.length - 1; i++) {
            num[i] = r.nextInt(33);
        }
        num[num.length - 1] = r.nextInt(16);
        return num;
    }

    public static int[] getNum() {
        int[] num = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        return num;
    }

    public static void printNum(int[] num) {
        for(int i = 0; i < num.length; i++) {
            System.out.printf("%d ", num[i]);
        }
        System.out.println();
    }

    public static void checkBonus(int[] bonusNum, int[] userNum) {
        int redCount = 0;
        int blueCount = 0;
        for(int i = 0; i < userNum.length; i++) {
            if(i < userNum.length - 1){
                if(bonusNum[i] == userNum[i]) {
                    redCount++;
                }
            }else{
                blueCount++;
            }
            
        }

        if(redCount == 6 && blueCount == 1) {
            System.out.println("中奖1000万");
        }else if(redCount == 6 && blueCount == 0) {
            System.out.println("中奖500万");
        }else if(redCount == 5 && blueCount == 1) {
            System.out.println("中奖3000元");
        }else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("中奖200元");
        }else if((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("中奖10元");
        }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("中奖5元");
        }else{
            System.out.println("未中奖");
        }
    }
}
