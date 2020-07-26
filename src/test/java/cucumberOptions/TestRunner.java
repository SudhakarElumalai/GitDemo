package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/features",
			glue="stepDefinition",tags="@SmokeTest",strict=true,
			plugin={"pretty","html:target/cucumber","json:target/cucumber.json",
					"junit:target/cukes.xml"})
//dryRun=true for code coverage, we can check whether all step definition and feature are mapped
//reports==plugin keyword
//monochrome=true neat conso;e output
//strict=true
public class TestRunner {

}
