package Elements.Payments.KommunalniePlatezhi.GKU_Moscow;

import Base.BrowserChrome;
import Elements.Payments.elWidgetPageBlock;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class GKU_Moscow {

    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    public elPaymentBlock _elPaymentBlock() {
        return getPage(elPaymentBlock::new);
    }
}
