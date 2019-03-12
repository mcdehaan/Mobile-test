package app.com.mobileassignment.views.features

import androidx.test.espresso.Espresso.onData
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import app.com.mobileassignment.R
import app.com.mobileassignment.views.MainActivity
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.anything
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SearchFeature {

    var stringToBeTyped: String = "Napel"
    var stringToBeFound: String = "Napel, ID"
    var stringToBeTyped2: String = "Tibe"
    var stringsToBeFound: Array<String> = arrayOf("Tiberias, IL", "Tibet Autonomous Region, CN")

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun changeInput() {
        // Check if search input field is available.
        onView(withId(R.id.search))
                .check(matches(isDisplayed()))

        // Type text.
        onView(withId(R.id.search))
                .perform(typeText(stringToBeTyped), closeSoftKeyboard())

        // Check if the text in the input field changed correctly.
        onView(withId(R.id.search)).check(matches(withText(stringToBeTyped)))
    }

    @Test
    fun findListItem() {
        // Type text and then press the enter button.
        onView(withId(R.id.search))
                .perform(typeText(stringToBeTyped), pressKey(66), closeSoftKeyboard())
        Thread.sleep(2000)

        // Check if the searched for item has been found.
        onView(withText(stringToBeFound))
                .check(matches(isDisplayed()))
    }

    @Test
    fun clickListItem() {
        // Type text and then press the enter button.
        onView(withId(R.id.search))
                .perform(typeText(stringToBeTyped), pressKey(66), closeSoftKeyboard())
        Thread.sleep(2000)

        // Click the found item.
        onData(anything()).inAdapterView(withId(R.id.citiesList))
                .onChildView(allOf(withId(R.id.cityName)))
                .atPosition(0)
                .perform(click())

        // Check if the search activity closed.
        Thread.sleep(2000)
        onView(withId(R.id.search))
                .check(doesNotExist())
    }

    @Test
    fun findMultipleItems() {
        // Type text and then press the enter button.
        onView(withId(R.id.search))
                .perform(typeText(stringToBeTyped2), pressKey(66), closeSoftKeyboard())
        Thread.sleep(2000)

        // Check if the searched for items have been found.
        onData(anything()).inAdapterView(withId(R.id.citiesList)).onChildView(allOf(withId(R.id.cityName))).atPosition(0).check(matches(withText(stringsToBeFound[0])))
        onData(anything()).inAdapterView(withId(R.id.citiesList)).onChildView(allOf(withId(R.id.cityName))).atPosition(1).check(matches(withText(stringsToBeFound[1])))

    }
}