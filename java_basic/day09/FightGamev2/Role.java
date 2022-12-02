package day09.FightGamev2;
import java.util.Random;
/**
 * 游戏角色类
 * @version v0.1 2022-09-08
 * @author MorningStar
 */
public class Role {
    private String name;
    private int hp;
    private char gender;
    private String face;

    //男生长相数组
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
//女生长相数组
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    
    //attack 攻击描述：
    String[] attacks_desc = {
        "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
        "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
        "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
        "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
        "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
        "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
        "结果%s退了半步，毫发无损",
        "结果给%s造成一处瘀伤",
        "结果一击命中，%s痛得弯下腰",
        "结果%s痛苦地闷哼了一声，显然受了点内伤",
        "结果%s摇摇晃晃，一跤摔倒在地",
        "结果%s脸色一下变得惨白，连退了好几步",
        "结果『轰』的一声，%s口中鲜血狂喷而出",
        "结果%s一声惨叫，像滩软泥般塌了下去"
    };


    public Role(String name, int hp, char gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        setFace(gender);
    }

    public Role() {

    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();

        if(gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面目未知";
        }
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
        int index = r.nextInt(attacks_desc.length);
        String hurtDesc = attacks_desc[index];

        System.out.printf(hurtDesc + '\n', this.getName(), role.getName());

        int hurt = r.nextInt(20) + 1;
        int remainHp = role.getHp() - hurt;
        remainHp = remainHp < 0 ? 0 : remainHp;
        role.setHp(remainHp);

        if(remainHp > 90) {
            System.out.printf(injureds_desc[0] + '\n', role.getName());
        }else if(remainHp > 80 && remainHp <= 90) {
            System.out.printf(injureds_desc[1] + '\n', role.getName());
        }else if(remainHp > 70 && remainHp <= 80) {
            System.out.printf(injureds_desc[2] + '\n', role.getName());
        }else if(remainHp > 60 && remainHp <= 70) {
            System.out.printf(injureds_desc[3] + '\n', role.getName());
        }else if(remainHp > 40 && remainHp <= 60) {
            System.out.printf(injureds_desc[4] + '\n', role.getName());
        }else if(remainHp > 20 && remainHp <= 40) {
            System.out.printf(injureds_desc[5] + '\n', role.getName());
        }else if(remainHp > 10 && remainHp <= 20) {
            System.out.printf(injureds_desc[6] + '\n', role.getName());
        }else {
            System.out.printf(injureds_desc[7] + '\n', role.getName());
        }

        //System.out.println(this.getName() + "攻击了" + role.getName() + ", " + "造成" + hurt + "点伤害, " + role.getName() + "剩余" + role.hp + "点血");
    }

    public void showRoleInfo() {
        System.out.println("姓名: " + getName());
        System.out.println("血量: " + getHp());
        System.out.println("性别: " + getGender());
        System.out.println("长相: " + getFace());
    }
}
