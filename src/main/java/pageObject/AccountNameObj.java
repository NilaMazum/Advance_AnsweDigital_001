package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountNameObj {
    public WebDriver webDriver;

    public AccountNameObj(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriver = webDriver;
    }

    @FindBy(id = "email")
    private WebElement userNameFld;

    @FindBy(id = "passwd")
    private WebElement passwordFld;

    @FindBy(id = "SubmitLogin")
    private WebElement submitBtn;

    @FindBy(xpath = "//span[contains(text(),'Nilakshi Mazumder')]")
    private WebElement accNameDisplayed;

    public void setUserNameFld(String dataVal) {
        //userNameFld.sendKeys(dataVal);
        //JavascriptExecutor js = (JavascriptExecutor)webDriver;
        //js.executeScript("arguments[0].value='"+dataVal+"';", userNameFld);
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        wait.until(ExpectedConditions.visibilityOf(userNameFld)).sendKeys(dataVal);

    }


    public void setPasswordFld(String dataVal){
        passwordFld.sendKeys(dataVal);
    }

    public void clickSubmitBtn(){submitBtn.click();}

    public void validateAccNameDisplayed(){
        accNameDisplayed.isDisplayed();
    }
}
