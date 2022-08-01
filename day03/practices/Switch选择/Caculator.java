import java.util.Scanner;

public class Caculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int s = sc.nextInt();

		switch(s){
			case 1:
				System.out.printf("%d+%d=%d\n",a,b,a+b);
				break;
			case 2:
				System.out.printf("%d-%d=%d\n",a,b,a-b);
				break;
			case 3:
				System.out.printf("%d*%d=%d\n",a,b,a*b);
				break;
			case 4:
				System.out.printf("%d/%d=%d\n",a,b,a/b);
				break;
			default:
				System.out.printf("Error\n");
				break;
		}
	}
}
