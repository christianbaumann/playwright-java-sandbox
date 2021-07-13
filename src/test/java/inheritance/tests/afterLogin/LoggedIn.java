package inheritance.tests.afterLogin;

import inheritance.base.BaseTestsLoggedIn;
import org.junit.Assert;
import org.junit.Test;

public class LoggedIn extends BaseTestsLoggedIn {

    @Test
    public void testHeader(){
        Assert.assertEquals("Secure Area", secureAreaPage.getHeaderText());
    }
}
