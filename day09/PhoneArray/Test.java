package day09.PhoneArray;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phone[] arr = new Phone[3];

        for(int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            String brand = sc.next();
            p.setBrand(brand);
            int price = sc.nextInt();
            p.setPrice(price);
            String color = sc.next();
            p.setColor(color);

            arr[i] = p;
        }

        sc.close();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int price = arr[i].getPrice();
            sum += price;
        }
        double avg = sum * 1.0 /arr.length;

        System.out.println(avg);
    }    
}
