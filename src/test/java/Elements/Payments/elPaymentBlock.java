package Elements.Payments;

import org.openqa.selenium.By;

public class elPaymentBlock {
    public enum Element
    {
        elPaymentTab,
        elInput_ProviderPayerCode,
        elPayButton,
        elInput_ProviderPeriod,
        elInput_PaymentSum,
        elProviderPayerCode_EmptyError,
        elProviderPeriod_EmptyError,
        elPaymentSum_EmptyError,
        elProviderPayerCode_WrongInput,
        elProviderPeriod_WrongInput,
        elPaymentSum_WrongInput,
        elPaymentSum_WrongInput_Min,
        elInput_PaymentService
    }

    public By Find(Element element)
    {
        if (element == Element.elPaymentTab)
        {
            return By.xpath("(//*[@data-qa-file='Tab'])[2]");
        }
        else if (element == Element.elInput_ProviderPayerCode)
        {
            return By.xpath("//*[@name='provider-payerCode' and @data-qa-file='UIInput']");
        }
        else if (element == Element.elPayButton)
        {
            return By.xpath(".//button[@data-qa-file='UIButton']");
        }
        else if (element == Element.elInput_ProviderPeriod)
        {
            return By.xpath(".//*[@id='period']");
        }
        else if (element == Element.elInput_PaymentSum)
        {
            return By.xpath(".//*[@data-qa-file='FormFieldSet']//*[@data-qa-file='StatelessInput']/label");
        }
        else if (element == Element.elProviderPayerCode_EmptyError)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[1]//div[@data-qa-file='UIFormRowError' and contains(text(), 'Поле обязательное')]");
        }
        else if (element == Element.elProviderPeriod_EmptyError)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[2]//div[@data-qa-file='UIFormRowError' and contains(text(), 'Поле обязательное')]");
        }
        else if (element == Element.elPaymentSum_EmptyError)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[4]//*[@data-qa-file='UIFormRowError' and contains(text(), 'Поле обязательное')]");
        }
        else if (element == Element.elProviderPayerCode_WrongInput)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[1]//div[@data-qa-file='UIFormRowError' and contains(text(), 'Поле неправильно заполнено')]");
        }
        else if (element == Element.elProviderPeriod_WrongInput)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[2]//div[@data-qa-file='UIFormRowError' and contains(text(), 'Поле заполнено некорректно')]");
        }
        else if (element == Element.elPaymentSum_WrongInput)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[4]//*[@data-qa-file='UIFormRowError' and contains(text(), 'Поле заполнено неверно')]");
        }
        else if (element == Element.elPaymentSum_WrongInput_Min)
        {
            return By.xpath(".//*[@data-qa-file='SubscriptionProvider']/div[1]//div[4]/div[1]/form/div[4]//*[@data-qa-file='UIFormRowError' and contains(text(), 'Минимум — 10 \u20BD')]");
        }
        else if (element == Element.elInput_PaymentService)
        {
            return By.xpath("(//*[@data-qa-file='StatelessInput']//*[@data-qa-file='SearchInput'])[1]");
        }



        return By.xpath("");
    }
}
