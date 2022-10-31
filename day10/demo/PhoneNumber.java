import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your phone number");
        String phoneNumber = sc.next();
        sc.close();

        String star = phoneNumber.substring(0, 3);

        String end = phoneNumber.substring(7);

        String result = star + "****" + end;

        System.out.println(result);
    }
}
