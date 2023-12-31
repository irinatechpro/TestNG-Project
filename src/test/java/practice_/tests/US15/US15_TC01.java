package practice_.tests.US15;

import org.testng.annotations.Test;
import practice_.pages.*;
import practice_.utilities.*;

import static org.testng.AssertJUnit.assertTrue;

public class US15_TC01 {

    AlloverCommerce_HomePage alloverCommerceHomePage;
    AlloverCommerce_VendorRegistration_Page vendorRegistrationPage;
    AlloverCommerce_MyAccount_Page accountPage;
    AlloverCommerce_Coupons_Page couponsPage;
    AlloverCommerce_ProductsManage productManage;

    @Test
    public void ProductOptions(){

        //Go to Homepage
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerce_url"));

        //Create objects for pages
        alloverCommerceHomePage = new AlloverCommerce_HomePage();
        vendorRegistrationPage = new AlloverCommerce_VendorRegistration_Page();
        accountPage = new AlloverCommerce_MyAccount_Page();
        couponsPage = new AlloverCommerce_Coupons_Page();
        productManage = new AlloverCommerce_ProductsManage();

        //Click on Sign In Link
        alloverCommerceHomePage.signIn_Link.click();

        //Enter registered email into Username or email address field
        alloverCommerceHomePage.signIn_Username.sendKeys(ConfigReader.getProperty("vendor_email"));

        //Enter valid password into Password field
        alloverCommerceHomePage.signIn_Password.sendKeys(ConfigReader.getProperty("vendor_password"));

        //Click on Signin button
        alloverCommerceHomePage.signIn_Button.click();
        WaitUtils.waitFor(5);

        //Click on My Account link
       // JSUtils.scrollIntoViewJS(vendorRegistrationPage.myAccountLink);
       // WaitUtils.waitForClickablility(vendorRegistrationPage.myAccountLink, 10).click();
        JSUtils.clickWithTimeoutByJS(alloverCommerceHomePage.myAccountLink);
        // Click on the 'Store Manager' link
        JSUtils.scrollIntoViewJS(accountPage.dashboardLink);
        JSUtils.clickWithTimeoutByJS(accountPage.storeManagerLink);
        WaitUtils.waitForPageToLoad(15);
        JSUtils.scrollIntoViewJS(accountPage.storeManagerLogo);
        WaitUtils.waitFor(1);

        // Click on 'Products'
        ActionsUtils.hoverOverOnElementActions(accountPage.productLink);

        // Click on 'Add new'
        WaitUtils.waitForVisibility(accountPage.addNewProduct, 15);
        accountPage.addNewProduct.click();

        BrowserUtils.verifyElementClickable(accountPage.inventory);
        assertTrue(accountPage.inventory.isDisplayed());

        BrowserUtils.verifyElementClickable(accountPage.shipping);
        assertTrue(accountPage.shipping.isDisplayed());

        BrowserUtils.verifyElementClickable(accountPage.attributes);
        assertTrue(accountPage.attributes.isDisplayed());

        BrowserUtils.verifyElementClickable(accountPage.linked);
        assertTrue(accountPage.linked.isDisplayed());

        BrowserUtils.verifyElementClickable(accountPage.seo);
        assertTrue(accountPage.seo.isDisplayed());

        BrowserUtils.verifyElementClickable(accountPage.advanced);
        assertTrue(accountPage.advanced.isDisplayed());

        //Complete test and close browser
        WaitUtils.waitFor(3);
        //ExtentReportUtils.flush();
        //Driver.closeDriver();
    }
}
