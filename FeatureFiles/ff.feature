Feature: Checking All Login Functions

  
  Scenario Outline: Checking UserName and Password a
    Given User Enters "<UserName>" and "<Password>" as
    Then Click "<Login>" sd

    @Regression
    Examples: 
      | UserName | Password | Login |
      | sat1     | s111     | s     |
      | sat2     | s222     | s     |

    @Smoke
    Examples: 
      | UserName | Password | Login |
      | nar1     | na11     | n     |
      | nar2     | nar22    | n     |

    @Sanity
    Examples: 
      | UserName | Password | Login |
      | sadss    | sadsdf   | s     |
      | aaa      | dff      | d     |
