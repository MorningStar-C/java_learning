package day10.practise;
import java.util.Scanner;

public class TongJi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int num = 0;
        int letter = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9') {
                num++;
            }
            if(c >= 'A' && c <= 'Z') {
                letter++;
            }
            if(c >= 'a' && c <= 'z') {
                letter++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("Number: " + num);
    }    
}
