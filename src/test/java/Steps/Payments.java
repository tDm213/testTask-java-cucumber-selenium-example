package Steps;

import Base.BrowserChrome;
import Pages.Pages_TB;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class Payments {
    @And("^Payments, I select kommunalnie-platezhi$")
    public void paymentsISelectKommunalniePlatezhi() {
        Pages_TB._Payments()._WidgetPageBlock().Click_KommunalniePlatezhi();
    }

    @And("^Payments, kommunalnie platezhi, If Region is not ([^\"]*) I select it$")
    public void paymentsKommunalniePlatezhiIfRegionIsNotRegionFirstISelectIt(String region) {

        // If you don't see expected region => select it
        if (!Pages_TB._Payments()._PaymentsCategoriesHousing().VerifyBodyRegion(region)) {
            Pages_TB._Payments()._PaymentsCategoriesHousing().Click_BodyRegion();
            Pages_TB._Payments()._PaymentsCategoriesHousing().Click_ExpectedRegion();
        }

        // Verify that expected region equals to actual region
        Assert.assertTrue(Pages_TB._Payments()._PaymentsCategoriesHousing().VerifyBodyRegion(region));

        BrowserChrome.WaitSeconds(10);
    }
}
