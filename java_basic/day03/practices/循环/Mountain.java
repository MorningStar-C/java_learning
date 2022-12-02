/**
 * 世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
 * 假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 * @version v0.1 2022-08-08
 * @author MorningStar
 */

public class Mountain {
    public static void main(String[] args) {
        double mountain = 8844430.0;
        double paper = 0.1;

        int times = 0;

        while(paper < mountain) {
            paper *= 2;
            times++;
        }

        System.out.println(times);

    }
}
