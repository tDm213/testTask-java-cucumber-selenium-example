package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"} ,
        plugin = {"html:target/Tests/PaymentsValidation_GKU_Moscow/selenium-reports"},
        tags = {"@PaymentsValidation_GKU_Moscow"},
        format = {"pretty", "json:target/Tests/PaymentsValidation_GKU_Moscow_AT.json",
                "html:target/site/cucumber-pretty"},
        glue = {"Base","Steps"})
public class PaymentsValidation_GKU_Moscow_AT {

}