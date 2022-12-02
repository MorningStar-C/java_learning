import java.util.Scanner;
public class MIngGanReplace {
    public static void main(String[] args) {
        String[] arr = {"TMD", "GDX","ctmd","ZZ","lj","FW","nt"};
        Scanner sc = new Scanner(System.in);
        String talk = sc.next();
        sc.close();
        for(int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);

    }
}
