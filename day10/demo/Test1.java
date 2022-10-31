import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String Username = "MorningStar";
        String Password = "123456";

        for(int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please input username");
            String name = sc.next();
            System.out.println("please input password");
            String passwd = sc.next();

            if(name.equals(Username) && passwd.equals(Password)) {
                System.out.println("login success");
                sc.close();
                break;
            }

            System.out.printf("remain %d chances\n", 3-i-1);
            sc.close();
        }
    }
}
