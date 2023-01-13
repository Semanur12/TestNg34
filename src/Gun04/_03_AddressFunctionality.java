package Gun04;


import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.util.List;

/*
Senaryo

1-Siteyi aç
2-Adress ekle
 */
public class _03_AddressFunctionality extends GenelWebDriver {

    @Test
    void addAddress(){

        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();


        WebElement newAddress=driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Ahmet");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Yılmaz");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Yılmazlar");

        WebElement address1=driver.findElement(By.id("input-address-1"));
        address1.sendKeys("21a London Road");

        WebElement address2=driver.findElement(By.id("input-address-2"));
        address2.sendKeys("RG2 5BJ");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Reading");

        WebElement postCode=driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        WebElement country=driver.findElement(By.id("input-country"));
        Select countryS=new Select(country);
        countryS.selectByVisibleText("United States");


        WebElement State=driver.findElement(By.id("input-zone"));
        Select state=new Select(State);
        state.selectByVisibleText("California");


        WebElement defadres=driver.findElement(By.cssSelector("label [name='default'][value='1']"));
        defadres.click();

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();


        Tools.successMessageValidation();



    }


}

