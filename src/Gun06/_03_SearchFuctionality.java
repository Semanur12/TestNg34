package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
Senaryo

1-Siteyi aç
2-mac kelimesini göndererek aratınız
3-Çıkan sonuçlarda mac kelimesininin geçtiğini doğrula
4-aynı işlemi samsung için de yap

 */
public class _03_SearchFuctionality extends GenelWebDriver {

    @Parameters("arananKelime")
    @Test
    void SearchFunctional(String txtSearch){

        WebElement search=driver.findElement(By.name("search"));
        search.sendKeys(txtSearch);

        WebElement searchButton=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        //h4>a
        List<WebElement>captions=driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e:captions){
            Assert.assertTrue(e.getText().toLowerCase().contains("mac"));
        }


    }

}
