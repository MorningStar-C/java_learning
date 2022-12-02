package day08.practise.GirlFriend;
/**
 * GirlFriend类
 * @version v0.1 202-09-07
 * @author MorningStar
 */
public class GirlFriend {
    private String name;
    private double height;
    private double heavy;

    public GirlFriend() {

    }

    public GirlFriend(String name, double height, double heavy) {
        this.name = name;
        this.height = height;
        this.heavy = heavy;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeavy() {
        return heavy;
    }

    public void setHeavy(double heavy) {
        this.heavy = heavy;
    }

    public void show() {
        System.out.println("姓名：" + name + "身高：" + height + "体重：" + heavy);
    }

    public void wash() {
        System.out.println("女朋友在洗衣服");
    }

    public void cook() {
        System.out.println("女朋友在做饭");
    }    
}
