package app.com.mobileassignment.cucumber.steps

import android.support.test.rule.ActivityTestRule
import app.com.mobileassignment.views.MainActivity
import app.com.mobileassignment.cucumber.espresso.search.SearchScreenRobot
import app.com.mobileassignment.utils.ActivityFinisher
import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class SearchSteps {
    private val robot = SearchScreenRobot()
    private val activityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Before
    fun setup() {
        //not needed now, but you may needed to setup mock responses before your screen starts
    }

    @After
    fun tearDown() {
        ActivityFinisher.finishOpenActivities() // Required for test scenarios with multiple activities or scenarios with more cases
    }

    @Given("^The user starts the application$")
    fun start_app() {
        robot.launchLoginScreen(activityRule)
    }

    @When("^The user clicks the search field$")
    fun click_search_field() {
        robot.selectSearchField()
    }
    /*
    @And("^I close the keyboard$")
    fun i_close_the_keyboard() {
        robot.closeKeyboard()
    }
    @And("^I enter valid email (\\S+)$")
    fun i_enter_valid_email(email: String) {
        //robot.enterEmail(email)
    }
    @And("^I click password field$")
    fun i_click_password_field() {
        robot.selectPasswordField()
    }
    @And("^I enter valid password (\\S+)$")
    fun i_enter_valid_password(password: String) {
        //robot.enterPassword(password)
    }
    @And("^I click sign in button$")
    fun i_click_sign_in_button() {
        robot.clickSignInButton()
    }
    @Then("^I expect to see successful login message$")
    fun i_expect_to_see_successful_login_message() {
        robot.isSuccessfulLogin()
    }
    */
}