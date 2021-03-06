package _1_Strategy

interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        println("Кря кря!")
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        println("*минус уши*")
    }
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("...")
    }
}