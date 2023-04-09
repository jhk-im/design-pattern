package quack;

public class MuteQuack implements QauckBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
