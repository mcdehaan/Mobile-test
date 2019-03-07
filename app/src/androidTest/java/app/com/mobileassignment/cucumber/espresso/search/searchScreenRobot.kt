package app.com.mobileassignment.cucumber.espresso.search

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import app.com.mobileassignment.views.MainActivity
import app.com.mobileassignment.R
import java.lang.Thread.sleep

class SearchScreenRobot {

    fun launchLoginScreen(testRule: ActivityTestRule<MainActivity>) {
        testRule.launchActivity(null)
    }

    fun selectSearchField() {
        onView(withId(R.id.search_bar)).perform(click())
    }

    fun selectPasswordField() {
        onView(withId(R.id.search_button)).perform(click())
    }

    fun closeKeyboard() {
        Espresso.closeSoftKeyboard()
        sleep(100)
    }

    fun clickSignInButton() {
        //onView(withText(InstrumentationRegistry.getTargetContext().getString(R.string.action_sign_in))).perform(click())
    }

    fun isSuccessfulLogin() {
        //onView(withId(R.id.successful_login_text_view)).check(matches(isDisplayed()))
        //onView(withId(R.id.successful_login_text_view)).check(matches(withText(R.string.successful_login)))
    }

}
