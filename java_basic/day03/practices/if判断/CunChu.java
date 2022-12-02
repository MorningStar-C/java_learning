import java.util.Scanner;

public class CunChu{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int year = sc.nextInt();
		double l=0.;

		switch(year){
			case 1:
				l=0.0225;
				break;
			case 2:
				l=0.027;
				break;
			case 3:
				l=0.0325;
				break;
			case 4:
				l=0.036;
				break;
		}

		double results = money + money * l * year;
		
		System.out.println(results);	

	}
}
