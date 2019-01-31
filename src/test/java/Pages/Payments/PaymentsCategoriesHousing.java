package Pages.Payments;

import Base.BrowserChrome;
import Elements.Elements_TB;
import Elements.Payments.elPaymentsCategoriesHousing;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static Base.ConfigMain.PAGE_LOAD_TIMEOUT;

public class PaymentsCategoriesHousing {

    public void Click_BodyRegion ()
    {
        System.out.println("Select_BodyRegion");

        By element = Elements_TB._Payments()._elPaymentsCategoriesHousing().Find(elPaymentsCategoriesHousing.Element.CurrentActualRegion);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Select_BodyRegion");
        }
    }

    public void Click_ExpectedRegion ()
    {
        System.out.println("Click_ExpectedRegion");

        By element = Elements_TB._Payments()._elPaymentsCategoriesHousing().Find(elPaymentsCategoriesHousing.Element.CurrentActualRegion);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Click_ExpectedRegion");
        }
    }

    public boolean VerifyBodyRegion(String region) {
        System.out.println("VerifyBodyRegion: " + region);

        // Save Expected region
        Base.ConfigMain.PaymentExpectedRegion = region;

        // Find Current region
        By element = Elements_TB._Payments()._elPaymentsCategoriesHousing().Find(elPaymentsCategoriesHousing.Element.CurrentExpectedRegion);

        return BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);
    }
}
