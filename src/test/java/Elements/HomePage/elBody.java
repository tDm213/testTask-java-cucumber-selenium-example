package Elements.HomePage;

import org.openqa.selenium.By;

public class elBody {

    public enum Element
    {
        Payments
    }

    public By Find(Element element)
    {
        if (element == Element.Payments)
        {
            return By.xpath(".//*[@data-qa-file='Footer']//*[@aria-label='Платежи']");
        }

        return By.xpath("");
    }
}