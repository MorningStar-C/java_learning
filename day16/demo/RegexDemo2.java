package day16.demo;

public class RegexDemo2 {
    public static void main(String[] args) {
        System.out.println("--------1---------");
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        System.out.println("--------2---------");
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("zz".matches("[^abc]"));
        System.out.println("zz".matches("[^abc][^abc]"));

        System.out.println("--------3---------");
        System.out.println("a".matches("[a-zA-z]"));
        System.out.println("z".matches("[a-zA-z]"));
        System.out.println("zz".matches("[a-zA-z]"));
        System.out.println("zz".matches("[a-zA-z][A-zA-z]"));

        System.out.println("--------4---------");
        System.out.println("a".matches("[a-d[m-p]]"));
        System.out.println("d".matches("[a-d[m-p]]"));
        System.out.println("m".matches("[a-d[m-p]]"));
        System.out.println("p".matches("[a-d[m-p]]"));
        System.out.println("e".matches("[a-d[m-p]]"));

        System.out.println("--------5---------");
        System.out.println("a".matches("[a-z&&[def]]"));
        System.out.println("d".matches("[a-z&&[def]]"));
        System.out.println("0".matches("[a-z&&[def]]"));

        System.out.println("--------6---------");
        System.out.println("a".matches("[a-z&&[^bc]]"));
        System.out.println("b".matches("[a-z&&[^bc]]"));
        System.out.println("0".matches("[a-z&&[^bc]]"));

        System.out.println("--------7---------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));
        System.out.println("m".matches("[a-z&&[^m-p]]"));
        System.out.println("0".matches("[a-z&&[^m-p]]"));
    }
}
