package _2_Observer

import _2_Observer.common.Observer
import _2_Observer.swing_components.SwingWindow
import javax.swing.UIManager

fun main() {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())

    val weatherData = WeatherData()
    val weatherStation = WeatherStationStub(weatherData)

    val display = CurrentConditionsDisplay()
    weatherData.registerObserver(display)

    val window = SwingWindow()
    weatherData.registerObserver(window)
    window.buttonObservable.registerObserver(object : Observer<Boolean> {
        override fun onUpdate(value: Boolean) {
            if (value)
                weatherStation.startCollectingData()
            else
                weatherStation.stop()
        }
    })
}