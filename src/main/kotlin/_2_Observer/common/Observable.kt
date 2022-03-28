package _2_Observer.common

interface Observable<T> {
    fun registerObserver(observer: Observer<T>)
    fun removeObserver(observer: Observer<T>)
    fun notifyObservers(result: T)
}

open class BooleanObservable : Observable<Boolean> {
    private val observers = mutableListOf<Observer<Boolean>>()

    override fun registerObserver(observer: Observer<Boolean>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<Boolean>) {
        observers.remove(observer)
    }

    override fun notifyObservers(result: Boolean) {
        observers.forEach { it.onUpdate(result) }
    }
}