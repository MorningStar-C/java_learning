import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);

        c.add(Calendar.DAY_OF_MONTH, -1);
        
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        LocalDate ld = LocalDate.of(2001, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        int day1 = ld2.getDayOfMonth();
        System.out.println(day1);

        System.out.println(ld.isLeapYear());
    }
}
