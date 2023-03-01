package stepdef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = {"Feature files"},
		glue={"stepdef"},
        plugin = {"pretty",
                "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"
        },
		//dryRun = true,
	   // tags= "@smoke"
	    dryRun = false,
	    	    //tags= "@QRCode",
	    	    tags= "@Login and @sanity or @smoke "
	    	    //tags= "@Regression"


		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}

