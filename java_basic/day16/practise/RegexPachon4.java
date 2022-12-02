package day16.practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPachon4 {
    public static void main(String[] args) {
        /*
            有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
        */

        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
            "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
        String regex1 = "((?i)Java)(?=8|11|17)";
        
        String regex2 = "((?i)Java)(8|11|17)";

        String regex3 = "((?i)Java)(?:8|11|17)";

        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(s);

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
