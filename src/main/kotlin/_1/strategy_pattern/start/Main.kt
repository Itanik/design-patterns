package _1.strategy_pattern.start

fun main(args: Array<String>) {
    val mallard = MallardDuck()
    mallard.display()
    mallard.performQuack()
    mallard.performFly()

    val rocketDuck = ModelDuck()
    rocketDuck.display()
    rocketDuck.performFly()
    rocketDuck.flyBehavior = FlyRocketPowered()
    rocketDuck.performFly()
}