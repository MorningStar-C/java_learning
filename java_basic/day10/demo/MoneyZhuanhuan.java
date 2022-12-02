import java.util.Scanner;

public class MoneyZhuanhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while(true) {
            money = sc.nextInt();
            if(money < 9999999 && money >= 0) {
                break;
            }else{
                System.out.println("error input");
            }
        }
        sc.close();

        String moneyCap_t = "";
        int d = 0;
        int k = 0;
        while(k < 7) {
            int g = money % 10;
            String cap_g = getCap(g);
            String cap_d = getDanwei(d);
            moneyCap_t = moneyCap_t + cap_d + cap_g;
            money = money / 10;
            // if(money == 0) {
            //     break;
            // }
            k++;
            d++;
        }
        
        String moneyCap = "";
        for(int i = moneyCap_t.length() - 1; i >= 0; i--) {
            moneyCap = moneyCap + moneyCap_t.charAt(i);
        }

        System.out.println(moneyCap);
        
    }

    public static String getCap(int g) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String a = arr[g];
        return a;
    }

    public static String getDanwei(int d) {
        String[] arr = {"元", "拾", "佰", "仟", "万", "拾", "佰"};
        String a = arr[d];
        return a;
    }
}
