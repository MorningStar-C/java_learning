import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class MiaoSha {
    public static void main(String[] args) throws ParseException{
        String startTime = "2023年11月11日 00:00:00";
        String endTime = "2023年11月11日 00:10:00";

        String payTime01 = "2023年11月11日 00:01:00";
        String payTime02 = "2023年11月11日 00:11:00";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf1.parse(startTime);
        Date d2 = sdf1.parse(endTime);
        Date p1 = sdf1.parse(payTime01);
        Date p2 = sdf1.parse(payTime02);

        long s = d1.getTime();
        long e = d2.getTime();
        long pay01 = p1.getTime();
        long pay02 = p2.getTime();

        boolean r1 = pay01 >= s && pay01 <= e ? true : false;
        boolean r2 = pay02 >= s && pay02 <= e ? true : false;

        System.out.println(r1);
        System.out.println(r2);
    }
}