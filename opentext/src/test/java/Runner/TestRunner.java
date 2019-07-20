package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\truweight\\git\\BDDFrame\\opentext\\features\\campagins.feature"
		,glue={"stepdefination"},
		plugin = { "pretty" },
		monochrome = true,
		dryRun=false,
		strict=true
		
		)

public class TestRunner {

}