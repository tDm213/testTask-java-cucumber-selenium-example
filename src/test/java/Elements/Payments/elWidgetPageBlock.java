package Elements.Payments;

import org.openqa.selenium.By;

import static Base.ConfigMain.FirstPaymentService;

public class elWidgetPageBlock {
    public enum Element
    {
        elKommunalniePlatezhi,
        elFirstService
    }

    public By Find(Element element)
    {
        if (element == Element.elKommunalniePlatezhi)
        {
            return By.xpath("(.//*[@data-qa-file='PaymentsCategories']//*[@data-qa-file='Housing'])[2]");
        }
        else if (element == Element.elFirstService)
        {
            String txt = "";

            if (FirstPaymentService.equals("Payments_GKU_Moscow")) {
                txt = "ЖКУ-Москва";
            }
            return By.xpath("(//*[@data-qa-file='GridColumn'])[1]//*[contains(text(),'"+ txt +"')]");
        }

        return By.xpath("");
    }
}
