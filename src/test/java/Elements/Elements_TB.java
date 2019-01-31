package Elements;

import Base.BrowserChrome;
import Elements.HomePage.HomePage;
import Elements.Payments.Payments;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class Elements_TB {
    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    // Passing the default constructor
    public static HomePage _HomePage() { return getPage(HomePage::new); }
    public static Payments _Payments() { return getPage(Payments::new); }

}
