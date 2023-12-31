package practice_.tests.US13;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_HomePage;
import practice_.pages.AlloverCommerce_MyAccount_Page;
import practice_.utilities.ConfigReader;
import practice_.utilities.Driver;
import practice_.utilities.WaitUtils;
import java.io.IOException;
import static practice_.utilities.JSUtils.clickWithTimeoutByJS;

public class US13_TC01 {
    WebDriver driver;
    AlloverCommerce_HomePage alloverCommerceHomePage;
    AlloverCommerce_MyAccount_Page myAccountPage;


    @Test
    public void vendorAccNavigation() throws IOException {

        //Go to homepage
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));

        //Click on Register Link
        alloverCommerceHomePage = new AlloverCommerce_HomePage();
        alloverCommerceHomePage.register_Link.click();

        //Enter username
        Faker faker = new Faker();

        String username = faker.name().username();
        System.out.println(username);
        alloverCommerceHomePage.signUp_Username.sendKeys(username);

        //Enter email
        String emailAddress = faker.internet().emailAddress();
        System.out.println(emailAddress);
        alloverCommerceHomePage.signUp_Email.sendKeys(emailAddress);

        //Enter password
        String password = faker.internet().password();
        System.out.println(password);
        alloverCommerceHomePage.signUp_Password.sendKeys(password);

        //Click on Privacy Policy
        clickWithTimeoutByJS(alloverCommerceHomePage.signUp_PrivacyPolicyCheckbox);

        //Click on Sign Up Button
        clickWithTimeoutByJS(alloverCommerceHomePage.signUp_Button);

        //Click on My Account Link
        WaitUtils.waitFor(5);
        clickWithTimeoutByJS(alloverCommerceHomePage.myAccountLink);

        //Click on Addresses Link
        myAccountPage = new AlloverCommerce_MyAccount_Page();
        clickWithTimeoutByJS(myAccountPage.addressesLinkIcon);

    }
}


