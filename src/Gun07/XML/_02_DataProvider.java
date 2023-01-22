package Gun07.XML;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider {


    /*
   *Aşağıdaki ikili ile DataProviderin içindeki bütün veriler tek tek test e gönderilerek
   *data sayısı kadar test çalıştırılır,dataların olduğu yere DataProvider annotion ı konur.
   *çalıştırılacak teste ise dataprovider="getdata" bölümü eklenir.
   * DataProvider bir testi birden fazla DATA  ile çok çalıştırmak için kullanılır.
   * XML file ise gruplama,paralel ve farklı testleri koordine edip bir arada çalıştırmak için kullanılır.
     */

    @Test(dataProvider = "getData")
    void UsernameTest(String username)
    {
        System.out.println("Username = " + username);
    }

    @DataProvider //bu metoda dataprovider görevi verildi
    public Object[] getData() //dataprovider olarak kullanılacak metodun tipi object olmak zorunda
    {

        Object[] data={"Merve","Mine","Ahmet","Hakan"};

        return data;
    }

    /************************************/


    @Test(dataProvider = "userlar") //dataproviderin ismi burda metod adı yerine kullanıldı.
    void UsernameTest2(String username)
    {
        System.out.println("Username = " + username);
    }

    @DataProvider(name="userlar")
    public Object[] getData2()
    {

        Object[] data={"Merve","Mine","Ahmet","Hakan"};

        return data;
    }








}
