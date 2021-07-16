@regression@wip
Feature: Find transactions

  Background:
    Given user is logged in
    When user is navigates to "Account Activity"
    And user is accesses the "Find Transactions" tab

    @smoke
    Scenario: Search date range
      When the user enters date range from "2012-09-01" to "2012-09-06"
      And clicks search
      Then results table should only show transaction dates between "2012-09-01" to "2012-09-06"
     And the results should be sorted by ,most recent date
      When  the user enters date range form "2012-09-02" to "2012-09-06"
      And clicks search
      Then result table should only show transactions sates between "2012-09-02" to "2012-09-06"
      And results table should not contain transactions date"2012-09-01"

      Scenario: Search description
        When the user enters description "ONLINE"
        And clicks search
        Then results table should only show descriptions containing "ONLINE"
        When the user entrs description "OFFICE"
        And clicks search
        Then results table should only hsow descriptions containing "OFFICE"
        But results table should not show descriptions containing "office"

        Scenario: Type
          And clicks search
          Then results table should show at least one result under Deposit
          Then results table should show at least one result under Withdrawal
          When user selects typt "Deposit"
          And clicks search
          Then results table should show at least one result under Deposit
          But results table should show no result under Withdrawal
          When user selects type "Withdrawal"
          And clicks search
          Then Then results table should show at least one result under Withdrawal
          But results table should show no result under Deposit
