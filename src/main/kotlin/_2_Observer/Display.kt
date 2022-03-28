package _2_Observer

import _2_Observer.common.Observer

interface Display {
    fun displayData(weather: Weather)
}

class CurrentConditionsDisplay : Display, Observer<Weather> {
    override fun displayData(weather: Weather) {
        println("Current conditions: temperature=${weather.temperature}, himidity=${weather.humidity}, pressure=${weather.pressure}")
    }

    override fun onUpdate(value: Weather) {
        displayData(value)
    }
}