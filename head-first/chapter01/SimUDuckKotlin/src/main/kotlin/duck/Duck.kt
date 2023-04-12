package duck

import fly.FlyBehavior
import quack.QuackBehavior

abstract class Duck {

    // 행동 인터페이스 형식의 레퍼런스 선언
    // 패키지에 속한 모든 서브 클래스에서 이 변수를 상속 받음
    var flyBehavior: FlyBehavior? = null
    var quackBehavior: QuackBehavior? = null

    abstract fun display()

    open fun performFly() {
        flyBehavior?.fly() // 행동클래스에 위임
    }

    open fun performQuack() {
        quackBehavior?.quack() // 행동클래스에 위임
    }

    open fun swim() {
        println("모든 오리는 물에 뜸")
    }
}