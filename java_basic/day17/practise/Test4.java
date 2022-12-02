import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Test4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998, 12, 13);
        System.out.println(birthday);   
        // LocalDate td = LocalDate.now();
        LocalDate td = LocalDate.of(2098, 12,17);
        
        long days = ChronoUnit.DAYS.between(birthday, td);
        //long years = ChronoUnit.YEARS.between(birthday, td);

       // Period pd = Period.between(birthday, td);
       // System.out.println(pd.toTotalMonths());
        System.out.println(days);
       // System.out.println(years);

    
    }
}
