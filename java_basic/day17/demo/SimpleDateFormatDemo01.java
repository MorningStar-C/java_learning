import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        String str = "2022-11-29 12:12:39";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);

        System.out.println(date.getTime());
        method1();
    }

    private static void method1() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String sstr1 = sdf1.format(d1);
        System.out.println(sstr1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String str2 = sdf2.format(d1);

        System.out.println(str2);
    }
}