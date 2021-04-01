package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//user//IdeaProjects//Automationframework//src//Feature//Test.feature",
        glue = "Stepdefination"
)



public class Runner {

}
