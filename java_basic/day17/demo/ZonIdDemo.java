import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZonIdDemo {
    public static void main(String[] args) {
        /*
        static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
        static ZoneId systemDefault() 获取系统默认时区
        static Zoneld of(string zoneld) 获取一个指定时区
        */

        // 获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);
        // 获取当前时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        // 获取指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);

        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneIdzone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */
        System.out.println("--------------------------------");

        // 获取当前时间的Instant对象
        Instant now = Instant.now();
        System.out.println(now);

        // 根据（s/ms/ns)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        // 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);

        /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */
        System.out.println("--------------------------------");
        ZonedDateTime nowTime = ZonedDateTime.now();
        System.out.println(nowTime);

        ZonedDateTime time1 = ZonedDateTime.of(2023,10,1, 11,12,12,0,ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);
        
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId3 = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId3);
        System.out.println(time2);

        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);

        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);

        /*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */
        System.out.println("--------------------------------");
        ZonedDateTime time6 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf1.format(time6));
    }
}
