package _2_Observer

fun main() {
    val weatherData = WeatherData()
    val weatherStation = WeatherStationStub(weatherData)

    val display = CurrentConditionsDisplay()
    weatherData.registerObserver(display)

    weatherStation.startCollectingData()

    while (true) {
        val key = readln()
        if (key.lowercase() == "q") {
            weatherStation.stop()
            break
        }
    }
}