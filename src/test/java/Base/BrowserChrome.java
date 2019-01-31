package Base;

import org.openqa.selenium.*;

public class BrowserChrome {

    public static WebDriver webDriver;

    public static void Goto(String urlAddition)
    {
        webDriver.navigate().to(ConfigMain.URLWWW + urlAddition);
    }
}
