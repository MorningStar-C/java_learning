package day14.demo.d03;

public class PingPongMan implements Law, SportMan{

    @Override
    public void run() {
        System.out.println("训练跑步");
    }

    @Override
    public void rule() {
        System.out.println("遵纪守法");
    }
    
}
