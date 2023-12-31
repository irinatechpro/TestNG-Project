package practice_.tests.US09;

import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_HomePage;
import practice_.pages.AlloverCommerce_VendorRegistration_Page;
import practice_.utilities.ConfigReader;
import practice_.utilities.Driver;
import practice_.utilities.WaitUtils;

public class US09_TC01 {
    AlloverCommerce_HomePage alloverCommerceHomePage;
    AlloverCommerce_VendorRegistration_Page alloverCommerceVendorRegistrationPage;
    @Test
    public void vendorRegistration01() {
        // Go to home page
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));

        // Creating page Object
        alloverCommerceHomePage = new AlloverCommerce_HomePage();
        alloverCommerceVendorRegistrationPage = new AlloverCommerce_VendorRegistration_Page();


        //Click on Register link
        alloverCommerceHomePage.register_Link.click();

        //Click on "Become Vendor" link
        alloverCommerceHomePage.signUp_BecomeVendorLink.click();

        //Complete test and close browser
        WaitUtils.waitFor(2);
        Driver.closeDriver();



    }
}





