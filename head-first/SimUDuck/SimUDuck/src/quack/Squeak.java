package quack;

public class Squeak implements QauckBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
