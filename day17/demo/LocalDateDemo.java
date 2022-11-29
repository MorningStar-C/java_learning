import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        //获取当前时间的日历对象
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        //获取指定日期
        LocalDate ldDate = LocalDate.of(2021,1,1);
        System.out.println(ldDate);

        System.out.println("===========================");
        int year = ldDate.getYear();
        System.out.println(year);
        Month m = ldDate.getMonth();
        int m1 = ldDate.getMonthValue();
        System.out.println(m);
        System.out.println(m.getValue());
        System.out.println(m1);

        int day = ldDate.getDayOfMonth();
        System.out.println(day);

        int dayOfYear = ldDate.getDayOfYear();
        System.out.println(dayOfYear);

        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));

        LocalDate withLocalDate = ldDate.withYear(2022);
        System.out.println(withLocalDate);

        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);
    }
}
