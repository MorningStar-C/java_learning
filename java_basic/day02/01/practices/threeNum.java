import java.util.Scanner;

public class threeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n<100||n>999){
			System.out.println("Error, please input again");
			n = sc.nextInt();
		}

		int sum = n%10 + (int)(n/10)%10 + (int)(n/100);

		System.out.println(sum);
	}
}
