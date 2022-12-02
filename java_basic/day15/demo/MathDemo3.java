package day15.demo;

public class MathDemo3 {
    public static void main(String[] args) {
        int count0 = 0;
        for(int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if(i == (int)sum) {
                System.out.println(i);
                count0++;
            }
        }
        System.out.println("水仙花数：" + count0);

        int count1 = 0;
        for(int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;

            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if(i == (int)sum) {
                System.out.println(i);
                count1++;
            }
        }
        System.out.println("🍀数：" + count1);
        System.out.println(getWei(2));
    }

    public static int getWei(int num) {
        int wei = 0;
        int a = 1;
        while(num >= a) {
            wei += 1;
            a *= 10;
        }
        return wei;
    }
}
