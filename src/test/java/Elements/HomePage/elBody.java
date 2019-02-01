package Elements.HomePage;

import org.openqa.selenium.By;

public class elBody {

    public enum Element
    {
        elPayments
    }

    public By Find(Element element)
    {
        if (element == Element.elPayments)
        {
            return By.xpath(".//*[@data-qa-file='Footer']//*[@aria-label='Платежи']");
        }

        return By.xpath("");
    }
}