package day08.practise.Phone;
/**
 * Phone测试类
 * @version v0.1 2022-09-07
 * @author MorningStar
 */

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setPrice(1999.9);
        p1.setColor("白色");
        System.out.println("正在使用价格为" + p1.getPrice() + p1.getColor() + "的" + p1.getBrand() + "手机" + p1.call());

        Phone p2 = new Phone("一加", 2999.9, "绿色");
        System.out.println("正在使用价格为" + p2.getPrice() + p2.getColor() + "的" + p2.getBrand() + "手机" + p2.sendMesage());

    }
}