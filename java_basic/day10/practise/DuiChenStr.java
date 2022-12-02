package day10.practise;
import java.util.Scanner;

public class DuiChenStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        System.out.println(isDuiChen(str));
        
    }

    public static boolean isDuiChen(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String results = sb.reverse().toString();

        if(str.equals(results)) {
            return true;
        }else {
            return false;
        }
    }
}
