package day18.searchalgrithm;

public class A03_InsertSearch {
    
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 82;

        System.out.println(insertSearch(arr, number));
    }

    public static int insertSearch(int[] arr, int number) {
        int min_index = 0;
        int max_index = arr.length - 1;

        while(true) {
            if(min_index > max_index) {
                return -1;
            }
            // int middle_index = min_index + (1 / 2) * (max_index - min_index);
            int middle_index = min_index + ((number - arr[min_index]) / (arr[max_index] - arr[min_index])) * (max_index - min_index);
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
