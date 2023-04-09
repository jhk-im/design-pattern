package duck;

import fly.FlyNoWay;
import quack.Quack;

public class ModelDuck extends  Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형오리");
    }
}
