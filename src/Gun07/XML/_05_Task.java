package Gun07.XML;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*

Daha önceki derslerde yaptığımı search fonksiyonunu
Mac,ipad,ve samsung için Dataprovider ile yapınız.

 */
public class _05_Task extends GenelWebDriver {


    @Test(dataProvider = "getdata")
    void SearchFunctional(String txtSearch){

        WebElement search=driver.findElement(By.name("search"));
        search.clear();
        search.sendKeys(txtSearch);

        WebElement searchButton=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        //h4>a
        List<WebElement> captions=driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e:captions){
            Assert.assertTrue(e.getText().toLowerCase().contains("mac"));
        }


    }


    @DataProvider
    public Object[] getdata()
    {
        Object[]data={"Mac","ipod","Samsung"};
        return data;

    }

}
