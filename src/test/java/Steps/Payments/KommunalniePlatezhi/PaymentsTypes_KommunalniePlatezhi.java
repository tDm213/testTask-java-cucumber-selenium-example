package Steps.Payments.KommunalniePlatezhi;

import Pages.Pages_TB;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class PaymentsTypes_KommunalniePlatezhi {

    @And("^kommunalnie platezhi, If Region is not ([^\"]*) I select it$")
    public void paymentsKommunalniePlatezhiIfRegionIsNotRegionFirstISelectIt(String region) {

        // If you don't see expected region => select it
        if (!Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().VerifyBodyRegion(region)) {
            Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().Click_BodyRegion();
            Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().Click_ExpectedRegion();
        }

        // Verify that expected region equals to actual region
        Assert.assertTrue(Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().VerifyBodyRegion(region));
    }

    @And("^kommunalnie platezhi, I select pay to FirstPaymentService ([^\"]*)$")
    public void paymentsKommunalniePlatezhiISelectPayToPaymentServices(String expectedPaymentService) {
        Assert.assertTrue(Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().VerifyFirstPaymentService(expectedPaymentService));
        Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().Click_FirstPaymentService();
    }

    @And("^kommunalnie platezhi, I verify ([^\"]*) ([^\"]*)$")
    public void paymentsKommunalniePlatezhiIVerifyPaymentServices(Boolean bool, String paymentService) {
        if (bool.equals(true)) {
            Assert.assertTrue(Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().VerifyPaymentService(paymentService));
        }

        if (bool.equals(false)) {
            Assert.assertFalse(Pages_TB._Payments()._KommunalniePlatezhi()._PaymentsCategoriesHousing().VerifyPaymentService(paymentService));
        }
    }
}
