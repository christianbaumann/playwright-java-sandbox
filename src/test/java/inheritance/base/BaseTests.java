package inheritance.base;

import com.microsoft.playwright.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import pages.LoginPage;

public class BaseTests {

    private static Browser browser;
    protected static LoginPage loginPage;
    protected static Page page;
    protected static BrowserContext context;

    @BeforeClass
    public static void setUpPlaywright() {
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        context = browser.newContext(new Browser.NewContextOptions());
        context.setDefaultTimeout(10000);
        page = context.newPage();

//        goHomePlaywright();
    }

    @Before
    public void goHomePlaywright() {
        page.navigate("https://the-internet.herokuapp.com/login");

        loginPage = new LoginPage(page);
    }

    @AfterClass
    public static void tearDownPlaywright() {
        browser.close();
    }

}
