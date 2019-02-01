package Elements.Payments;

import org.openqa.selenium.By;

import static Base.ConfigMain.FirstPaymentService;
import static Base.ConfigMain.PaymentExpectedRegion;

public class elPaymentsCategoriesHousing {
    public enum Element
    {
        elCurrentExpectedRegion,
        elCurrentActualRegion,
        elSelectExpectedRegion,
        elVerifyFirstPaymentService,
        elFirstPaymentService,
        elVerifyPaymentService

    }

    public By Find(Element element)
    {
        if (element == Element.elCurrentExpectedRegion)
        {
            String txt = "";

            if (PaymentExpectedRegion.equals("Moscow")) {
                txt = "Москве";
            } else if (PaymentExpectedRegion.equals("StPetersburg")) {
                txt = "Санкт-Петербурге";
            }
            return By.xpath(".//*[@data-qa-file='Link' and contains(text(),'" + txt + "')]");
        }
        else if (element == Element.elCurrentActualRegion)
        {
            return By.xpath(".//*[@data-qa-file='PaymentsCatalogHeader']//*[@data-qa-file='Link']");
        }
        else if (element == Element.elSelectExpectedRegion)
        {
            String txt = "";

            if (PaymentExpectedRegion.equals("Moscow")) {
                txt = "г. Москва";
            } else if (PaymentExpectedRegion.equals("StPetersburg")) {
                txt = "г. Санкт-Петербург";
            }
            return By.xpath(".//*[@data-qa-file='UIRegions']//*[contains(text(),'" + txt + "')]");
        }
        else if (element == Element.elVerifyFirstPaymentService) {
            String txt = "";

            if (FirstPaymentService.equals("GKU_Moscow")) {
                txt = "ЖКУ-Москва";
            }

            return By.xpath("((//*[@data-qa-file='UIScrollList']/li)[1]//*[@data-qa-file='FadeText' and contains(text(),'" + txt + "')])[1]");
        }
        else if (element == Element.elFirstPaymentService) {
            return By.xpath("(//*[@data-qa-file='UIScrollList']/li)[1]//*[@data-qa-file='FadeText']");
        }
        else if (element == Element.elVerifyPaymentService) {
            String txt = "";

            if (FirstPaymentService.equals("GKU_Moscow")) {
                txt = "ЖКУ-Москва";
            }

            return By.xpath(".//*[@data-qa-file='FadeText' and contains(text(),'" + txt + "')]");
        }

        return By.xpath("");
    }
}
