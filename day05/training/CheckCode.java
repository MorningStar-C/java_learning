package day05.training;
import java.util.Random;
/**
 * 定义方法实现随机产生一个5位的验证码
 * @version v0.1 2022-09-06
 * @author MorningStar
 */

public class CheckCode {
    public static void main(String[] args) {
        System.out.println(codeGenerator());
    }
    
    public static String codeGenerator() {
        Random r = new Random();
        char[] letter = new char[52];

        for(int i = 0; i < letter.length; i++) {
            if(i <= 25){
                letter[i] = (char)(97 + i);
            }else{
                letter[i] = (char)(65 + i - 26);
            }
        }

        String result = "";
        for(int i = 0; i < 4; i++) {
            int index = r.nextInt(letter.length);

            result += letter[index];
        }
        int number = r.nextInt(10);
        result += number;

        return result;
        
    }
}
