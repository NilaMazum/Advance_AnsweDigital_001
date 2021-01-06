package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchaseUserObj {

    public WebDriver webDriver;

    public PurchaseUserObj(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//li/a[contains(text(),\"Women\")]")
    private WebElement clickWomen;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElement moveMouseOverItem;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    private WebElement clickAddToBasket;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    private WebElement validateSucMsg;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")
    private WebElement clickContinueShop;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/div[1]/a[1]/img[1]")
    private WebElement moveMouseOverTops;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElement moveItOverBlouse;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElement logo;

    @FindBy(name = "group_1")
    private WebElement selectDropDown;

    @FindBy(xpath = "//select[@id='group_1']/option[@value='2']")
    private WebElement selectSizeM;

    public void setClickWomen() {
        clickWomen.click();
    }

    public void setMoveMouseOverItem() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(moveMouseOverItem).build().perform();
    }

    public void setClickAddToBasket() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(clickAddToBasket).click().build().perform();
    }

    public void setValidateSucMsg() {
        validateSucMsg.isDisplayed();
    }

    public void setClickContinueShop() {
        clickContinueShop.click();

    }

    public void setMoveMouseOverTops() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(moveMouseOverTops).click().build().perform();
    }

    public void setMoveItOverBlouse() {
        moveItOverBlouse.click();
    }

    public void getLogo() {
        logo.isDisplayed();
    }

    public void setSelectSize() {
        selectDropDown.click();
        Actions actions = new Actions(webDriver);
       actions.moveToElement(selectDropDown).click().build().perform();
      // new Select(selectDropDown).;
        selectSizeM.click();
    }
}
