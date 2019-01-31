package Elements.Payments;

import org.openqa.selenium.By;

import static Base.ConfigMain.PaymentExpectedRegion;

public class elPaymentsCategoriesHousing {
    public enum Element
    {
        CurrentExpectedRegion,
        CurrentActualRegion,
        SelectRegion
    }

    public By Find(Element element)
    {
        if (element == Element.CurrentExpectedRegion)
        {
            String txt = "";

            if (PaymentExpectedRegion.equals("Moskov")) {
                txt = "Москве";
            } else if (PaymentExpectedRegion.equals("stPetersburg")) {
                txt = "Санкт-Петербурге";
            }
            return By.xpath(".//*[@data-qa-file='Link' and contains(text()," + txt + ")]");
        }
        else if (element == Element.CurrentActualRegion)
        {
            return By.xpath(".//*[@data-qa-file='PaymentsCatalogHeader']//*[@data-qa-file='Link']");
        }
        else if (element == Element.SelectRegion)
        {
            String txt = "";

            if (PaymentExpectedRegion.equals("Moskov")) {
                txt = "г. Москва";
            } else if (PaymentExpectedRegion.equals("stPetersburg")) {
                txt = "г. Санкт-Петербург";
            }
            return By.xpath(".//*[@data-qa-file='UIRegions']//*[contains(text()," + txt + ")]");
        }

        return By.xpath("");
    }
}
