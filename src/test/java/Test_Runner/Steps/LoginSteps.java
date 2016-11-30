package Test_Runner.Steps;

import NopecommerceProject.Utilities.DriverManager;
import NopecommerceProject.Utilities.LoadProperties;
import NopecommerceProject.Page.LoginPage;
import NopecommerceProject.Page.Registrationpage;
import NopecommerceProject.Utilities.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by kaival on 30/11/2016.
 */
public class LoginSteps extends DriverManager{



    @Given("^user open browser and goto Nopecommerce website$")
    public void user_open_browser_and_goto_Nopecommerce_website() throws Throwable {
        DriverManager.openBrowser(LoadProperties.getProperty("Browser"));
        Registrationpage registrationpage=new Registrationpage();
        registrationpage.clickonregistrationlink();
        registrationpage.register();
        registrationpage.clickOnRegisterBtn();
        registrationpage.logout();
    }

    @When("^user click on Login link$")
    public void user_click_on_Login_link() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.login_nopecommerce();
    }

    @When("^user enter valid Username and valid Password$")
    public void user_enter_valid_Username_and_valid_Password() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.EnterLoginDetails();
    }

    @When("^user click on Login button$")
    public void user_click_on_Login_button() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnLoginBtn();
    }

    @Then("^user should successfully logged in$")
    public void user_should_successfully_logged_in() throws Throwable {
        LoginPage loginPage = new LoginPage();
        Registrationpage registration =new Registrationpage();
        Utils.webDriverWaitImplicitly(5);
        Assert.assertEquals(loginPage.getLoginAccountInfo(),registration.actext,"\n User Successfully Logged in");
        registration.logout();
        DriverManager.closeBrowser();

    }
}
