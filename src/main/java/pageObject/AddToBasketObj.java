package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBasketObj {
    public WebDriver webDriver;

    public AddToBasketObj(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElement pickItem;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]/span[1]")
    private WebElement clkAddToCart;

    @FindBy(css = "body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div:nth-child(4) div.clearfix div.layer_cart_product.col-xs-12.col-md-6 > h2:nth-child(2)")
    private WebElement valTxtMsg;

    @FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
    private WebElement clkProceed;

    @FindBy(xpath = "//h1[@id='cart_title']")
    private WebElement headingIsDisplayed;

    @FindBy(xpath = "//i[@class=\"icon-trash\"]")
    private WebElement clkTrashBtn;

    @FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    private WebElement displaySuccessMsg;


    public void setPickItem() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(pickItem)
                .build().perform();
    }

    public void getClkAddToCart() {
        Actions moveMouse = new Actions(webDriver);
        moveMouse.moveToElement(clkAddToCart).build().perform();
        clkAddToCart.click();
    }

    public void validateTxtMsg() {
        valTxtMsg.isDisplayed();
    }

    public void setClkProceed() {
        clkProceed.click();
    }

    public void getHeadingIsDisplayed(){
        headingIsDisplayed.isDisplayed();
    }

    public void setClkTrashBtn() {
        clkTrashBtn.isDisplayed();
        clkTrashBtn.click();
    }

    public void getDisplaySuccessMsg(){
        displaySuccessMsg.isDisplayed();
    }

}
