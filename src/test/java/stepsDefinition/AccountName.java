package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AccountNameObj;

import java.util.List;


public class AccountName extends BaseSteps{

    AccountNameObj accountNameObj = new AccountNameObj(webDriver);

    @When("^I enter user name and password in the field$")
    public void i_enter_user_name_and_password_in_the_field(DataTable dataVal){
        List<List<String>>list = dataVal.raw();
        String userName = list.get(0).get(0);
        String password = list.get(0).get(1);
        accountNameObj.setUserNameFld(userName);
        accountNameObj.setPasswordFld(password);
    }

    @When("^I click the Sign in button$")
    public void i_click_the_Sign_in_button() {
        accountNameObj.clickSubmitBtn();
    }

    @Then("^I see account name on the right top corner$")
    public void i_see_account_name_on_the_right_top_corner() {
        accountNameObj.validateAccNameDisplayed();
    }

}
