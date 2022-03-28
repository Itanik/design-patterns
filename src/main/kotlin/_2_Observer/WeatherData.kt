package _2_Observer

class WeatherData : Observable<Weather> {
    private val observers = mutableListOf<Observer<Weather>>()

    override fun registerObserver(observer: Observer<Weather>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<Weather>) {
        observers.remove(observer)
    }

    override fun notifyObservers(result: Weather) {
        observers.forEach { it.onUpdate(result) }
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        notifyObservers(Weather(temperature, humidity, pressure))
    }
}

data class Weather(
    val temperature: Float,
    val humidity: Float,
    val pressure: Float
)