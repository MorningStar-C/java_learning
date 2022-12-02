import java.util.Scanner;

public class Tongji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int upperletter = 0;
        int lowerletter = 0;
        int num = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                upperletter++;
            }else if(c >= 'a' && c <= 'z') {
                lowerletter++;
            }else if(c >= '0' && c <= '9') {
                num++;
            }
        }
        sc.close();

        System.out.printf("Upper letter: %d\n", upperletter);
        System.out.printf("lower letter: %d\n", lowerletter);
        System.out.printf("Number: %d\n", num);
    }
}
