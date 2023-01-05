package Gun03;


import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Senaryo
1-Siteyi açınız
2-Newsletter Subscribe ve Unsubscribe işlemlerini ayrı ayrı testlerde yapınız.
 */
public class _03_SubScribe extends GenelWebDriver {







    @Test(priority = 1)
    void subScribeFunctionYes(){

        WebElement newsLatter=driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        newsLatter.click();

        WebElement accept=driver.findElement(By.cssSelector("input[value='1']"));
        accept.click();

        WebElement cont=driver.findElement(By.xpath("//input[@value='Continue']"));
        cont.click();

        Tools.successMessageValidation();
    }


    @Test(priority = 2)
    void subScribeFunctionNo(){

        WebElement newsLatter=driver.findElement(By.linkText("Newsletter"));
        newsLatter.click();

        WebElement accept=driver.findElement(By.cssSelector("input[value='0']"));
        accept.click();

        WebElement cont=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        cont.click();

        Tools.successMessageValidation();
    }
}
