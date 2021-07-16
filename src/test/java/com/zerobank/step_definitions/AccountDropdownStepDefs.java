package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.zerobank.utilities.BrowserUtils.waitUntilTitleIs;
import static org.junit.Assert.assertEquals;

public class AccountDropdownStepDefs {
    @When("user navigates to {string}")
    public void user_navigates_to(String tab) {
    new AccountActivePage().navigateTo(tab);
    }
    @Then("the Account dropdown selected option should be {string}")
    public void the_account_dropdown_selected_option_should_be(String expected) {
        waitUntilTitleIs("Zero - Account Activity");
        String actual = new AccountActivePage().selectAccount();
        assertEquals(expected, actual);
    }


    @Then("the Account dropdown should have following options")
    public void theAccountDropdownShouldHaveFollowingOptions(List<String> expectedAccounts) {
        waitUntilTitleIs("Zero - Account Activity");
        List<String> actualAccounts= new AccountActivePage().allAccountOptions();
        assertEquals(expectedAccounts, actualAccounts);
    }
}
