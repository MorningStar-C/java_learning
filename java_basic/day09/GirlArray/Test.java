package day09.GirlArray;

public class Test {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("诗诗",18,"女","吃零食");
        GirlFriend gf2 = new GirlFriend("秋雅",20,"女","玩游戏");
        GirlFriend gf3 = new GirlFriend("圆圆",20,"女","睡觉");
        GirlFriend gf4 = new GirlFriend("丹丹",18,"女","学习");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            GirlFriend t = arr[i];
            sum += t.getAge();
        }
        int avgAge = sum / 4;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avgAge) {
                count++;
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
            }
        }

        System.out.println(count + "个");

    }
}
