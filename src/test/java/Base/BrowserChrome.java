package Base;

import org.openqa.selenium.*;

public class BrowserChrome {

    private static String _baseUrl;

    public static WebDriver webDriver;

    public static void Goto(String urlAddition)
    {
        webDriver.navigate().to(ConfigMain.URLWWW + urlAddition);
    }
}
