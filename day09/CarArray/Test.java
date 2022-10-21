package day09.CarArray;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            Car c = new Car();
            String brand = sc.next();
            c.setBrand(brand);
            int price = sc.nextInt();
            c.setPrice(price);
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
            
        }
        sc.close();

        for(int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " + car.getColor());
        }
    }    
}
