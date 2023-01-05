package Gun01;

import org.testng.annotations.Test;

public class _01_Giris  {

    @Test(priority = 1) //annotation lar
    void webSitesiniAc(){
        System.out.println("driver tanımlandı ve web sitesi açıldı.");
    }

    @Test(priority = 2)
    void logintestIsleminiYap(){
        System.out.println("login test işlemleri yapıldı.");

    }

    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("Driver kapatıldı ve çıkıldı.");
        //Yeşil tik hatalı assertion yok demektir.
    }





}
