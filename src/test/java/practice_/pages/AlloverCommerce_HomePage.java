package practice_.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import practice_.utilities.Driver;

public class AlloverCommerce_HomePage {

    public AlloverCommerce_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //SIGN IN / REGISTER LINKS
    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signIn_Link;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement register_Link;

    //LOGIN POPUP (HOMEPAGE)
    //SIGN IN

    @FindBy (xpath = "(//*[@class = 'form-control'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@id='customer_login']//a[.='Sign In']")
    public WebElement signIn_Tab;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='username']")
    public WebElement signIn_Username;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='password']")
    public WebElement signIn_Password;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='rememberme']")
    public WebElement signIn_RememberMeCheckbox;

    @FindBy(xpath = "//div[@id='customer_login']//a[.='Lost your password?']")
    public WebElement signIn_LostPasswordLink;

    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement signIn_Button;

    //SIGN UP
    @FindBy(xpath = "//div[@id='customer_login']//a[.='Sign Up']")
    public WebElement signUp_Tab;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='reg_username']")
    public WebElement signUp_Username;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='reg_email']")
    public WebElement signUp_Email;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='reg_password']")
    public WebElement signUp_Password;

    @FindBy(xpath = "//div[@id='customer_login']//a[.='Signup as a vendor?']")
    public WebElement signUp_AsVendorLink;

    @FindBy(xpath = "//div[@id='customer_login']//input[@id='register-policy']")
    public WebElement signUp_PrivacyPolicyCheckbox;

    @FindBy(xpath = "//div[@id='customer_login']//button[@value='Sign Up']")
    public WebElement signUp_Button;

    @FindBy(xpath = "//div[@id='customer_login']//a[.='Become a Vendor']")
    public WebElement signUp_BecomeVendorLink;

    @FindBy(linkText = "My Account")
    public WebElement myAccountLink;

    //My Account link in the footer
    @FindBy(css = "#menu-footer-nav-2 a[href='https://allovercommerce.com/my-account-2/']")
    public WebElement myAccountLink_Footer;

    //Sign Out Link
    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut_Link;

    @FindBy(name = "s")
    public WebElement Searhbox;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div/div/div[3]/div/div/form/button")
    public WebElement searchButton;

    @FindBy (css = "a.logout")
    public WebElement signOut_NavLink;


    @FindBy (xpath = "//*[contains(text(), 'a valid email')]")
    public WebElement signUp_invalidEmailMessage;

    @FindBy (xpath = "(//div[(text() = 'Weak - Please enter a stronger password.')])[1]")
    public WebElement signUp_WeekPasswordMessage;

    @FindBy (xpath = "(//div[(text() = 'Medium')])[1]")
    public WebElement signUp_MediumPasswordMessage;
    @FindBy (xpath = "(//div[(text() = 'Strong')])[1]")
    public WebElement signUp_StrongPasswordMessage;

    @FindBy(xpath = "//a[.='View cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "(//tbody)[1]")
    public WebElement verifyProductInCartIsSeen;

}


