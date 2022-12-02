import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(true) {
            s = sc.nextLine();
            boolean results = s.matches("[1-9]\\d{0,9}");
            if(results) {
                break;
            }else {
                continue;
            }
        }
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int t = c - '0';
            num = num * 10 + t;
        }

        System.out.println(num);
        System.out.println(num + 1);
        
        sc.close();
    }
}
