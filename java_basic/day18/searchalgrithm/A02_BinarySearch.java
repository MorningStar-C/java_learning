package day18.searchalgrithm;

public class A02_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 82;

        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(int[] arr, int number) {
        int min_index = 0;
        int max_index = arr.length - 1;

        while(true) {
            if(min_index > max_index) {
                return -1;
            }
            int middle_index = (min_index + max_index) / 2;
            if(number > arr[middle_index]) {
                min_index = middle_index + 1;
            } else if(number < arr[middle_index]){
                max_index = middle_index - 1;
            } else {
                return middle_index;
            }
        }
    }   
}
