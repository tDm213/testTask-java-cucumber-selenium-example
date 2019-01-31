package Pages.Payments;

import Base.BrowserChrome;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class Payments {
    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    public WidgetPageBlock _WidgetPageBlock() {
        return getPage(WidgetPageBlock::new);
    }
    public PaymentsCategoriesHousing _PaymentsCategoriesHousing() {return getPage(PaymentsCategoriesHousing::new);
    }
}
