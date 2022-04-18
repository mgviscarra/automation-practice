package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

import static net.sourceforge.htmlunit.corejs.javascript.Context.enter;

@DefaultUrl("page:webdriver.base.url")
public class GooglePage extends PageObject {
    @FindBy(xpath = "//input[@name='q']")
    WebElementFacade searchTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade searchButton;

    public void searchGoogle(String search){
        searchTextBox.type(search);
        searchTextBox.sendKeys(Keys.ENTER);
    }
}
