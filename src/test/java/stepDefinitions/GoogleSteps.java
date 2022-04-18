package stepDefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.util.EnvironmentVariables;
import pages.GooglePage;

public class GoogleSteps {
    private EnvironmentVariables environmentVariables;
    private GooglePage googlePage = new GooglePage();

    @Given("^I go to google page$")
    public void goToGooglePager(){
        googlePage.open();
    }

    @Given("^I search (.*) in google$")
    public void searchInGoogle(String search){
        googlePage.searchGoogle(search);
    }
}
