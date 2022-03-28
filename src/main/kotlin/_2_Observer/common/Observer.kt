package _2_Observer.common

interface Observer<T> {
    fun onUpdate(value: T)
}