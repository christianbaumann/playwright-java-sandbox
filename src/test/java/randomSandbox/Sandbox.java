package randomSandbox;

import com.microsoft.playwright.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sandbox {

    private static Browser browser;
    protected static Page page;
    protected static BrowserContext context;

    @Before
    public void setUpPlaywright() {
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        context = browser.newContext(new Browser.NewContextOptions());
        context.setDefaultTimeout(10000);
        page = context.newPage();

        goHomePlaywright();
    }

    @Before
    public void goHomePlaywright() {
        page.navigate("https://the-internet.herokuapp.com/");
    }

    @After
    public void tearDownPlaywright() {
        browser.close();
    }

    @Test
    public void testPagePause() {

        //  easy way to pause the Playwright script execution and inspect the page in Developer tools.
        //  also opens Playwright Inspector to help with debugging.
        page.pause();
    }

}
