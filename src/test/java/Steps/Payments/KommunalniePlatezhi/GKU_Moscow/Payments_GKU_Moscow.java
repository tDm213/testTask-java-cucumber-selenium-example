package Steps.Payments.KommunalniePlatezhi.GKU_Moscow;

import Pages.Pages_TB;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class Payments_GKU_Moscow {

    @And("^kommunalnie platezhi, GKU_Moscow I select PaymentTab$")
    public void paymentsKommunalniePlatezhiGKU_MoscowISelectPaymentTab() {
        Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().Click_PaymentTab();
    }

    @And("^kommunalnie platezhi, GKU_Moscow I click on Pay button$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIClickOnPayButton() {
        Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().Click_PayButton();
    }

    @And("^kommunalnie platezhi, GKU_Moscow I input ([^\"]*) for ProviderPayerCode$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIInputFirstInputForProviderPayerCode(String input) {
        Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().Input_ProviderPayerCode(input);
    }

    @And("^kommunalnie platezhi, GKU_Moscow I input ([^\"]*) for ProviderPeriod$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIInputFirstInputForProviderPeriod(String input) {
        Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().Input_ProviderPeriod(input);
    }

    @And("^kommunalnie platezhi, GKU_Moscow I input ([^\"]*) for PaymentSum$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIInputFirstInputForPaymentSum(String input) {
        Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().Input_PaymentSum(input);
    }

    @And("^kommunalnie platezhi, GKU_Moscow I verify error ([^\"]*) for ProviderPayerCode$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIVerifyErrorEmptyErrorForProviderPayerCode(String errorType) {
        //errorType can be: WrongInput, EmptyError
        Assert.assertTrue(Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().VerifyError_ProviderPayerCode(errorType));
    }

    @And("^kommunalnie platezhi, GKU_Moscow I verify error ([^\"]*) for ProviderPeriod$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIVerifyErrorEmptyErrorForProviderPeriod(String errorType) {
        //errorType can be: WrongInput, EmptyError
        Assert.assertTrue(Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().VerifyError_ProviderPeriod(errorType));
    }

    @And("^kommunalnie platezhi, GKU_Moscow I verify error ([^\"]*) for PaymentSum$")
    public void paymentsKommunalniePlatezhiGKU_MoscowIVerifyErrorEmptyErrorForPaymentSum(String errorType) {
        //errorType can be: WrongInput, EmptyError, WrongInput_Min
        Assert.assertTrue(Pages_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._PaymentBlock().VerifyError_PaymentSum(errorType));
    }
}
