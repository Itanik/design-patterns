package _2_Observer.swing_components

import _2_Observer.common.BooleanObservable
import _2_Observer.common.Observer
import _2_Observer.Weather
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.GridLayout
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.*

class SwingWindow : JFrame(), Observer<Weather> {
    private var started = false
    val buttonObservable = BooleanObservable()
    private val weatherSuffix = "Weather data:"

    private val panel = JPanel().apply {
        border = BorderFactory.createEmptyBorder(30, 30, 10, 30)
        layout = GridLayout(0, 1)
        this@SwingWindow.add(this, BorderLayout.CENTER)
    }

    private val label = JLabel(weatherSuffix).apply {
        panel.add(this)
    }

    private val button = JButton("Start").apply {
        addActionListener {
            text = if (started) "Start" else "Stop"
            started = !started
            buttonObservable.notifyObservers(started)
        }
        panel.add(this)
    }

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Weather Station"
        size = Dimension(600, 200)
        isVisible = true
        println("Show window")
        addWindowListener(object : WindowListener {
            override fun windowOpened(e: WindowEvent?) {}
            override fun windowClosing(e: WindowEvent?) {
                println("Window closing")
                buttonObservable.notifyObservers(false)
            }

            override fun windowClosed(e: WindowEvent?) {}
            override fun windowIconified(e: WindowEvent?) {}
            override fun windowDeiconified(e: WindowEvent?) {}
            override fun windowActivated(e: WindowEvent?) {}
            override fun windowDeactivated(e: WindowEvent?) {}
        })
    }

    override fun onUpdate(weather: Weather) {
        label.text =
            weatherSuffix + " temperature: ${weather.temperature}, humidity: ${weather.humidity}, pressure: ${weather.pressure}"
    }
}