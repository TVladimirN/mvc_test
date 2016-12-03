import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static steps.DefaultSteps.wDriver;

/**
 * Created by Vo4ik on 03.12.2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        features = "src/main/test/feature/")
public class RunCucumber {

    @BeforeClass
    public static void beforeTest() {
    }


    @AfterClass
    public static void AfterTest() {
        wDriver.close();
    }
}
