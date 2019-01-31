package Pages;

import Base.BrowserChrome;
import Pages.HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class Pages_TB {
    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    // Passing the default constructor
    public static HomePage _HomePage() {
        return getPage(HomePage::new);
    }
}
