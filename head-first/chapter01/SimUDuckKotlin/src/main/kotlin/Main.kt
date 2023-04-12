import duck.Duck
import duck.MallardDuck
import duck.ModelDuck
import fly.FlyRocketPowered

fun main(args: Array<String>) {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    val model: Duck = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}