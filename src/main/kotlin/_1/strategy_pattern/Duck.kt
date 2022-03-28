package _1.strategy_pattern

abstract class Duck {
    abstract var quackBehavior: QuackBehavior
    abstract var flyBehavior: FlyBehavior
    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }
    fun performFly() {
        flyBehavior.fly()
    }

    fun swim() {
        println("Все утки плавают, даже утки-приманки")
    }
}

class MallardDuck : Duck() {
    override var quackBehavior: QuackBehavior = Quack()
    override var flyBehavior: FlyBehavior = FlyWithWings()

    override fun display() {
        println("Я дикая утка!")
    }
}

class RedHeadDuck : Duck() {
    override var quackBehavior: QuackBehavior = Quack()
    override var flyBehavior: FlyBehavior = FlyWithWings()

    override fun display() {
        println("Я красноголоваая утка!")
    }
}

class RubberDuck : Duck() {
    override var quackBehavior: QuackBehavior = Squeak()
    override var flyBehavior: FlyBehavior = FlyNoWay()

    override fun display() {
        println("Я утка Навального!")
    }
}

class ModelDuck : Duck() {
    override var quackBehavior: QuackBehavior = Quack()
    override var flyBehavior: FlyBehavior = FlyNoWay()

    override fun display() {
        println("Я утка-приманка!")
    }
}