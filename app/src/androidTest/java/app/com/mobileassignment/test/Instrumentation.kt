package app.com.mobileassignment.test

import android.os.Bundle
import cucumber.api.android.CucumberInstrumentationCore
import android.support.test.runner.MonitoringInstrumentation


class Instrumentation : MonitoringInstrumentation() {
    private val instrumentationCore = CucumberInstrumentationCore(this)
    override fun onCreate(arguments: Bundle) {
        super.onCreate(arguments)

        instrumentationCore.create(arguments)
        start()
    }

    override fun onStart() {
        super.onStart()
        waitForIdleSync()
        instrumentationCore.start()
    }
}