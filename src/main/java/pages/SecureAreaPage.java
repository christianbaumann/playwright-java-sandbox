package pages;

import com.microsoft.playwright.Page;

public class SecureAreaPage extends BasePage {

    private String locatorStatusAlert = "#flash";
    private String locatorHeader = "//*[@id=\"content\"]/div/h2";

    public SecureAreaPage(Page page) {
        this.page = page;
    }

    public String getAlertText() {
        return page.waitForSelector(locatorStatusAlert).textContent();
    }

    public String getHeaderText() {
        return page.waitForSelector(locatorHeader).innerText();
    }
}
