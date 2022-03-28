package _3_Decorator

abstract class CondimentDecorator : Beverage()

class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, Mocha"
    override fun cost(): Float = .2f + beverage.cost()
}

class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, Soy"
    override fun cost(): Float = .15f + beverage.cost()
}

class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override val description: String = "${beverage.description}, Whip"
    override fun cost(): Float = .1f + beverage.cost()
}