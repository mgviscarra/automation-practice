package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartSteps {
    private CartPage cartPage = new CartPage();


    @Then("^I verify that the (.*) product was added to the cart$")
    public void verifyProductIsDisplayedInCartPage(String product){
        cartPage.verifyProductIsDisplayedInCartPage(product);
    }

    @Then("^I remove the product (.*)$")
    public void removeProduct(String product){
        cartPage.clickOnRemoveButton(product);
    }

    @Then("^I verify that (.*) was removed from the cart$")
    public void verifyProductWasRemoved(String product){
        cartPage.verifyProductINotDisplayedInCartPage(product);
    }



}
