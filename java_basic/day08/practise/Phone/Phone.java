package day08.practise.Phone;

/**
 * 手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，
 * 有打电话call()和sendMessage()两个功能。
 * 
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {

    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    public String call() {
       return "打电话";
    }

    public String sendMesage() {
        return "发短信";
    }
}
