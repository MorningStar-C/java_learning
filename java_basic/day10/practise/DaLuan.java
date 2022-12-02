package day10.practise;

import java.util.Random;
import java.util.Scanner;

public class DaLuan {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        char[] str_ch = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            //int t = r.nextInt(str.length() - 1);
            str_ch[i] = str.charAt(i);       
        }
        for(int i = 0; i < str.length(); i++) {
            int t = r.nextInt(str.length() - 1);
            char tmp = str_ch[i];
            str_ch[i] = str_ch[t];
            str_ch[t] = tmp;         
        }

        String result = new String(str_ch);

        System.out.println(result);
    }
}
