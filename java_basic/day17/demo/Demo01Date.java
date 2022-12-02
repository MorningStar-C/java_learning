import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date(0L));

        Date d = new Date();

        long time = System.currentTimeMillis();
        // long time = d.getTime();
        d.setTime(time);
        System.out.println(time);
        System.out.println(d);
    }
}