package _2_Observer

import kotlin.random.Random

interface WeatherStation {
    fun startCollectingData()
    fun stop()
}

class WeatherStationStub(var weatherData: WeatherData) : WeatherStation {
    private var started = false
    private val random = Random.Default

    override fun startCollectingData() {
        started = true
        Thread {
            while (started) {
                weatherData.setMeasurements(
                    random.nextDouble(-30.0, 30.0).toFloat(),
                    random.nextDouble(50.0, 100.0).toFloat(),
                    random.nextDouble(250.0, 300.0).toFloat(),
                )
                Thread.sleep(1000L)
            }
        }.start()
    }

    override fun stop() {
        started = false
    }

}