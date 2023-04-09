package duck;

import fly.FlyBehavior;
import quack.QauckBehavior;

public abstract class Duck {

    // 행동 인터페이스 형식의 레퍼런스 선언
    // 패키지에 속한 모든 서브 클래스에서 이 변수를 상속 받음
    FlyBehavior flyBehavior;
    QauckBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QauckBehavior qb) {
        quackBehavior = qb;
    }

    public Duck() { }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(); // 행동클래스에 위임
    }

    public void performQuack() {
        quackBehavior.quack(); // 행동클래스에 위임
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜸");
    }
}