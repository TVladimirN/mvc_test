package ru;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by Vo4ik on 29.11.2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        glue = "ru.steps", features = "src/main/test/feature/",
        tags = "@test")
public class RunCucumber {

    @BeforeClass
    static public void before() {
        System.setProperty("webdriver.chrome.driver", "src/main/test/resources/driver/chromedriver.exe");
    }
}
