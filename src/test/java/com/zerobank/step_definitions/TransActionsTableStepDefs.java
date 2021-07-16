package com.zerobank.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

import static com.zerobank.utilities.BrowserUtils.waitUntilTitleIs;
import static org.junit.Assert.assertEquals;

public class TransActionsTableStepDefs {
    @Then("the Transactions table should have following headers")
    public void the_Transactions_table_should_have_following_headers(List<String> expectedHeaders) {
        waitUntilTitleIs("Zero - Account Activity");
        assertEquals(expectedHeaders, expectedHeaders);
    }
}
