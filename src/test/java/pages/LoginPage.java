package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("page:webdriver.base.url")
public class LoginPage extends PageObject {
    @FindBy(id = "user-name")
    WebElementFacade userTextBox;
    @FindBy(id = "password")
    WebElementFacade passwordTextBox;
    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    public void login(String userName, String password){
        userTextBox.type(userName);
        passwordTextBox.type(password);
        loginButton.click();
    }
}
