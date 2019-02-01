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
    }

    @And("^Payments, kommunalnie platezhi, I select pay to FirstPaymentService ([^\"]*)$")
    public void paymentsKommunalniePlatezhiISelectPayToPaymentServices(String expectedPaymentService) {
        Assert.assertTrue(Pages_TB._Payments()._PaymentsCategoriesHousing().VerifyFirstPaymentService(expectedPaymentService));
        Pages_TB._Payments()._PaymentsCategoriesHousing().Click_FirstPaymentService();


        BrowserChrome.WaitSeconds(10);
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I select PaymentTab$")
    public void paymentsKommunalniePlatezhiGKU_MoscowISelectPaymentTab() {
        Pages_TB._Payments()._PaymentBlock().Click_PaymentTab();
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I click on Pay button$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIClickOnPayButton() {
        Pages_TB._Payments()._PaymentBlock().Click_PayButton();
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I input ([^\"]*) for ProviderPayerCode$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIInputFirstInputForProviderPayerCode(String input) {
        Pages_TB._Payments()._PaymentBlock().Input_ProviderPayerCode(input);
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I input ([^\"]*) for ProviderPeriod$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIInputFirstInputForProviderPeriod(String input) {
        Pages_TB._Payments()._PaymentBlock().Input_ProviderPeriod(input);
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I input ([^\"]*) for PaymentSum$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIInputFirstInputForPaymentSum(String input) {
        Pages_TB._Payments()._PaymentBlock().Input_PaymentSum(input);
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I verify error ([^\"]*) for ProviderPayerCode$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIVerifyErrorEmptyErrorForProviderPayerCode(String errorType) {
        Pages_TB._Payments()._PaymentBlock().VerifyError_ProviderPayerCode(errorType);
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I verify error ([^\"]*) for ProviderPeriod$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIVerifyErrorEmptyErrorForProviderPeriod(String errorType) {
        Pages_TB._Payments()._PaymentBlock().VerifyError_ProviderPeriod(errorType);
    }

    @And("^Payments, kommunalnie platezhi, GKU_Moscow I verify error ([^\"]*) for PaymentSum$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIVerifyErrorEmptyErrorForPaymentSum(String errorType) {
        Pages_TB._Payments()._PaymentBlock().VerifyError_PaymentSum(errorType);
    }

    @And("^Payments, kommunalnie platezhi, I verify ([^\"]*) ([^\"]*)$")
    public void paymentsKommunalniePlatezhiIVerifyPaymentServices(Boolean bool, String paymentService) {
        if (bool.equals(true)) {
            Assert.assertTrue(Pages_TB._Payments()._PaymentsCategoriesHousing().VerifyPaymentService(paymentService));
        }

        if (bool.equals(false)) {
            Assert.assertFalse(Pages_TB._Payments()._PaymentsCategoriesHousing().VerifyPaymentService(paymentService));
        }
    }

    @And("^Payments, Search field for PaymentServices$")
    public void paymentsSearchFieldForPaymentServices() {
        Pages_TB._Payments()._PaymentBlock().Input_Saved_PaymentService();
    }

    @And("^Payments, Search field, Verify ([^\"]*) is first one$")
    public void paymentsSearchFieldVerifyPaymentServicesIsFirstOne(String service) {
        Pages_TB._Payments()._WidgetPageBlock().Verify_FirstPaymentService(service);
    }

    @And("^Payments, Search field, Click on ([^\"]*)$")
    public void paymentsSearchFieldClickOnPaymentServices(String paymentService) {
        System.out.println("Click on: " + paymentService);
        Pages_TB._Payments()._WidgetPageBlock().Click_FirstPaymentService();
    }

}
