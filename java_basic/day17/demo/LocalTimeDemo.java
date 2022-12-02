import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        int hour = nowTime.getHour();
        System.out.println(hour);

        int minute = nowTime.getMinute();
        System.out.println(minute);

        int second = nowTime.getSecond();
        System.out.println(second);

        int nano = nowTime.getNano();
        System.out.println(nano);

        System.out.println("===========================");
        System.out.println(LocalTime.of(8,12));

        LocalTime mTime = LocalTime.of(8, 12,30,212);

        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        System.out.println(nowTime.withHour(10));

        System.out.println(nowTime.plusHours(10));

        System.out.println("===========================");

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getHour());
        System.out.println(today.getMinute());
        System.out.println(today.getSecond());
        System.out.println(today.getNano());

        LocalDate ld = today.toLocalDate();
        System.out.println(ld);

        LocalTime lt = today.toLocalTime();
        System.out.println(lt);

        System.out.println("===========================");
        LocalDateTime bitrhDate = LocalDateTime.of(2000,1,1,0,0,0);
        System.out.println(bitrhDate);

        Duration d = Duration.between(bitrhDate, today);
        System.out.println(d);

        System.out.println("===========================");
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toSeconds());

        System.out.println("===========================");
        LocalDate bD = bitrhDate.toLocalDate();
        LocalDate td = today.toLocalDate();
        
        Period p = Period.between(bD, td);
        System.out.println(p);
        System.out.println("===========================");
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        System.out.println(p.toTotalMonths());

        // ChronoUnit时间间隔（所有单位）

        LocalDateTime  today1 = LocalDateTime.now();
        System.out.println(today1);

        LocalDateTime birthday1 = LocalDateTime.of(2000,1,1,0,0,0);
        System.out.println(birthday1);

        System.out.println(ChronoUnit.YEARS.between(birthday1, today));
        System.out.println(ChronoUnit.YEARS.between(today, birthday1));
        
        


    }
}
