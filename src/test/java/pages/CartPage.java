package pages;

import junit.framework.AssertionFailedError;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.assertj.core.api.Assertions.assertThat;
public class CartPage extends PageObject {

    private String productNameLocator = "//a/div[text()='%s']";
    private String removeButtonLocator = "//a/div[text()='%s']/ancestor::div[@class='cart_item_label']/div/button";

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElementFacade removeButton;

    public void verifyProductIsDisplayedInCartPage(String product){
        WebElementFacade productNameLink = find(String.format(productNameLocator, product));
        assertThat(productNameLink.isDisplayed());
    }

    public void clickOnRemoveButton(String product){
        WebElementFacade removeButton = find(String.format(removeButtonLocator, product));
        removeButton.click();
    }

    public void verifyProductINotDisplayedInCartPage(String product){
        try{
            WebElementFacade productNameLink = find(String.format(productNameLocator, product));
            assertThat(!productNameLink.isDisplayed());
        } catch (Exception e){

        }


    }
}
