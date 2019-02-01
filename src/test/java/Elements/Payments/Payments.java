package Elements.Payments;

import Base.BrowserChrome;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class Payments {

    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    public elWidgetPageBlock _elWidgetPageBlock() {
        return getPage(elWidgetPageBlock::new);
    }
    public elPaymentsCategoriesHousing _elPaymentsCategoriesHousing() {return getPage(elPaymentsCategoriesHousing::new);}
    public elPaymentBlock _elPaymentBlock() {return getPage(elPaymentBlock::new);}
}
