package Elements.Payments;

import org.openqa.selenium.By;

public class elWidgetPageBlock {
    public enum Element
    {
        Housing
    }

    public By Find(Element element)
    {
        if (element == Element.Housing)
        {
            return By.xpath("(.//*[@data-qa-file='PaymentsCategories']//*[@data-qa-file='Housing'])[2]");
        }

        return By.xpath("");
    }
}
