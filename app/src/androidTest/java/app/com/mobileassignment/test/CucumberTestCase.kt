import cucumber.api.CucumberOptions

@CucumberOptions(features = ["features"],
        glue = ["app.com.mobileassignment.cucumber.steps"],
        tags = ["@e2e", "@smoke"])

@Suppress("unused")

class CucumberTestCase