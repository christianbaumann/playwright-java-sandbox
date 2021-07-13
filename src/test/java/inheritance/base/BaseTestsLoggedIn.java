package inheritance.base;

import org.junit.Before;
import pages.SecureAreaPage;

public class BaseTestsLoggedIn extends BaseTests {

    protected  SecureAreaPage secureAreaPage;

    @Before
    public void logIn() {
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        secureAreaPage = new SecureAreaPage(page);
    }

}
