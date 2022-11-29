package day16.practise;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPachong1 {
    public static void main(String[] args) {
        /* 有如下文本，请按照要求爬取数据。
            Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
            因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
            要求:找出里面所有的JavaXX
        */   
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        
        //1. 获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2. 获取文本匹配器对象
        //拿m读取str,寻找符合p规则的子串
        Matcher m = p.matcher(str);

        //3. 利用循环获取
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }

    }
}
