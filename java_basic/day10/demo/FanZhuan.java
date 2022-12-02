import java.util.Scanner;

public class FanZhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String");
        String str = sc.next();
        sc.close();

        String str_rev = reverse(str);
        System.out.println(str_rev);
    }

    public static String reverse(String str) {
        String s = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }

        return s;
    }


}
