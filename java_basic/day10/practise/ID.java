package day10.practise;
import java.util.Scanner;

public class ID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        System.out.println(isLegal(str));
    }    

    public static boolean isLegal(String str) {
        if(str.charAt(0) == '0') {
            return false;
        }else if(str.length() != 18) {
            return false;
        }else{
            for(int i = 0; i < str.length(); i++) {
                if(i < str.length() - 1) {
                    if(str.charAt(i) < '0' || str.charAt(i) > '9' ) {
                        return false;
                    }
                }else {
                    if(str.charAt(i) < '0' || str.charAt(i) > '9' && str.charAt(i) != 'X' ) {
                        return false;
                    }
                }
                
            }
        }
        return true;
    }
}
