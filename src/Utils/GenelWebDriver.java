package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class GenelWebDriver {



    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri(){
        System.out.println("Driver start....");


        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); //Sessize al
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();//max
        driver.manage().deleteAllCookies();


        wait=new WebDriverWait(driver, Duration.ofSeconds(30));



        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //Sadece ana sayfa yüklenirken en başta hata vermemesi için
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Bütün WebElement için geçerli

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        LoginTest();





    }


    @AfterClass
    public void BitisIslemleri(){
        System.out.println("Driver stop....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }



    @Test
    void LoginTest() {
        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("qwert23@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123578951");

        WebElement login = driver.findElement(By.xpath("//*[@value='Login']"));
        login.click();



    }
}
