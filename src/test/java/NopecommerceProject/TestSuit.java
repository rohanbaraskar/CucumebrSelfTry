package NopecommerceProject;

import NopecommerceProject.Page.ElectronicsPage;
import NopecommerceProject.Page.LoginPage;
import NopecommerceProject.Page.PaymentPage;
import NopecommerceProject.Page.Registrationpage;
import NopecommerceProject.Utilities.DriverManager;
import NopecommerceProject.Utilities.LoadProperties;
import NopecommerceProject.Utilities.Utils;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by welcome on 21/11/2016.
 */
public class TestSuit extends DriverManager {



    @BeforeMethod
    public static void open() throws Exception {
        DriverManager.openBrowser(LoadProperties.getProperty("Browser"));
    }

    @AfterMethod
    public static void close(){
        DriverManager.closeBrowser();
    }


    @Test
    public static void useronHomepage(){
        Registrationpage registration = new Registrationpage();
        Assert.assertEquals(registration.homepage(),"Welcome to our store");
    }

    @Test
    public void userIsabletoRegister(){

        Registrationpage registration = new Registrationpage();
        registration.clickonregistrationlink();
        Assert.assertEquals(registration.registrationPage(),"Register");
        registration.register();
        registration.clickOnRegisterBtn();
        Assert.assertTrue(registration.registrationSuccessfulMessage(),"Your registration completed");
        registration.logout();
    }



    @Test
    public static void userLoggedin (){
        Registrationpage registration =new Registrationpage();
        LoginPage loginpage = new LoginPage();
        registration.clickonregistrationlink();
        registration.register();
        registration.clickOnRegisterBtn();
        registration.logout();
        loginpage.login_nopecommerce();
        Assert.assertEquals(loginpage.getpageTitle(),"Welcome, Please Sign In!","\n User on Login page");
        loginpage.EnterLoginDetails();
        loginpage.clickOnLoginBtn();
        Utils.webDriverWaitImplicitly(5);
        Assert.assertEquals(loginpage.getLoginAccountInfo(),registration.actext,"\n User Successfully Logged in");

    }

    @Test
    public static void itemsinCart (){
        Registrationpage registration =new Registrationpage();
        registration.clickonregistrationlink();
        registration.register();
        registration.clickOnRegisterBtn();
        ElectronicsPage electronicsPage = new ElectronicsPage();
        electronicsPage.addtocart();
        electronicsPage.goToCart();
        electronicsPage.cart_SubTotal();


    }

    @Test
    public static void payment (){
        Registrationpage registration =new Registrationpage();
        registration.clickonregistrationlink();
        registration.register();
        registration.clickOnRegisterBtn();
        ElectronicsPage electronicsPage = new ElectronicsPage();
        electronicsPage.addtocart();
        electronicsPage.goToCart();
        electronicsPage.cart_SubTotal();
        PaymentPage paymentPage = new PaymentPage();
        paymentPage.checkout();
       // paymentPage.getconfirmationmessage();
       // System.out.println(paymentPage.getconfirmationmessage());
        Assert.assertEquals(paymentPage.getconfirmationmessage(),"Your order has been successfully processed!");
    }


}
