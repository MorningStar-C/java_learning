/**
 * 将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
 * @version v0.1 2022-09-01
 * @author MorningStar
 */

public class ArrFill2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        fill(arr, 0, 3, 8);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();
        
    }   
    
    public static void fill(int[] arr, int fromIndex, int toIndex, int value) {
        for(int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
    }
}
