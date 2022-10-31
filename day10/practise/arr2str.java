package day10.practise;

import java.util.StringJoiner;

public class arr2str {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrTostr1(arr));

        System.out.println(arrTostr2(arr));


    }

    public static String arrTostr1(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public static String arrTostr2(int[] arr) {
        StringJoiner sb = new StringJoiner(", ", "[", "]");
        for(int i = 0; i < arr.length; i++) {
            String t = "";
            t = t + arr[i];
            sb.add(t);
        }

        return sb.toString();
    }
}
