import java.util.Scanner;

public class Add{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = 0;

		if(a<b){
			for(int i=a; i<=b; ++i){
				r+=i;			
			}
		}
		else{
			for(int i=b; i<=a; ++i){
				r+=i;
			}
		}
		System.out.println(r);
	}
}
