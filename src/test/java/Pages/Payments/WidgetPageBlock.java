package Pages.Payments;

import Base.BrowserChrome;
import Elements.Elements_TB;
import Elements.Payments.elWidgetPageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static Base.ConfigMain.FirstPaymentService;
import static Base.ConfigMain.PAGE_LOAD_TIMEOUT;

public class WidgetPageBlock {

    // Click payments GKH
    public void Click_KommunalniePlatezhi ()
    {
        System.out.println("Click_KommunalniePlatezhi");

        By element = Elements_TB._Payments()._elWidgetPageBlock().Find(elWidgetPageBlock.Element.elKommunalniePlatezhi);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Click_KommunalniePlatezhi");
        }
    }

    public boolean Verify_FirstPaymentService(String service) {

        System.out.println("Verify_FirstPaymentService: " + service);

        By element = Elements_TB._Payments()._elWidgetPageBlock().Find(elWidgetPageBlock.Element.elFirstService);

        return BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
    }

    public void Click_FirstPaymentService ()
    {
        System.out.println("Click_FirstPaymentService");

        By element = Elements_TB._Payments()._elWidgetPageBlock().Find(elWidgetPageBlock.Element.elFirstService);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Click_FirstPaymentService");
        }
    }

    public void Input_Saved_PaymentService ()
    {
        System.out.println("Input_Saved_PaymentService");
        String txt = "";

        if (FirstPaymentService.equals("GKU_Moscow")) {
            txt = "ЖКУ-Москва";
        }

        By element = Elements_TB._Payments()._elWidgetPageBlock().Find(elWidgetPageBlock.Element.elInput_PaymentService);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
                BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
                BrowserChrome.webDriver.findElement(element).sendKeys(txt);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Input_Saved_PaymentService");
        }
    }
}
