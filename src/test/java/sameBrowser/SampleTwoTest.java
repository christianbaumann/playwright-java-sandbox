package sameBrowser;

import org.junit.Test;

public class SampleTwoTest extends BaseTests {

    @Test
    public void testAbTesting(){
        page.waitForSelector("text=A/B Testing").click();

        sleep(2000L);
    }

    @Test
    public void testBrokenImages(){
        page.waitForSelector("text=Broken Images").click();

        sleep(2000L);
    }

}
