package Gun08;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*

Senaryo

1-Siteyi açınız
2-Sitede "ipad" kelimesini aratınız.
3-Çıkan sonuçlardan ilkini sepete atınız.
4-Shopping  Chart a tıklatınız.
5-Checkout yapınız.
6-Continue butonlarına tıklatıp bilgileri giriniz.
7-En Confirm ile sipariş verdiğinizi doğrulayınız.
  doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
 */
public class _02_PlaceOrder extends GenelWebDriver {

    @Test
    void ProceedToCheckout(){

        WebElement searcBox=driver.findElement(By.name("search"));
        searcBox.sendKeys("ipod");

        WebElement searchButton=driver.findElement(By.className("input-group-btn"));
        searchButton.click();

        WebElement addToCart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToCart.click();

        WebElement shoppingCart=driver.findElement(By.linkText("Shopping Cart"));
        shoppingCart.click();

        WebElement checkOut=driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement continue1=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();


        WebElement continue3=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();


        WebElement continue4=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click(); //wait de her zaman bekler

        WebElement confirm=driver.findElement(By.id("button-confirm"));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success")); //Success olana kadar bekle

        WebElement confirmtxt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='content']>h1")));

        Assert.assertEquals(confirmtxt.getText(),"Your order has been placed!","Karşılaştırma sonucu :");





        






















    }
















}
