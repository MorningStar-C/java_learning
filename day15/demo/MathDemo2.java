package day15.demo;
import java.util.Scanner;
public class MathDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        long ts0 = System.currentTimeMillis();
        boolean t = isPrime(a);
        long ts1 = System.currentTimeMillis();
        System.out.println(ts1 - ts0);
        System.out.println(t);
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if(number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
