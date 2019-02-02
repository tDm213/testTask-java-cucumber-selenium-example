package Pages.Payments.KommunalniePlatezhi.GKU_Moscow;

import Base.BrowserChrome;
import Elements.Elements_TB;
import Elements.Payments.KommunalniePlatezhi.GKU_Moscow.elPaymentBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static Base.ConfigMain.PAGE_LOAD_TIMEOUT;

public class PaymentBlock {

    public void Click_PaymentTab ()
    {
        System.out.println("Click_PaymentTab");

        By element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()
                ._elPaymentBlock().Find(elPaymentBlock.Element.elPaymentTab);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Click_PaymentTab");
        }
    }

    public void Click_PayButton ()
    {
        System.out.println("Click_PayButton");

        By element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()
                ._elPaymentBlock().Find(elPaymentBlock.Element.elPayButton);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Click_PayButton");
        }
    }

    public void Input_ProviderPayerCode (String input)
    {
        System.out.println("Input_ProviderPayerCode");

        By element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                .Find(elPaymentBlock.Element.elInput_ProviderPayerCode);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).clear();
                BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
                BrowserChrome.webDriver.findElement(element).sendKeys(input);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Input_ProviderPayerCode");
        }
    }

    public void Input_ProviderPeriod (String input)
    {
        System.out.println("Input_ProviderPeriod");

        By element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                .Find(elPaymentBlock.Element.elInput_ProviderPeriod);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).clear();
                BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
                BrowserChrome.webDriver.findElement(element).sendKeys(input);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Input_ProviderPeriod");
        }
    }
    public void Input_PaymentSum (String input)
    {
        System.out.println("Input_PaymentSum");

        By element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                .Find(elPaymentBlock.Element.elInput_PaymentSum);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
                BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
                BrowserChrome.webDriver.findElement(element).sendKeys(input);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Input_PaymentSum");
        }
    }

    public boolean VerifyError_ProviderPayerCode(String errorType) {
        System.out.println("VerifyError_ProviderPayerCode: " + errorType);
        By element = By.xpath("");

        if (errorType.equals("EmptyError"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elProviderPayerCode_EmptyError);
        }
        else if (errorType.equals("WrongInput"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elProviderPayerCode_WrongInput);
        }

        return BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
    }

    public boolean VerifyError_ProviderPeriod(String errorType) {
        System.out.println("VerifyError_ProviderPeriod: " + errorType);
        By element = By.xpath("");

        if (errorType.equals("EmptyError"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elProviderPeriod_EmptyError);
        }
        else if (errorType.equals("WrongInput"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elProviderPeriod_WrongInput);
        }

        return BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
    }

    public boolean VerifyError_PaymentSum(String errorType) {
        System.out.println("VerifyError_PaymentSum: " + errorType);
        By element = By.xpath("");

        if (errorType.equals("EmptyError"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elPaymentSum_EmptyError);
        }
        else if (errorType.equals("WrongInput"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elPaymentSum_WrongInput);
        }
        else if (errorType.equals("WrongInput_Min"))
        {
            element = Elements_TB._Payments()._KommunalniePlatezhi()._GKU_Moscow()._elPaymentBlock()
                    .Find(elPaymentBlock.Element.elPaymentSum_WrongInput_Min);
        }

        return BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
    }
}
