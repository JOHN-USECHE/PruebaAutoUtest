#Autor: John Useche

  @stories
  Feature:Registration of a new user in Utest

    @scenario1
      Scenario: John's log on the Utest page
      Given John wants to register with Utest
      When The user enters the data required by the system
      |sFirstName|sLastName|sEmail           |sMonthBirth|sDayBirth|sYearBirth| sCity  | sPostal | sCountry | sComputer  | sVersion | sLanguage | sDevice | sModel   | sSystem     |
      |John      | Useche  | stubirr@gmail.com | June      | 20      |  1998    | Bogotá | 110111  | Colombia | Windows    | 8        | Spanish   | Huawei  | Ideos X5 | Android 2.3 |
      Then Registration is complete when you see the Complete Setup button

