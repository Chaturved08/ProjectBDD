package Testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/feature",
        glue = "login",
        
        dryRun = false,
        monochrome = true,
         plugin = {"pretty","html: Report/CUCUreport.html"}
        )

public class runner {

}
