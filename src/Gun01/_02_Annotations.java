package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*

    @BeforeClass -> Her class çalışıyorken önce burası çalışır.
      @BeforeMetod ->Her testten önce çalışır
       @Test ->Testlerin çalıştığı metodlar
       @Test ->Testlerin çalıştığı metodlar
     @AfterMetod ->Her testten sonra çalışır
    @AfterClass -> Her class çalışıyorken sonra burası çalışır.

     */

    @BeforeClass
    void beforeClass(){ System.out.println("Her class dan önce çalışacak :Before Class"); }


    @BeforeMethod
    void beforeMetod(){ System.out.println("Her test metod dan önce çalışacak :Before Metod"); }

    @Test
    void test1(){ System.out.println("Test 1 çalıştı.");  }

    @Test
    void test2(){ System.out.println("Test 2 çalıştı");  }



    @AfterMethod
    void afterMetod(){ System.out.println("Her test metod dan sonra çalışacak :After metod");  }


    @AfterClass
    void afterClass(){ System.out.println("Her class dan sonra çalışacak :After Class");  }


}
