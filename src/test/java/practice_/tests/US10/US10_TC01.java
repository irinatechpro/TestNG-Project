package practice_.tests.US10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import practice_.pages.AlloverCommerce_VendorRegistration_Page;
import practice_.utilities.Driver;
import practice_.utilities.JSUtils;
import practice_.utilities.MediaUtils;
import practice_.utilities.WaitUtils;

import java.io.IOException;

public class US10_TC01 {
    Base base;
    AlloverCommerce_VendorRegistration_Page vendorRegistrationPage;

    @Test
    public void tc01() throws IOException {
        base = new Base();
        vendorRegistrationPage = new AlloverCommerce_VendorRegistration_Page();
        base.repeat("12345");

        base.checkInputField();

        WaitUtils.waitFor(2);
        Assert.assertEquals(
                vendorRegistrationPage.vendorPasswordStrength.getText(),
                "Too short"
        );

        base.clearPasswordField();
        WaitUtils.waitFor(1);
    }

    @AfterClass
    public static void tearUp() {
        Driver.closeDriver();
    }
}

