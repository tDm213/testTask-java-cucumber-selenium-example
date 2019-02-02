package Base;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class BrowserChrome {

    public static WebDriver webDriver;

    public static void Goto(String urlAddition)
    {
        webDriver.navigate().to(ConfigMain.URLWWW + urlAddition);
    }

    // Explicit Wait
    public static boolean WaitUntilElementIsDisplayed(By element, int timeoutInSeconds)
    {
        // Always Wait one second
        WaitSeconds(1);

        int i;
        for (i = 0; i < timeoutInSeconds; i++)
        {
            if (ElementIsDisplayed(element))
            {
                return true;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    // Implicit  Wait
    public static boolean WaitSeconds (int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    // Check if element displayed and Visible on Page
    public static boolean ElementIsDisplayed(By element)
    {
        boolean present = false;
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try
        {
            //present = webDriver.findElement(element).Any(el => el.Displayed) | _webDriver.FindElement(element).Displayed;
            present = webDriver.findElement(element).isDisplayed() && webDriver.findElement(element).isEnabled();
        }
        catch (NoSuchElementException e)
        {
        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return present;
    }


}
