public class ThreeMonk{
	public static void main(String[] args){
		int a = 150;
		int b = 210;
		int c = 165;

		int tmp = a > b ? a : b;
		int max = tmp > c ? tmp : c;
		System.out.println(max);
	}
}
