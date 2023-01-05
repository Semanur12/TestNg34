package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    //Yeşil tik: testte hata yok
    //Sarı Çarpı:Testte hata var
    //Beyaz:Test Çalıştırılmadı , skip




    @Test
    void EqualOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        //oluşan,beklenen,"hata başlığı
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
        //Actual -> Olan
        //Expected -> Beklenen

    }

    @Test
    void NotEqualOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        //oluşan,beklenen,"hata başlığı
        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");
        //Actual -> Olan
        //Expected -> Beklenen

    }
    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=55;

        //oluşan,beklenen,"hata başlığı
        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");
        //Actual -> Olan
        //Expected -> Beklenen

    }


    @Test
    void direktFail(){
        Assert.fail();
    }






}
