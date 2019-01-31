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

        By element = Elements_TB._Payments()._elWidgetPageBlock().Find(elWidgetPageBlock.Element.Housing);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Footer, Click_KommunalniePlatezhi");
        }
    }
}
