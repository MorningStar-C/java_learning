public class Pingjie {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String s = arr2str(arr);

        System.out.println(s);
    }

    public static String arr2str(int[] arr) {
        String s = "";
        s = s + "[";
        for(int i = 0; i < arr.length; i++) { 
            if(i == arr.length - 1) {
                s = s + arr[i];
            }else {
                s = s + arr[i] + ", ";
            }
            
        }
        s = s + "]";

        return s;

    }
}
