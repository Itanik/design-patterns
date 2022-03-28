package _1.strategy_pattern.start

abstract class Duck {
    abstract val quackBehavior: QuackBehavior
    abstract val flyBehavior: FlyBehavior
    abstract fun display()
    fun swim() {
        println("Все утки плавают, даже утки-приманки")
    }
}

class MallardDuck : Duck() {
    override val quackBehavior = Quack()
    override val flyBehavior = FlyWithWings()

    fun performQuack() {
        quackBehavior.quack()
    }
    fun performFly() {
        flyBehavior.fly()
    }
    override fun display() {
        println("Я дикая утка!")
    }
}

class RedHeadDuck : Duck() {
    override val quackBehavior = Quack()
    override val flyBehavior = FlyWithWings()
    override fun display() {
        println("Я красноголоваая утка!")
    }
}

class RubberDuck : Duck() {
    override val quackBehavior = Squeak()
    override val flyBehavior = FlyNoWay()
    override fun display() {
        println("Я утка Навального!")
    }
}