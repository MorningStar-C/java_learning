import javax.print.DocFlavor.STRING;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("100");
        System.out.println(i2);

        Integer i3 = Integer.valueOf(1);
        Integer i4 = Integer.valueOf("1");
        System.out.println(i3);
        System.out.println(i4);

        /*
            public static string tobinarystring(int i) 得到二进制
            public static string tooctalstring(int i) 得到八进制
            public static string toHexstring(int i) 得到十六进制
            public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
        */

        System.out.println("------------------");
        String s1 = Integer.toBinaryString(100);
        System.out.println(s1);

        String s2 = Integer.toOctalString(100);
        System.out.println(s2);

        String s3 = Integer.toHexString(100);
        System.out.println(s3);

        int i = Integer.parseInt("1234");
        System.out.println(i);
        System.out.println(i+1);

        System.out.println("--------------------");
        int num = 100;
        String s4 = num + "";
        System.out.println(s4);

        String s5 = String.valueOf(num);
        System.out.println(s5);
        System.out.println("--------------------");

        String s6 = "100";
        Integer i9 = Integer.valueOf(s6);

        int x = i9.intValue();
        System.out.println(x);

        int y = Integer.parseInt(s6);
        System.out.println(y);

    }
}
