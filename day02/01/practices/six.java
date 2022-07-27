import java.util.Scanner;

public class six{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a==6||b==6?true:((a+b)%6==0?true:false));
	}
}
