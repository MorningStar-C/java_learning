package day08.practise.Cat;
/**
 * Dog class
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class Dog {
    private String color;
    private String breed;

    public Dog() {

    }

    public Dog(String color, String breed) {
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

    public void lookHome() {
        System.out.println(color + "的" + breed + "在看家");
    }

    
}
