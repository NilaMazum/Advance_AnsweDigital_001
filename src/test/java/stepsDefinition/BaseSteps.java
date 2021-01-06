package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;



public abstract class BaseSteps {

    protected static WebDriver webDriver;

    public static WebDriver getWebDriver(){return webDriver;}

    public static void setWebDriver(WebDriver driver){ webDriver=driver;}

    public void wait(int waitTime){
        webDriver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);}

    public void pause(){
        Actions actions = new Actions(webDriver);
        actions.pause(Duration.ofSeconds(5));
        actions.build().perform(); }

    public void refresh(){webDriver.navigate().refresh();}

    public void goToUrl(String url){webDriver.navigate().to(url);}



}
