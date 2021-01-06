import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepsDefinition.BaseSteps;

public class LogoHooks {

    @Before
    public void beforeTest(){
        System.out.println("@Before at the first");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        BaseSteps.setWebDriver(driver);
    }

    @After
    public void tearDown(){
        System.out.println("@After at the end");
        TakesScreenshot takesScreenshot =((TakesScreenshot)BaseSteps.getWebDriver());
        final byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        //BaseSteps.getWebDriver().quit();
    }
}
