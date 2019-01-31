@PaymentsValidation_ZhkuMoskva

  Feature: Payments validation for zhku-moskva

    Scenario Outline: Check zhku-moskva in Moskov are and stPetersburg areas

      Given HomePage, I go to the Home Page
      And HomePage, footer, I click on payments
      And Payments, I select kommunalnie-platezhi
      And Payments, kommunalnie platezhi, If Region is not <RegionFirst> I select it

      Examples:
      | RegionFirst |
      | Moskov      |