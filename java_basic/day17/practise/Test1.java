import java.util.ArrayList;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if(num < 1 || num > 100) {
                System.out.println("Error, Input again");
                continue;
            }

            list.add(num);

            int sum = 0;

            for(int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if(sum > 200) {
                System.out.println("Satisfied");
                break;
            }
        }
        sc.close();
        
    }
}
