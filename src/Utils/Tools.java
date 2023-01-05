package Utils;

import com.google.common.cache.AbstractCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void compareToList(List<String >menuExceptedList, List<WebElement>mnuActualList){

        for (int i = 0; i<menuExceptedList.size(); i++)
            Assert.assertEquals(menuExceptedList.get(i),mnuActualList.get(i).getText());


    }

    public static void successMessageValidation(){


        WebElement YesilyaziDogrula= GenelWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(YesilyaziDogrula.getText().contains("Success"));

    }
}
