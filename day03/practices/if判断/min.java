import java.util.Scanner;

public class min{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int tmp1 = a>b?a:b;
		int tmp2 = b>c?b:c;
		int results = tmp1>tmp2?tmp1:tmp2;
		
		System.out.println(results);
	}
}
