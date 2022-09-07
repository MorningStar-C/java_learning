import java.util.Scanner;
/**
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * 按照如下规则计算机票价格：
 * 旺季（5-10月）头等舱9折，经济舱8.5折，
 * 淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 * @version v0.1 2022-09-04
 * @author MorningStar
 */

public class FlightTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("机票原价");
        int ticket = sc.nextInt();
        System.out.println("当前月份");
        int month = sc.nextInt();
        System.out.println("座位等级");
        int seat = sc.nextInt();
        sc.close();

        System.out.println(getTicket(ticket, month, seat));


    }    

    public static double getTicket(int ticket, int month, int seat) {
        double result = 0.;
        double discountW_0 = 0.9;
        double discountD_0 = 0.7;
        double discountW_1 = 0.85;
        double discountD_1 = 0.65;
        if(month >= 5 && month <= 10) {
            if(seat == 0) {
                result = ticket * discountW_0;
            }else if(seat == 1) {
                result = ticket * discountW_1;
            }
        }else if((month >= 11 && month <=12) || (month >=1 && month <= 4)) {
            if(seat == 0) {
                result = ticket * discountD_0;
            }else if(seat == 1) {
                result = ticket * discountD_1;
            }
        }

        return result;
    }
}
