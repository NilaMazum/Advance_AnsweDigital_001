package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SltSummerDressObj {

    public WebDriver webDriver;

    public SltSummerDressObj(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriver=webDriver;
    }

    @FindBy(xpath = "//li/a[@title=\"Women\"]")
    private WebElement hoverMouseOverWM;

    @FindBy(xpath = "//li/a[@title='Summer Dresses']")
    private WebElement clkSD;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    private WebElement validateBanner;


    public void getHoverMouseOverWM(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(hoverMouseOverWM).build().perform();
    }

    public void getClkSD(){
        Actions actions = new Actions(webDriver);
        actions.contextClick(clkSD);
        clkSD.click();
    }

    public void getValidateBanner(){
        validateBanner.isDisplayed();
    }

    public void getScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(300,400)");
    }


}
