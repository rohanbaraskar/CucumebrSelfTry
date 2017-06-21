package NopecommerceProject.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by kaival on 30/11/2016.
 */
public class BrowserFactory extends DriverManager{
    public static WebDriver GetBrowser(String browserName)throws Exception {
        if(browserName.equalsIgnoreCase("firefox")){
        	 System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        else{
            throw new Exception("Browser is not correct");

        }

        return driver;
    }
}
