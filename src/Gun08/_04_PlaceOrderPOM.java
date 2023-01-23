package Gun08;

import Utils.GenelWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {

    @Test
    void ProceedToCheckout() {

        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);



        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.addToCart.click();
        elements.shoppingCart.click();
        elements.checkOut.click();


        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue3)).click();
        elements.agree.click();


        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue4)).click();
        elements.confirm.click();
        wait.until(ExpectedConditions.urlContains("success")); //Success olana kadar bekle
        Assert.assertEquals(elements.confirm.getText(), "Your order has been placed!", "Karşılaştırma sonucu :");


    }

}
