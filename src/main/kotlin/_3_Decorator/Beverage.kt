package _3_Decorator

abstract class Beverage {
    abstract val description: String
    abstract fun cost(): Float

    fun display() {
        println("$description $${cost()}")
    }
}

class HouseBlend : Beverage() {
    override val description: String = "HouseBlend"
    override fun cost(): Float = .89f
}

class Espresso : Beverage() {
    override val description: String = "Espresso"
    override fun cost(): Float = 1.99f
}

class DarkRoast : Beverage() {
    override val description: String = "DarkRoast"
    override fun cost(): Float = .99f
}

class Decaf : Beverage() {
    override val description: String = "Decaf"
    override fun cost(): Float = 1.05f
}