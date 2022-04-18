package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsPage extends PageObject {

    private static String productLocator = "//div[text()='%s']/ancestor::div[@class='inventory_item_description']/div/button";
   @FindBy(css = "a.shopping_cart_link")
    WebElementFacade cartButton;

    public void addProductToCart(String product){
        WebElementFacade addButtonForProduct = find(String.format(productLocator, product));
        addButtonForProduct.click();
    }

    public void clickOnCartButton(){
        cartButton.click();
    }


}
