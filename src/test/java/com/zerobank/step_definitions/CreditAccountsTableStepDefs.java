package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;

import java.util.List;

import static com.zerobank.utilities.BrowserUtils.*;
import static org.junit.Assert.assertEquals;


public class CreditAccountsTableStepDefs {

    @Then("the user should see following columns in credit account table")
    public void theUserShouldSeeFollowingColumnsInCreditAccountTable(List<String> expectedHeaders) {
        AccountSummaryPage accountSummaryPage= new AccountSummaryPage();
        List<String> actualSummaryMessage= getTextOfElements(accountSummaryPage.creditAccountHeaders);
        assertEquals(expectedHeaders, expectedHeaders);

    }
}
