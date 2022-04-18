package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.ProductsPage;

public class ProductSteps {

    private ProductsPage productsPage = new ProductsPage();

    @Given("^I add (.*) product to cart$")
    public void addProductToTheCart(String product){
        productsPage.addProductToCart(product);
    }

    @Given("^I click on the cart button$")
    public void clickOnCartButton(){
        productsPage.clickOnCartButton();
    }
}
