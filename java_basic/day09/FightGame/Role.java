package day09.FightGame;
import java.util.Random;
/**
 * 游戏角色类
 * @version v0.1 2022-09-08
 * @author MorningStar
 */
public class Role {
    private String name;
    private int hp;
    

    public Role() {

    }

    public Role(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        int remainHp = role.getHp() - hurt;
        remainHp = remainHp < 0 ? 0 : remainHp;
        role.setHp(remainHp);

        System.out.println(this.getName() + "攻击了" + role.getName() + ", " + "造成" + hurt + "点伤害, " + role.getName() + "剩余" + role.hp + "点血");
    }
}
