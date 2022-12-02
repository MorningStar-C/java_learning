package day14.practise.p02;

public class Test {
    public static void main(String[] args) {
        Phone o = new OldPhone();
        o.call();
        o.Message();

        Phone n = new NewPhone();
        n.call();
        n.Message();
        if(n instanceof NewPhone s) {
            s.playGame();
        }

        new IPlay() {
            @Override
            public void playGame() {
                // TODO Auto-generated method stub
                System.out.println("匿名内部类调用");   
            }
        }.playGame();

        new Phone(){
        }.Message();
    }
}
