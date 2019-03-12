package app.com.mobileassignment.views.features

import androidx.test.espresso.Espresso.onData
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import app.com.mobileassignment.R
import app.com.mobileassignment.views.MapActivity
import org.hamcrest.CoreMatchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MapFeature {

    @get:Rule var activityScenarioRule = activityScenarioRule<MapActivity>()

    @Test
    fun checkMap() {
        Thread.sleep(2000)
        // Find map in view.
        onData(CoreMatchers.anything())
                .inAdapterView(ViewMatchers.withId(R.id.insert_point))
    }

}



