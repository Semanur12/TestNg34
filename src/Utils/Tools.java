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
        Assert.assertTrue(YesilyaziDogrula.getText().toLowerCase().contains("Success"));

    }



    public static void Bekle(int saniye)  {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static double WebElementToDouble(WebElement e){
        String result=e.getText();
        result=result.replaceAll("[^\\d]","");
        return Double.parseDouble(result);
    }


    public static int RandomGenerator(int max)
    {
        return (int)(Math.random() * max); //max=4 ise -->0,1,2,3
    }

}
