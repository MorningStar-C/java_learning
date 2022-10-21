package day09.FightGame;
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
        Role r2 = new Role("老李", 100);

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
