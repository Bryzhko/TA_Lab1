package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.experimental.theories.DataPoints;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/Feature/"},
        glue = {"cucumber.steps"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){return super.scenarios();}
}
