package NopecommerceProject.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 21/11/2016.
 */
public class DriverManager {

    protected static WebDriver driver;

    public DriverManager (){PageFactory.initElements(driver,this);}



    public static void openBrowser (String browserName) throws Exception {
        BrowserFactory browserFactory =new BrowserFactory();
        browserFactory.GetBrowser(browserName);
        driver.get(LoadProperties.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        driver.quit();
    }

}
