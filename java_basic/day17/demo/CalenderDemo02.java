import java.util.Calendar;

public class CalenderDemo02 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();

        c1.set(Calendar.YEAR, 1999);
        c1.set(Calendar.MONTH, 10 - 1);
        c1.set(Calendar.DAY_OF_MONTH, 9);

        int w = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println(getWeek(w));

        c1.add(Calendar.DAY_OF_MONTH, 200);

        int y = c1.get(Calendar.YEAR);
        int m = c1.get(Calendar.MONTH) + 1;
        int d = c1.get(Calendar.DAY_OF_MONTH);

        int wk = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println("200天后：" + y + "年" + m + "月" + d + "日" + getWeek(wk));
    }

    public static String getWeek(int w) {
        String[] weekArr = {"星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        return weekArr[w - 1];
    }
}