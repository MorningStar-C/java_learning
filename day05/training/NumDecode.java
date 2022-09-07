package day05.training;
import java.util.Scanner;
/**
 * 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
 * 先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
 * 解密
 * @version v0.1 2022-09-06
 * @author MorningStar
 */
public class NumDecode {
    public static void main(String[] args) {
        //int[] arr = num();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = getArr(num);
        sc.close();
        printArr(arr);

        decode(arr);

        printArr(arr);
    }

    public static int[] num() {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        return arr;
    }

    public static int[] getArr(int num) {
        int count = 0;
        int tmp = num;
        while(num != 0) {
            num /= 10;
            count++;
        }

        int[] arr = new int[count];

        for(int i = arr.length-1; i >= 0; i--) {
            arr[i] = tmp % 10;
            tmp /= 10;
        }

        return arr;
    }

    public static int[] decode(int[] arr) {
        int tmp = 0;
        for(int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.print("反转解密: ");
        printArr(arr);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] + 10 - 5 < 10) {
                arr[i] += 10;
            }
        }
        System.out.print("%10解密: ");
        printArr(arr);

        for(int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        System.out.print("+5解密: ");
        printArr(arr);
        
        return arr;
    }

    public static void printArr(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);

            result *= 10;
            result += arr[i];
        }
        System.out.println();
        System.out.println(result);

    }

}
