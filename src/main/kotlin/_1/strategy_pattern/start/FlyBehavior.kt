package _1.strategy_pattern.start

interface FlyBehavior {
    fun fly()
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("Я летаю!")
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("Не умею летать(((")
    }
}