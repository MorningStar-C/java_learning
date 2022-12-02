package day10.practise;

public class TongJi_java {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String findStr = "Java";
        System.out.println(strTongJi(str, findStr));
    }   

    public static int strTongJi(String str, String findStr) {
        int num = 0;
        int first_index = str.indexOf(findStr);
        
        if(first_index == -1) {
            num = 0;
        }

        while(first_index != -1) {
            num++;
            str = str.substring(first_index + findStr.length());
            first_index = str.indexOf(findStr);
        }

        return num;
    }
}
