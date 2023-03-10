package Gun09;

import Gun08._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
Senaryo
1-Siteye gidiniz
2-"ipod" ürününü aratınız."ipod" u xml den gönderiniz.
3-çıkan elemanlardan random bir elemanı Add Wish butonuna tıklayınız.
4-Daha sonra wishliste e tıklayınız.
5-Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.

 */
public class _01_WishList extends GenelWebDriver {

    @Parameters("itemName")
    @Test
    void addToWishList(String aranacakUrun)
    {
        _03_PlaceOrderElements poe=new _03_PlaceOrderElements(driver);
        poe.searchBox.sendKeys(aranacakUrun);
        poe.searchButton.click();

        _02_WishListElements wle=new _02_WishListElements(driver);
        int rndNumber= Tools.RandomGenerator(wle.searchResults.size());
        String rndurunad=wle.searchResults.get(rndNumber).getText();
        wle.wishBtnList.get(rndNumber).click();

        wle.btnWishList.click();

        boolean bulundu=false;
        for (WebElement e:wle.tableNames){
            if (e.getText().equals(rndurunad))

                bulundu=true;
            break;

        }


        System.out.println("bulundu = " + bulundu);
        Assert.assertTrue(bulundu);

    }

}
