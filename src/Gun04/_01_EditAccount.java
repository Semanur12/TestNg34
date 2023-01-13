package Gun04;


import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
Senaryo
1-Siteyi açınız
2-Edit Account a tıklatınız.
3-Yeni isim ve soyisim göndererek Continue yapınız
4-İşlem sonucunu kontrol ediniz
5-Bu işlemi 24 kez çalıştırarak eski haline getiriniz.
*/
public class _01_EditAccount extends GenelWebDriver {

    @Test
    void EditAccount(){

        editAccount("Elif","yavuz");

        Tools.Bekle(2);

        editAccount("Ahmet","yılmaz");


    }

    void editAccount(String ad,String soyad) {

        WebElement edit=driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(ad);


        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys(soyad);

        WebElement cntbtn=driver.findElement(By.cssSelector("input[value='Continue']"));
        cntbtn.click();

        Tools.successMessageValidation();




    }


}


