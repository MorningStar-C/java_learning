package day08.practise.Cat;
/**
 * Cat Class
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class Cat {
    private String color;
    private String breed;
    
    public Cat() {

    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color + "的" + breed + "在吃饭");
    }

    public void catchMouse() {
        System.out.println(color + "的" + breed + "在抓老鼠");
    }
    

    
}
