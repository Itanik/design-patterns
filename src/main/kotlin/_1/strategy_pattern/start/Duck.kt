package _1.strategy_pattern.start

open class Duck {
    fun quack() {}
    fun swim() {}
    open fun display() {}
    fun fly() {}
}

class MallardDuck : Duck() {
    override fun display() {}
}

class RedHeadDuck : Duck() {
    override fun display() {}
}

class RubberDuck : Duck() {
    override fun display() {}
}