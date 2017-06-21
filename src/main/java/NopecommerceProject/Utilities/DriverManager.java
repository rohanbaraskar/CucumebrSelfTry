package NopecommerceProject.Utilities;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import NopecommerceProject.TestSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 21/11/2016.
 */
public class DriverManager {

    protected static WebDriver driver;
    static Logger log = Logger.getLogger(DriverManager.class.getName());
    
    public DriverManager (){
    	PageFactory.initElements(driver,this);
    	 BasicConfigurator.configure();
    	}



    public static void openBrowser (String browserName) throws Exception {
        BrowserFactory browserFactory =new BrowserFactory();
        browserFactory.GetBrowser(browserName);
        driver.get(LoadProperties.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        log.info("Open browser");
    }

    public static void closeBrowser(){
    	log.info("Close browser");
        driver.quit();
    }

}
