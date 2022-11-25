package day15.demo;

public class SystemDemo2 {
    public static void main(String[] args) {
        // System.out.println("processing");
        // System.exit(0);
        // System.out.println("Finished");
        int[] srcArray = {1, 2, 3, 4, 5, 6};

        int[] desArray = new int[10];

        System.arraycopy(srcArray, 0, desArray, 1, 3);

        for(int x = 0; x < desArray.length; x++) {
            System.out.println(desArray[x]);
        }
    }
}
