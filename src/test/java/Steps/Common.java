package Steps;

import Base.BrowserChrome;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class Common {
    @And("^Verify ([^\"]*) with ActualURL$")
    public void verifyExpectedURLWithActualURL(String ExpectedURL) {
        BrowserChrome.WaitSeconds(3);

        String actualURL = BrowserChrome.webDriver.getCurrentUrl();
        System.out.println("actualURL: " + actualURL);
        Assert.assertEquals(ExpectedURL, actualURL);
    }
}
