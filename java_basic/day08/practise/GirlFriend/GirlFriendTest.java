package day08.practise.GirlFriend;
/**
 * GirlFiend测试
 * @version v0.1 2022-09-07
 * @author MorningStar
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("ruirui");
        gf1.setHeight(170);
        gf1.setHeavy(120);

        gf1.show();
        gf1.cook();
        gf1.wash();
    }
}
