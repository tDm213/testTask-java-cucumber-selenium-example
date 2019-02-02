package Steps.Payments;

import Pages.Pages_TB;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class Payments {
    @And("^Payments, I select kommunalnie-platezhi$")
    public void paymentsISelectKommunalniePlatezhi() {
        Pages_TB._Payments()._WidgetPageBlock().Click_KommunalniePlatezhi();
    }
    @And("^Payments, Search field for PaymentServices$")
    public void paymentsSearchFieldForPaymentServices() {
        Pages_TB._Payments()._WidgetPageBlock().Input_Saved_PaymentService();
    }
    @And("^Payments, Search field, Verify ([^\"]*) is first one$")
    public void paymentsSearchFieldVerifyPaymentServicesIsFirstOne(String service) {
       Assert.assertTrue(Pages_TB._Payments()._WidgetPageBlock().Verify_FirstPaymentService(service));
    }
    @And("^Payments, Search field, Click on ([^\"]*)$")
    public void paymentsSearchFieldClickOnPaymentServices(String paymentService) {
        System.out.println("Click on: " + paymentService);
        Pages_TB._Payments()._WidgetPageBlock().Click_FirstPaymentService();
    }

}
