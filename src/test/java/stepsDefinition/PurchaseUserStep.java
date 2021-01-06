package stepsDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AddToBasketObj;
import pageObject.PurchaseUserObj;


public class PurchaseUserStep extends BaseSteps{

    PurchaseUserObj purchaseUserObj = new PurchaseUserObj(webDriver);


    @When("^I click on the women option from the menu$")
    public void i_click_on_the_women_option_from_the_menu(){
        wait(5);
        purchaseUserObj.setClickWomen();
    }

    @When("^I click product from product list$")
    public void i_click_product_from_product_list(){
     purchaseUserObj.setMoveMouseOverItem();

    }

    @When("^I click add to cart and see the success msg$")
    public void i_click_add_to_cart_and_see_the_success_msg(){
        purchaseUserObj.setClickAddToBasket();
        purchaseUserObj.setValidateSucMsg();
    }

    @When("^I click on continue shopping$")
    public void i_click_on_continue_shopping(){
        purchaseUserObj.setClickContinueShop();
    }

    @When("^I click on Tops from the women submenu$")
    public void i_click_on_Tops_from_the_women_submenu(){
        purchaseUserObj.setMoveMouseOverTops();
    }

    @When("^I click on the \"(.*?)\"$")
    public void i_click_on_the(String arg1){
     purchaseUserObj.setMoveItOverBlouse();
    }
    
    @When("^I land on the product description page and see the logo$")
    public void i_land_on_the_product_description_page_and_see_the_logo(){
        purchaseUserObj.getLogo();
    }

    @When("^I click on the size drop down and select \"(.*?)\"$")
    public void i_click_on_the_size_drop_down_and_select(String arg1){
        purchaseUserObj.setSelectSize();
        wait(5);
    }

    @When("^I select the colour \"(.*?)\"$")
    public void i_select_the_colour(String arg1){
        
    }

    @When("^I click on add to cart$")
    public void i_click_on_add_to_cart(){
        
    }

    @When("^I see the success message and I click on the cross icon$")
    public void i_see_the_success_message_and_I_click_on_the_cross_icon(){
        
    }

    @When("^I land on the previous page and I click on the cart icon$")
    public void i_land_on_the_previous_page_and_I_click_on_the_cart_icon(){
        
    }

    @When("^I land on the shopping summary page$")
    public void i_land_on_the_shopping_summary_page(){
        
    }
    

    @When("^I land on the Shopping summary page and I see the banner$")
    public void i_land_on_the_Shopping_summary_page_and_I_see_the_banner(){
        
    }

    @When("^I click on the proceed to checkout button$")
    public void i_click_on_the_proceed_to_checkout_button(){
        
    }

    @When("^I land on the Address page and click on proceed to check out$")
    public void i_land_on_the_Address_page_and_click_on_proceed_to_check_out(){
        
    }

    @When("^I land on the shopping page and and see the banner$")
    public void i_land_on_the_shopping_page_and_and_see_the_banner(){
        
    }

    @When("^I click the TAndC check box$")
    public void i_click_the_TAndC_check_box(){
        
    }

    @When("^I click on the proceed to checkout tab$")
    public void i_click_on_the_proceed_to_checkout_tab(){
        
    }

    @When("^I land on the payment method page and select \"(.*?)\" option$")
    public void i_land_on_the_payment_method_page_and_select_option(String arg1){
        
    }

    @When("^I click on the confirmation button$")
    public void i_click_on_the_confirmation_button(){
        
    }

    @Then("^I see a success message \"(.*?)\"$")
    public void i_see_a_success_message(String arg1){
        
    }
}
