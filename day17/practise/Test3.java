import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(true) {
            if(num == 0) {
                break;
            }
            int i = num % 2;
            num = num / 2;
            sb.insert(0, i);
        }

        System.out.println(sb.toString());
        sc.close(); 
    }
}
