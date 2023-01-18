package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {



    @Test
   @Parameters("mesaj") //dinamik hale getir.Mesaj değiştirilebilsin.
    void ContactUs(String gelenmesaj){



        WebElement contactUs=driver.findElement(By.linkText("Contact Us"));
        contactUs.click();

        WebElement enquiryArea=driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys("Merhaba selenium");

        WebElement submitButton=driver.findElement(By.cssSelector("[value='Submit']"));
        submitButton.click();

        WebElement contactUsLabel=driver.findElement(By.cssSelector("[id='content']>h1"));
        System.out.println(contactUsLabel.getText());

        Assert.assertEquals("Contact Us",contactUsLabel.getText(),"Karşılaştırma Sonucu : ");

    }





}
