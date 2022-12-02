public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        String s4 = "abc";
        System.out.println("s4:" + s4);
    }
}