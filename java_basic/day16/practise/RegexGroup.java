package day16.practise;

public class RegexGroup {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";
        //需求:把重复的内容 替换为 单个的
        //学学                学
        //编编编编            编
        //程程程程程程        程
        //  (.)表示把重复内容的第一个字符看做一组
        //  \\1表示第一字符再次出现
        //  + 至少一次
        //  $1 表示把正则表达式中第一组的内容，再拿出来用
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)
        // \\组号:表示把第X组的内容再出来用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("--------------------------");

        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("abc123acc".matches(regex2));
        System.out.println("--------------------------");

        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        //(.):把首字母看做一组
        // \\2:把首字母拿出来再次使用
        // *:作用于\\2,表示后面重复的内容出现日次或多次
        String regex3 = "((.)\\2+).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("aba123aba".matches(regex3));
        System.out.println("--------------------------");

        //身份证号码的简易正则表达式
        //非捕获分组:仅仅是把数据括起来
        //特点:不占用组号
        //这里\\1报错原因:(?:)就是非捕获分组，此时是不占用组号的。


        //(?:) (?=) (?!)都是非捕获分组//更多的使用第一个
        String regex5 ="[1-9]\\d{16}(?:\\d|X|x)\\1";
        String regex4 ="[1-9]\\d{16}(\\d|X|x)\\1";
        //^([01]\d|2[0-3]):[0-5]\d:[@-5]\d$

        System.out.println("41080119930228457xx".matches(regex5));
    }   
}
