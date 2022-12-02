public class Height{
	public static void main(String[] args){
		int f = 177;
		int m = 165;

		System.out.println("Boy:"+BoyHeight(f,m)+"Girl:"+GirlHeight(f,m));
	}

	public static int BoyHeight(int f, int m){
		return (int)((f + m) * 1.08 / 2.0);
	}
	public static int GirlHeight(int f, int m){
		return (int)((f * 0.923 + m) / 2.0);
	}
}
