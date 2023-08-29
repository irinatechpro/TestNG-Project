package practice_.tests.US05;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_HomePage;
import practice_.pages.AlloverCommerce_MyAccount_Page;
import practice_.utilities.*;

public class US05_TC01 {

    AlloverCommerce_HomePage alloverCommerceHomePage;
    AlloverCommerce_MyAccount_Page alloverCommerceMyAccountPage;

    @Test
    public void TC01(){


        Faker faker = new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));
        alloverCommerceHomePage = new AlloverCommerce_HomePage();
        alloverCommerceMyAccountPage = new AlloverCommerce_MyAccount_Page();
        alloverCommerceHomePage.register_Link.click();
        String username = faker.name().username();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(12,13,true,true,true);
        alloverCommerceHomePage.signUp_Username.sendKeys(username);
        alloverCommerceHomePage.signUp_Email.sendKeys(email);
        alloverCommerceHomePage.signUp_Password.sendKeys(password);
        alloverCommerceHomePage.signUp_PrivacyPolicyCheckbox.click();
        alloverCommerceHomePage.signUp_Button.click();
        WaitUtils.waitFor(2);
        alloverCommerceHomePage.signOut_NavLink.click();
        JSUtils.clickWithTimeoutByJS(alloverCommerceMyAccountPage.logoutButton);
        Driver.getDriver().navigate().to(ConfigReader.getProperty("allovercommerce_url"));
        alloverCommerceHomePage.signIn_Link.click();
        alloverCommerceHomePage.signIn_Username.sendKeys(username);
        alloverCommerceHomePage.signIn_Password.sendKeys(password);
        alloverCommerceHomePage.signIn_Button.click();
        //Assert.assertTrue(alloverCommerceMyAccountPage.accountDetailslink.isDisplayed());
        Driver.closeDriver();
    }
}
