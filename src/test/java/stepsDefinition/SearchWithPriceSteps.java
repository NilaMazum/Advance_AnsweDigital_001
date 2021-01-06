package stepsDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SearchWithPriceObj;

public class SearchWithPriceSteps extends BaseSteps{

    SearchWithPriceObj searchWithPriceObj = new SearchWithPriceObj(webDriver);

    @When("^I scroll down to price range option$")
    public void i_scroll_down_to_price_range_option(){
        searchWithPriceObj.setPriceOpt();
    }

    @When("^I change the price range to \\$(\\d+)-\\$(\\d+)$")
    public void i_change_the_price_range_to_$_$(int arg1, int arg2) throws Exception{
        searchWithPriceObj.getPriceOptChange();
    }

    @Then("^I should see an updated search result$")
    public void i_should_see_an_updated_search_result(){
        
    }
}
