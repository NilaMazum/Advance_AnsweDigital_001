package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageObj {

    public WebDriver webDriver;

    public AccountPageObj(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }


    @FindBy(css = "body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) > a.login")
    private WebElement signUpTab;

    @FindBy(xpath = "//form[@id='create-account_form']/h3[contains(text(),'Create an account')]")
    private WebElement validateBanner;

    @FindBy(id = "email_create")
    private WebElement emailFld;

    @FindBy(css = "body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(1) form.box div.form_content.clearfix div.submit:nth-child(4) button.btn.btn-default.button.button-medium.exclusive:nth-child(2) > span:nth-child(1)")
    private WebElement clickSubmit;

    @FindBy(id = "id_gender2")
    private WebElement radioBtn;

    @FindBy(id = "customer_firstname")
    private WebElement fNameFld;

    @FindBy(id = "customer_lastname")
    private WebElement lName;

    @FindBy(id = "passwd")
    private WebElement passwordVal;

    @FindBy(id = "days")
    private WebElement dateFld;

    @FindBy(xpath = "//select[@id='days']/option[@value='11']")
    private WebElement selectDate;

    @FindBy(id = "months")
    private WebElement monthFld;

    @FindBy(xpath = "//select[@id='months']/option[@value='12']")
    private WebElement selectMonth;

    @FindBy(id = "years")
    private WebElement yearFld;

    @FindBy(xpath = "//select[@id='years']/option[@value='1985']")
    private WebElement selectYear;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement addFNameFld;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement addLNameFld;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement addComFld;

    @FindBy(id = "address1")
    private WebElement add1Fld;

    @FindBy(id = "city")
    private WebElement cityFld;

    @FindBy(id = "postcode")
    private WebElement postCodeFld;

    @FindBy(id = "id_state")
    private WebElement stateDrop;

    @FindBy(xpath = "//select[@id='id_state']/option[@value='6']")
    private WebElement sltState;

    @FindBy(id = "phone_mobile")
    private WebElement mobileFld;

    @FindBy(id = "alias")
    private WebElement assignAdd;

    @FindBy(id = "submitAccount")
    private WebElement registerTab;

    @FindBy(id = "create_account_error")
    private WebElement invalidEmailErrorMsg;

    @FindBy(id = "authentication")
    private WebElement validateAuthentication;


    public void getSignUpTab() {
        signUpTab.click();
    }

    public void getValidateBanner() {
        validateBanner.isDisplayed();
    }

    public void getEmailFld(String emailVal) {
        emailFld.sendKeys(emailVal);
    }

    public void getClickSubmit() {
        clickSubmit.click();
    }

    public void setRadioBtn() {
        radioBtn.click();
    }

    public void setFNameFld(String values) {
        fNameFld.sendKeys(values);
    }

    public void setLName(String values) {
        lName.sendKeys(values);
    }

    public void getPasswordVal(String values) {
        passwordVal.sendKeys(values);
    }

    public void setDateFld(String dateVal) {
        dateFld.click();
        selectDate.click();
    }

    public void setMonthFld(String monthVal) {
        monthFld.click();
        selectMonth.click();
    }


    public void setYearFld(String yearVal) {
        yearFld.click();
        selectYear.click();
    }

    public void setAddFNameFld(String value1) {
        addFNameFld.sendKeys(value1);
    }

    public void setAddLNameFld(String value1) {
        addLNameFld.sendKeys(value1);
    }

    public void setAddComFld(String values1) {
        addComFld.sendKeys(values1);
    }

    public void setAdd1Fld(String addVal) { add1Fld.sendKeys(addVal); }

    public void setCityFld(String addVal) { cityFld.sendKeys(addVal); }

    public void setPostFld(String addVal) { postCodeFld.sendKeys(addVal); }

    public void setStateDrop(){stateDrop.click();}

    public void setSltState(){sltState.click();}

    public void setMobileFld(String mobVal){mobileFld.sendKeys(mobVal);}

    public void setAssignAdd(String assignAddVal){assignAdd.sendKeys(assignAddVal);}

    public void setRegisterTab(){registerTab.click();}

    public void setInvalidEmailErrorMsg(){invalidEmailErrorMsg.isDisplayed();}

    public void setValidateAuthentication(){validateAuthentication.isDisplayed();}
}
