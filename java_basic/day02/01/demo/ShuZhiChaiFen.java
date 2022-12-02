import java.util.Scanner;

public class ShuZhiChaiFen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number:");
		int number = sc.nextInt();

		int ones = number % 10;
		int tens = number / 10 % 10;
		int hundreds = number / 100 % 10;

		System.out.println(ones);
		System.out.println(tens);
		System.out.println(hundreds);
	}
}
