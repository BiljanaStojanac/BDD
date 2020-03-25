package c_runer;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        features =  "C://Users//bstojanac//Downloads//AppiumTesting//BDD//Feature",
        glue = "b_steps",
        monochrome = true,
        tags = {"@Table"},
        plugin = {"pretty", "html:target/cucumber"}
)

public class TestRunner {
}
