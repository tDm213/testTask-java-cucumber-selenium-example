package Elements.Payments.KommunalniePlatezhi;

import Base.BrowserChrome;
import Elements.Payments.KommunalniePlatezhi.GKU_Moscow.GKU_Moscow;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class KommunalniePlatezhi {

    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }


    public elPaymentsCategoriesHousing _elPaymentsCategoriesHousing() {
        return getPage(elPaymentsCategoriesHousing::new);
    }
    public GKU_Moscow _GKU_Moscow() {
        return getPage(GKU_Moscow::new);
    }
}
