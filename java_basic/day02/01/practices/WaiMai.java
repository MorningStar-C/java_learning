public class WaiMai{
	public static void main(String[] args){
		int YuXiang=24;
		int YouZha=8;
		int MiFan=3;
		int YuYoHui=16;
		int sum1 = YuXiang+YouZha+MiFan;
		int sum2 = YuYoHui+YouZha+MiFan;
		double result=sum1>30?(sum1*0.8>sum2?sum2:sum1*0.8):(sum1>sum2?sum2:sum1);

		System.out.println(result);

	}
}
