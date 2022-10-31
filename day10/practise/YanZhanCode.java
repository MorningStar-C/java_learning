package day10.practise;
import java.util.Random;

public class YanZhanCode {
    public static void main(String[] args) {
        Random r = new Random();
        char[] str_ch = new char[5];



        for(int i = 0; i < str_ch.length; i++) {
            int up_or_low = r.nextInt(2);
            int letter;
            if(up_or_low == 1) {
                letter = r.nextInt(65, 91);
            }else {
                letter = r.nextInt(97, 123);
            }
            str_ch[i] = (char)letter;
            
        }

        int num_index = r.nextInt(5);
        int num = r.nextInt(48, 57);
        str_ch[num_index] = (char)num;

        System.out.println(str_ch);
    }
}
