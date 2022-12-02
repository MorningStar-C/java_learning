/**
 * 设计一个方法用于数组遍历，要求遍历的结果是在一行上的
 * @version v0.1 2022-08-10
 * @author MorningSar
 */

public class ArrBIanli {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                System.out.printf("%d ", arr[i]);
            }else{
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.println();
    }
}
