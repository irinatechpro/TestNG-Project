package practice_.tests.US09;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_HomePage;
import practice_.pages.AlloverCommerce_VendorRegistration_Page;
import practice_.utilities.ConfigReader;
import practice_.utilities.Driver;
import practice_.utilities.WaitUtils;

import static practice_.utilities.JSUtils.clickWithTimeoutByJS;

public class US09_TC02 {
    AlloverCommerce_HomePage alloverCommerceHomePage;
    AlloverCommerce_VendorRegistration_Page alloverCommerceVendorRegistrationPage;
    @Test
   public void vendorRegistrationEmail(){
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));

        // Creating page Object
        alloverCommerceHomePage = new AlloverCommerce_HomePage();
        alloverCommerceVendorRegistrationPage = new AlloverCommerce_VendorRegistration_Page();


        //Click on Register link
        alloverCommerceHomePage.register_Link.click();

        //Click on "Become Vendor" link
        alloverCommerceHomePage.signUp_BecomeVendorLink.click();

        //Enter email in email field
        alloverCommerceVendorRegistrationPage.vendorRegister_Email.sendKeys(ConfigReader.getProperty("vendor_email"));

        // Confirm the Verification code message is visible
        Assert.assertTrue(alloverCommerceVendorRegistrationPage.verificationCodeMessage.isDisplayed());

        //Enter verification code in the Verification Code text box
        alloverCommerceVendorRegistrationPage.verificationCode.sendKeys(ConfigReader.getProperty("verification_code"));

        WaitUtils.waitFor(2);
        Driver.closeDriver();






        }


    }


