package practice_.tests.US09;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_HomePage;
import practice_.pages.AlloverCommerce_VendorRegistration_Page;
import practice_.utilities.ConfigReader;
import practice_.utilities.Driver;
import practice_.utilities.WaitUtils;

import static practice_.utilities.JSUtils.clickWithTimeoutByJS;

public class US09_TC03 {
    AlloverCommerce_HomePage alloverCommerceHomePage;
    AlloverCommerce_VendorRegistration_Page alloverCommerceVendorRegistrationPage;

    @Test
    public void vendorEmailNegativeTest() {
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));

        // Creating page Object
        alloverCommerceHomePage = new AlloverCommerce_HomePage();
        alloverCommerceVendorRegistrationPage = new AlloverCommerce_VendorRegistration_Page();


        //Click on Register link
        alloverCommerceHomePage.register_Link.click();

        //Click on "Become Vendor" link
        alloverCommerceHomePage.signUp_BecomeVendorLink.click();

        //Enter verification code in the Verification Code text box
        alloverCommerceVendorRegistrationPage.verificationCode.sendKeys(ConfigReader.getProperty("verification_code"));

        //Enter valid password in Password field
        alloverCommerceVendorRegistrationPage.vendorPassword.sendKeys(ConfigReader.getProperty("vendor_password"));
        System.out.println(alloverCommerceVendorRegistrationPage.vendorPassword.getText());
         WaitUtils.waitFor(5);
        //Enter password into Confirm Password field
        alloverCommerceVendorRegistrationPage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("vendor_password"));
        System.out.println(alloverCommerceVendorRegistrationPage.vendorConfirmPassword.getText());

        WaitUtils.waitFor(5);
        clickWithTimeoutByJS(alloverCommerceVendorRegistrationPage.registerButton);

        Assert.assertTrue(
                WaitUtils.waitForVisibility(alloverCommerceVendorRegistrationPage.emailRequireMessage,
                        15).isDisplayed());

        WaitUtils.waitFor(2);
        Driver.closeDriver();









    }
}
