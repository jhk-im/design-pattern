package duck

import fly.FlyWithWings
import quack.Quack

class MallardDuck() : Duck() {

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("물오리")
    }
}