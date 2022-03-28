package _1_Strategy

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

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        println("SPAAAAACE!")
    }
}