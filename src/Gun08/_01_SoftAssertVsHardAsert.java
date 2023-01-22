package Gun08;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAsert {

    @Test
    void hardAsert(){

        String s1="Merhaba";

        System.out.println("Hard Assert öncesi");
        Assert.assertEquals("Merhaba 123",s1,"HardAssert Sonucu");
        System.out.println("Hard Assert sonrası"); //hard assert hata verdiğinde sonrası çalışmaz

    }


    @Test
    void softAsert(){

        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softassert=new SoftAssert();
        _softassert.assertEquals("www.facebook.com/homepage",strHomePage); //true
        System.out.println("assert 1");


        _softassert.assertEquals("www.facebook.com/profile",strCartPage); //true
        System.out.println("assert 2");


        _softassert.assertEquals("www.facebook.com/settings",strEditAccount); //true
        System.out.println("assert 3");

        _softassert.assertAll(); //bütün assert sonuçlarını işleme koyuyor.
        System.out.println("Aktiflik sonrası"); //bu bölüm assertAll dan sonra olduğu ve öncesinde hata oluştuğu
                                                //için yazılamadı.






    }



}
