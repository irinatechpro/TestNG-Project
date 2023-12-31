package practice_.tests.US03;


import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_HomePage;
import practice_.pages.AlloverCommerce_MyAccountCustomerPage;

import practice_.utilities.*;

import java.io.IOException;


public class US03_TC01 {

    @Test
    public void AddBillingAddress() throws IOException {

        AlloverCommerce_HomePage alloverCommerceHomePage = new AlloverCommerce_HomePage();
        AlloverCommerce_MyAccountCustomerPage myAccountCustomerPage = new AlloverCommerce_MyAccountCustomerPage();
        Faker faker = new Faker();


//        Go to Homepage
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));

        //Click on register link
        alloverCommerceHomePage.register_Link.click();
        WaitUtils.waitFor(1);
        //Enter username
        alloverCommerceHomePage.signUp_Username.sendKeys(faker.name().username());
        WaitUtils.waitFor(1);
        //Enter useremail
        alloverCommerceHomePage.signUp_Email.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(1);
        //enter password
        alloverCommerceHomePage.signUp_Password.sendKeys(faker.internet().password());
        WaitUtils.waitFor(1);
        //select the checkbox
        alloverCommerceHomePage.signUp_PrivacyPolicyCheckbox.click();
        WaitUtils.waitFor(1);
        //Click on signup button
        alloverCommerceHomePage.signUp_Button.click();
        WaitUtils.waitFor(10);

        //Click on My Account
        JSUtils.scrollIntoViewJS(AlloverCommerce_MyAccountCustomerPage.myAccountCustomer);
        WaitUtils.waitForClickablility(AlloverCommerce_MyAccountCustomerPage.myAccountCustomer, 10).click();
        //WaitUtils.waitFor(3);
        // MyAccount_CustomerPage.myAccountCustomer.click();

        //Click on Adresses button
        AlloverCommerce_MyAccountCustomerPage.AddressesCustomer.click();
        //Click on Add button for billing adress
        AlloverCommerce_MyAccountCustomerPage.add_link.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
}