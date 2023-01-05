package Gun02;

/*

Senaryo;
-https://opencart.abstracta.us/indexphp?route=account/login sitesini açınız.
-asd@gmail.com ve 123qweasd bilgileri ile login olan test metodunu yazınız


 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _02_Ornek extends GenelWebDriver {


    @Test
    void LoginTest(){
        WebElement inputEmail=driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("qwert23@gmail.com");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123578951");

        WebElement login=driver.findElement(By.className("btn-primary"));
        login.click();






    }




}
