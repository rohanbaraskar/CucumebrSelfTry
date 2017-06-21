package NopecommerceProject.Page;

import NopecommerceProject.Utilities.DriverManager;
import NopecommerceProject.Utilities.LoadProperties;
import NopecommerceProject.Utilities.Utils;
import Test_Runner.Steps.RegisterSteps;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

/**
 * Created by welcome on 22/11/2016.
 */
public class Registrationpage extends DriverManager {
	static Logger log = Logger.getLogger(Registrationpage.class.getName());

    @FindBy(className = "ico-register")
    private WebElement _Register;

    @FindBy(xpath = "//div[@class='page registration-page']/div/h1")
    private WebElement _RegisterText;

    @FindBy(id = "gender-female")
    private WebElement _Gender;

    @FindBy(id = "FirstName")
    private WebElement _EnterFirstName;

    @FindBy(id = "LastName")
    private WebElement _EnterLastName;

    @FindBy(name = "DateOfBirthDay")
    private WebElement _DOB;

    @FindBy(name = "DateOfBirthMonth")
    private WebElement _MOB;

    @FindBy(name = "DateOfBirthYear")
    private WebElement _YOB;

    @FindBy(id = "Email")
    private WebElement _email;

    @FindBy(id = "Password")
    private WebElement _password;

    @FindBy(id = "ConfirmPassword")
    private WebElement _ConfirmPassword;

    @FindBy(id = "register-button")
    private WebElement _registerbtn;

    @FindBy(css = "h2")
    private WebElement _homepagetext;

    @FindBy(className = "ico-account")
    private WebElement _ACText;

    @FindBy(className = "result")
    private WebElement _confirmRegestration;

    @FindBy(className = "ico-logout")
    private WebElement _logout;


    String Password=LoadProperties.getProperty("Password");
    public static String actext=null;
    public  String email = LoadProperties.getProperty("UserName") + Utils.randomdate() + new Random().nextInt()+"@gmail.com";

    public String homepage() {
        Utils.driverWaitExplicitly(_homepagetext, 5);
        log.info("returining text as"+Utils.get_Text(_homepagetext));
        return Utils.get_Text(_homepagetext);
    }

    public void clickonregistrationlink() {
    	log.info("clicking on registration link");
        Utils.driverWaitExplicitly(_Register, 10);
        Utils.clickOnElement(_Register);
        log.info("clicked on registration link");
        
    }

    public String registrationPage() {

        return Utils.get_Text(_RegisterText);
    }



    public void register() {

    	log.info("entering registartion details");
        Utils.enterText(_EnterFirstName, "Laxmi");
        Utils.enterText(_EnterLastName, "Venepalli");
        Utils.selectElementByValue(_DOB, "2");
        Utils.selectElementByVisibletext(_MOB, "June");
        Utils.selectElementByValue(_YOB, "2000");
        Utils.enterText(_email, email);
        Utils.enterText(_password,"test4you");
        Utils.enterText(_ConfirmPassword, "test4you");
        //clickOnRegisterBtn(_registerbtn);
//        actext = new String();
//        actext =   Utils.get_Text(_ACText);

    }

    public void clickOnRegisterBtn() {
    	log.info("clicking on registartion button");
        Utils.clickOnElement(_registerbtn);
        actext = new String();
        actext =   Utils.get_Text(_ACText);
    }

//    public String getACtext() {
//       //Utils.driverWaitExplicitly(_ACText,5);
//
//       actext =  Utils.get_Text(_ACText);
//        return actext;
//
//    }

    public boolean registrationSuccessfulMessage() {
        return Utils.isElement_Present(_confirmRegestration);
    }

    public void logout() {
        Utils.clickOnElement(_logout);
    }





}
