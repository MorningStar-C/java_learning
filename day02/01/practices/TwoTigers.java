import java.util.Scanner;

public class TwoTigers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double tiger1 = sc.nextDouble();
		double tiger2 = sc.nextDouble();

		boolean results = tiger1 == tiger2;

		System.out.println(results);
	}
}
