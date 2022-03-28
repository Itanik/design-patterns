package _2_Observer

interface Observable<T> {
    fun registerObserver(observer: Observer<T>)
    fun removeObserver(observer: Observer<T>)
    fun notifyObservers(result: T)
}