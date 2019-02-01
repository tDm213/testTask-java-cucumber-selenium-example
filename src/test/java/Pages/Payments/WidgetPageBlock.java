package Pages.Payments;

import Base.BrowserChrome;
import Elements.Elements_TB;
import Elements.Payments.elWidgetPageBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static Base.ConfigMain.PAGE_LOAD_TIMEOUT;

public class WidgetPageBlock {

    // Click payments from footer
    public void Click_KommunalniePlatezhi ()
    {
        System.out.println("Footer, Click_KommunalniePlatezhi");

        By element = Elements_TB._Payments()._elWidgetPageBlock().Find(elWidgetPageBlock.Element.elHousing);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Footer, Click_KommunalniePlatezhi");
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
}
