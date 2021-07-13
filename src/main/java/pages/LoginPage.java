package pages;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    private String locatorUsernameField = "#username";
    private String locatorPasswordField = "#password";
    private String locatorLoginButton = ".radius";

    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void setUsername(String username) {
        page.fill(locatorUsernameField, username);

    }

    public void setPassword(String password) {
        page.fill(locatorPasswordField, password);
    }

    public void clickLoginButton() {
        page.waitForSelector(locatorLoginButton).click();
    }
}
