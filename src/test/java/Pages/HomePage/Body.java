package Pages.HomePage;

import Base.BrowserChrome;
import Elements.Elements_TB;
import Elements.HomePage.elBody;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static Base.ConfigMain.PAGE_LOAD_TIMEOUT;

public class Body {

    // Click payments from footer
    public void Click_Payments ()
    {
        System.out.println("Footer, Click_Payments");

        By element = Elements_TB._HomePage()._elBody().Find(elBody.Element.elPayments);
        BrowserChrome.WaitUntilElementIsDisplayed(element, PAGE_LOAD_TIMEOUT);

        try {
            if (BrowserChrome.ElementIsDisplayed(element)) {
                BrowserChrome.webDriver.findElement(element).click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Can't find: Footer, Click_Payments");
        }
    }
}
