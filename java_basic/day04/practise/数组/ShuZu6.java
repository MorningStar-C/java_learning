import java.util.Scanner;
/**
 * 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
 * 再通过键盘录入一个整数数字。
 * 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
 * @verison v0.1 2022-08-09
 * @author MorningSar
 */

public class ShuZu6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,14,23,45,66,68,70,77,90,91};

        int[] arr1 = new int[arr.length + 1];

        int n = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(n < arr[i]) {
                arr1[i] = n;
                for(int j = i+1; j < arr1.length; j++){
                    arr1[j] = arr[i]; 
                    i++;
                }
                break;
                
            }
            arr1[i] = arr[i];
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr1[i]);
        }
    }
}
