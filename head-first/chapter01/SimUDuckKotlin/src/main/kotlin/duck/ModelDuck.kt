package duck

import fly.FlyNoWay
import quack.Quack

class ModelDuck() : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("모형오리")
    }
}