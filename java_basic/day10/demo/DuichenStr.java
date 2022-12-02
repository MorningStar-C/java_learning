import java.util.Scanner;

public class DuichenStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string");
        String str = sc.next();
        sc.close();
        
        String result = new StringBuilder().append(str).reverse().toString();

        if(str.equals(result)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
