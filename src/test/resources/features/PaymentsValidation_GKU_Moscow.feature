@PaymentsValidation_GKU_Moscow

Feature: Payments validation for zhku-moskva

  Scenario Outline: Check zhku-moskva in Moskov are and stPetersburg areas

    ### Step 1 ###
    Given HomePage, I go to the Home Page
    ### Step 2 ###
    And HomePage, footer, I click on payments
    ### Step 3 ###
    And Payments, I select kommunalnie-platezhi
    ### Step 4 ###
    And kommunalnie platezhi, If Region is not <RegionFirst> I select it
    ### Step 5 ###
    And kommunalnie platezhi, I verify true <PaymentServices>
    And kommunalnie platezhi, I select pay to FirstPaymentService <PaymentServices>
    And Verify <ExpectedURL> with ActualURL
    ### Step 6 ###
    And kommunalnie platezhi, GKU_Moscow I select PaymentTab
    ### Step 7 ###
      # Click Pay button to verify EmptyErrors for mandatory field
    And kommunalnie platezhi, GKU_Moscow I click on Pay button

    And kommunalnie platezhi, GKU_Moscow I verify error EmptyError for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I verify error EmptyError for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I verify error EmptyError for PaymentSum

      # Input "a" button and verify EmptyError
    And kommunalnie platezhi, GKU_Moscow I input <FirstInput> for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I input <FirstInput> for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I input <FirstInput> for PaymentSum
    And kommunalnie platezhi, GKU_Moscow I click on Pay button
    And kommunalnie platezhi, GKU_Moscow I verify error EmptyError for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I verify error EmptyError for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I verify error EmptyError for PaymentSum

      # Input "1" button and verify EmptyError
    And kommunalnie platezhi, GKU_Moscow I input <SecondInput> for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I input <SecondInput> for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I input <SecondInput> for PaymentSum
    And kommunalnie platezhi, GKU_Moscow I click on Pay button
    And kommunalnie platezhi, GKU_Moscow I verify error WrongInput for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I verify error WrongInput for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I verify error WrongInput_Min for PaymentSum

      # Input "-1 () " button and verify EmptyError
    And kommunalnie platezhi, GKU_Moscow I input <ThirdInput> for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I input <ThirdInput> for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I input <ThirdInput> for PaymentSum
    And kommunalnie platezhi, GKU_Moscow I click on Pay button
    And kommunalnie platezhi, GKU_Moscow I verify error WrongInput for ProviderPayerCode
    And kommunalnie platezhi, GKU_Moscow I verify error WrongInput for ProviderPeriod
    And kommunalnie platezhi, GKU_Moscow I verify error WrongInput for PaymentSum

    ### Step 8 ###
    And HomePage, footer, I click on payments
    ### Step 9 ###
    And Payments, Search field for PaymentServices
    ### Step 10 ###
    And Payments, Search field, Verify <PaymentServices> is first one
    ### Step 11 ###
    And Payments, Search field, Click on <PaymentServices>
    And Verify <ExpectedURL> with ActualURL
    ### Step 12 ###
    And HomePage, footer, I click on payments
    And Payments, I select kommunalnie-platezhi
    ### Step 13 ###
    And kommunalnie platezhi, If Region is not <RegionSecond> I select it
    ### Step 14 ###
    And kommunalnie platezhi, I verify false <PaymentServices>

    Examples:
      | RegionFirst | RegionSecond | PaymentServices | FirstInput | SecondInput | ThirdInput | ExpectedURL                         |
      | Moscow      | StPetersburg | GKU_Moscow      | a!@#$% _   | 1           | -1 ()      | https://www.tinkoff.ru/zhku-moskva/ |