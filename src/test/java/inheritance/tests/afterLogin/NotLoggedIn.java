package inheritance.tests.afterLogin;

import inheritance.base.BaseTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.SecureAreaPage;

public class NotLoggedIn extends BaseTests {

    protected  SecureAreaPage secureAreaPage;

    @Before
    public void logIn() {
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        secureAreaPage = new SecureAreaPage(page);
    }

    @Test
    public void testHeader(){
        Assert.assertEquals("Secure Area", secureAreaPage.getHeaderText());
    }

}
