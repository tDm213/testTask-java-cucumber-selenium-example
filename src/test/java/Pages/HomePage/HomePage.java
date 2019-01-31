package Pages.HomePage;

import Base.BrowserChrome;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class HomePage {

    public void GetHomePageURL () {
        BrowserChrome.Goto("");
    }

    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    public Body _Body() {
        return getPage(Body::new);
    }
}