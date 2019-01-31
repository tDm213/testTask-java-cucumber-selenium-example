package Steps;

import Pages.Pages_TB;
import cucumber.api.java.en.Given;

public class HomePage {
    @Given("^HomePage, I go to the Home Page$")
    public void homepageIGoToTheHomePage() {
        Pages_TB._HomePage().GetHomePageURL();
    }
}
