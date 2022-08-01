import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cls = sc.nextInt();
		while(cls!=0&&cls!=1){
			System.out.println("Error");
			cls = sc.nextInt();
		}

		int price = sc.nextInt();
		double results = 0.;


		if(cls==0){
			results=price>100?price*0.9:price;
		}
		else if(cls==1){
			results=price>200?price*0.75:price*0.8;
		}

		System.out.println(results);
	}
}
