package _2_Observer

interface Observer<T> {
    fun onUpdate(value: T)
}