package stepDefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.util.EnvironmentVariables;
import pages.LoginPage;

public class LoginSteps {
    private EnvironmentVariables environmentVariables;
    private LoginPage loginPage = new LoginPage();

    @Given("^I login with userName (.*) and password (.*)$")
    public void login(String userName, String password){
        loginPage.login(userName, password);
    }

    @Given("^I go to sauce demo page$")
    public void goToSaucePage(){
        loginPage.open();
    }


}
