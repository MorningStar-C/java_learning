package day14.demo.d02;

public class PingPongMan implements SportsMan{
    @Override
    public void run() {
        System.out.println("乒乓球运动员在跑步");
    }

    @Override
    public void law() {
        System.out.println("乒乓球运动员守法");
    }

    @Override
    public String compition(String project) {
        return "参加"+ project + "比赛";
    }
}
