package Steps;

import Base.BrowserChrome;
import Pages.Pages_TB;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePage {
    @Given("^HomePage, I go to the Home Page$")
    public void homepageIGoToTheHomePage() {
        Pages_TB._HomePage().GetHomePageURL();
    }

    @And("^HomePage, footer, I click on payments$")
    public void homepageFooterIClickOnPayments() {
        Pages_TB._HomePage()._Body().Click_Payments();
    }
}
