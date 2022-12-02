package day18.searchalgrithm;

public class A01_BasicSearch {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 82;

        System.out.println(basicSearch(arr, number));

    }  
    
    public static boolean basicSearch(int[] arr, int number) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
