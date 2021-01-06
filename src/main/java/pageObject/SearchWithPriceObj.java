package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchWithPriceObj {

    public WebDriver webDriver;

    public SearchWithPriceObj(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriver=webDriver;
    }

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/ul[1]/div[1]/div[1]/div[1]")
    private WebElement priceOpt;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/ul[1]/div[1]/div[1]/a[2]")
    private WebElement sliderBtn;

    public void setPriceOpt(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(priceOpt).build().perform();
        priceOpt.isDisplayed();
    }

    public void getPriceOptChange() throws InterruptedException {
        Actions action = new Actions(webDriver);
        action.click(sliderBtn).build().perform();
        Thread.sleep(1000);
        for (int i = 0; i < 75; i++) {
            action.sendKeys(Keys.ARROW_LEFT).build().perform();
             } }
        }
