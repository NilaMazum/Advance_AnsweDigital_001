package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObject.AddToBasketObj;

public class AddToBasketSteps extends BaseSteps{

    AddToBasketObj addToBasketObj = new AddToBasketObj(webDriver);


    @Given("^I am on the home page$")
    public void i_am_on_the_home_page(){
        goToUrl("http://automationpractice.com/index.php");
    }

    @When("^I click the product from product list$")
    public void i_click_the_product_from_product_list() {
        wait(5);
        addToBasketObj.setPickItem();
    }

    @When("^I click the add to cart$")
    public void i_click_the_add_to_cart(){
        addToBasketObj.getClkAddToCart();
    }

    @When("^I see the product is successfully msg$")
    public void i_see_the_product_is_successfully_msg(){
        addToBasketObj.validateTxtMsg();
    }

    @When("^I click on the proceed to checkout$")
    public void i_click_on_the_proceed_to_checkout(){
        wait(5);
        addToBasketObj.setClkProceed();
    }

    @When("^I land on the shopping cart page$")
    public void i_land_on_the_shopping_cart_page(){
        addToBasketObj.getHeadingIsDisplayed();
    }

    @When("^I click on the delete icon$")
    public void i_click_on_the_delete_icon(){
        addToBasketObj.setClkTrashBtn();
    }

    @Then("^I see a message display \"(.*?)\"$")
    public void i_see_a_message_display(String arg1){
        addToBasketObj.getHeadingIsDisplayed();
    }
}
