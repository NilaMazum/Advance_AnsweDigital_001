package stepsDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SltSummerDressObj;

public class SltSummerDress extends BaseSteps {

    SltSummerDressObj dressObj = new SltSummerDressObj(webDriver);

    @When("^I hover the mouse over the Women button$")
    public void i_hover_the_mouse_over_the_Women_button(){
        dressObj.getHoverMouseOverWM();
    }

    @When("^I see the submenu option and click on the summer dress option$")
    public void i_see_the_submenu_option_and_click_on_the_summer_dress_option(){
        wait(5);
        dressObj.getClkSD();
    }

    @When("^I land on the summer dress product list page and I see the banner$")
    public void i_land_on_the_summer_dress_product_list_page_and_I_see_the_banner() {
        dressObj.getValidateBanner();
    }

    @Then("^I scroll down and see summer dresses in the page$")
    public void i_scroll_down_and_see_summer_dresses_in_the_page(){
       dressObj.getScrollDown();
    }
}
