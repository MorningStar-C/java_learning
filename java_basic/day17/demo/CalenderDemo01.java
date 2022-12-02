import java.util.Calendar;

public class CalenderDemo01 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        System.out.println(instance);

        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int day = instance.get(Calendar.DAY_OF_MONTH);

        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);

        int week = instance.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);

        System.out.println(getWeek(week));

    }

    public static String getWeek(int w) {
        String[] weekArr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        return weekArr[w - 1];
    }
}