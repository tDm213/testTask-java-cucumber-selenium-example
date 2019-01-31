package Base;

import org.openqa.selenium.*;

public class BrowserChrome {
    private static WebDriver webDriver;
    private static String _baseUrl;

    public static void Goto(String urlAddition)
    {
        _baseUrl = ConfigMain.URLWWW;
        webDriver.navigate().to(_baseUrl + urlAddition);
    }
}
