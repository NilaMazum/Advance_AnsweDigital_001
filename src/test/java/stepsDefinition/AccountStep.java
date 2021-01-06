package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AccountPageObj;

import java.util.List;

public class AccountStep extends BaseSteps{

    AccountPageObj accountPageObj = new AccountPageObj(webDriver);

    @When("^I click the sign in option on the top right$")
    public void i_click_the_sign_in_option_on_the_top_right(){
        accountPageObj.getSignUpTab();
    }

    @When("^I land on the login page and see create an account banner$")
    public void i_land_on_the_login_page_and_see_create_an_account_banner(){
        wait(5);
        accountPageObj.getValidateBanner();
    }

    @When("^I enter valid data \"(.*?)\" on the email field$")
    public void i_enter_valid_data_on_the_email_field(String emailVal){
        accountPageObj.getEmailFld(emailVal);
    }

    @When("^I click the create an account tab$")
    public void i_click_the_create_an_account_tab(){
        accountPageObj.getClickSubmit();
    }

    @When("^I select the radio button$")
    public void i_select_the_radio_button(){
        wait(5);
        accountPageObj.setRadioBtn();
    }

    @When("^I enter first name, last name and password on the respective fields$")
    public void i_enter_first_name_last_name_and_password_on_the_respective_fields(DataTable values){
     List<List<String>> data = values.raw();
     String firstName = data.get(0).get(0);
     String lastName = data.get(0).get(1);
     String password = data.get(0).get(2);
     accountPageObj.setFNameFld(firstName);
     accountPageObj.setLName(lastName);
     accountPageObj.getPasswordVal(password); }

    @When("^I click on the Date drop down and select \"(.*?)\"$")
    public void i_click_on_the_Date_drop_down_and_select(String dateVal){
        accountPageObj.setDateFld(dateVal);
    }

    @When("^I click on the Month drop down and select \"(.*?)\"$")
    public void i_click_on_the_Month_drop_down_and_select(String mothVal){
       accountPageObj.setMonthFld(mothVal);
    }

    @When("^I click on the Year drop down and select \"(.*?)\"$")
    public void i_click_on_the_Year_drop_down_and_select(String yearVal){
        accountPageObj.setYearFld(yearVal);
    }

    @When("^I enter the data on the address field's firstName, lastName and company$")
    public void i_enter_the_data_on_the_address_field_s_firstName_lastName_and_company(DataTable value1){
         List<List<String>> data1 = value1.raw();
         String addFName = data1.get(0).get(0);
         String addLName = data1.get(0).get(1);
         String addCompany = data1.get(0).get(2);
         accountPageObj.setAddFNameFld(addFName);
         accountPageObj.setAddLNameFld(addLName);
         accountPageObj.setAddComFld(addCompany);

    }

    @When("^I enter data in the address, city and zipCode$")
    public void i_enter_data_in_the_address_city_and_zipCode(DataTable addVal){
        List<List<String>> addData = addVal.raw();
        String addressFld = addData.get(0).get(0);
        String cityFld = addData.get(0).get(1);
        String postFld = addData.get(0).get(2);
        accountPageObj.setAdd1Fld(addressFld);
        accountPageObj.setCityFld(cityFld);
        accountPageObj.setPostFld(postFld);
    }

    @When("^I click on the state drop down and select \"(.*?)\"$")
    public void i_click_on_the_state_drop_down_and_select(String arg1){
        accountPageObj.setStateDrop();
        accountPageObj.setSltState();
    }

    @When("^I enter data on the mobilePhone field \"(.*?)\"$")
    public void i_enter_data_on_the_mobilePhone_field(String mobVal){
         accountPageObj.setMobileFld(mobVal);
    }

    @When("^I enter data in the assign address field \"(.*?)\"$")
    public void i_enter_data_in_the_assign_address_field(String assignAddVal){
        accountPageObj.setAssignAdd(assignAddVal);
    }

    @Then("^I click register button$")
    public void i_click_register_button(){
        accountPageObj.setRegisterTab();
    }
    //No Data
    @Then("^I see an error message$")
    public void i_see_an_error_message(){
      accountPageObj.setInvalidEmailErrorMsg();
    }
    // Invalid data
    @Then("^I see an error message for invalid data$")
    public void i_see_an_error_message_for_invalid_data(){
      accountPageObj.setValidateAuthentication();
    }
}
