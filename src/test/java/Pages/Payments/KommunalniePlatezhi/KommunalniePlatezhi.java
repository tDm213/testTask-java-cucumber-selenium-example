package Pages.Payments.KommunalniePlatezhi;

import Base.BrowserChrome;
import Pages.Payments.KommunalniePlatezhi.GKU_Moscow.GKU_Moscow;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Supplier;

public class KommunalniePlatezhi {
    private static <T> T getPage(Supplier<? extends T> supp) {
        T page = supp.get();
        PageFactory.initElements(BrowserChrome.webDriver, page);
        return page;
    }

    public PaymentsCategoriesHousing _PaymentsCategoriesHousing() {return getPage(PaymentsCategoriesHousing::new);}
    public GKU_Moscow _GKU_Moscow() {return getPage(GKU_Moscow::new);}
}
