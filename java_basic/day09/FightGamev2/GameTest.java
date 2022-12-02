package day09.FightGamev2;
/**
 * 游戏测试类
 * @version v0.1 2022-09-08
 * @author MorningStar
 */
public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role();
        r1.setName("老王");
        r1.setHp(100);
        r1.setGender('男');
        r1.setFace(r1.getGender());
        Role r2 = new Role("老李", 100, '男');

        r1.showRoleInfo();
        r2.showRoleInfo();

        while(true) {
            r1.attack(r2);

            if(r2.getHp() == 0) {
                System.out.println(r1.getName() + "战胜" + r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getHp() == 0) {
                System.out.println(r2.getName() + "战胜" + r1.getName());
                break;
            }
        }
    }
}
