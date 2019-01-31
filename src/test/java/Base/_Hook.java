package Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.Date;

public class _Hook {

    @Before
    public void InitializeTest() {

        System.getProperty("user.dir");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

        System.out.println("Opening the browser : ChromeDriver");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        BrowserChrome.webDriver = new ChromeDriver(options);
        BrowserChrome.webDriver.manage().window().maximize();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("TakesScreenshot");

            // take screenshot of all page
            scenario.embed(((TakesScreenshot)BrowserChrome.webDriver).getScreenshotAs(OutputType.BYTES), "image/png");
            JavascriptExecutor jsx = (JavascriptExecutor)BrowserChrome.webDriver;
            jsx.executeScript("window.scrollBy(0,450)", "");
            scenario.embed(((TakesScreenshot)BrowserChrome.webDriver).getScreenshotAs(OutputType.BYTES), "image/png");
            jsx.executeScript("window.scrollBy(0,800)", "");
            scenario.embed(((TakesScreenshot)BrowserChrome.webDriver).getScreenshotAs(OutputType.BYTES), "image/png");

            //print logs
            LogEntries logEntries = BrowserChrome.webDriver.manage().logs().get(LogType.BROWSER);
            System.out.println("=======================================================================================================================================");
            System.out.println("================================================HERE=BROWSER=LOGS======================================================================");

            System.out.println("=======================================================================================================================================");
            for (LogEntry entry : logEntries) {
                System.out.println("==");
                System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
            }
            System.out.println("======================================================================================================================================");
        }

        System.out.println("Closing the browser Chrome");
        BrowserChrome.webDriver.close();
        BrowserChrome.webDriver.quit();
    }
}
