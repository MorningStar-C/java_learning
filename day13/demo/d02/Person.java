package day13.demo.d02;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal pet, String something) {
        if(pet instanceof Dog d){
            System.out.println("年龄为" + this.age + "的" + this.name + "养了一只" + d.getColor() + "的狗");
            d.eat(something);
            d.lookHome();
        } else if(pet instanceof Cat c) {
            System.out.println("年龄为" + this.age + "的" + this.name + "养了一只" + c.getColor() + "的猫");
            c.eat(something);
            c.catchMouse();
        }
        
    }

    

    
}
