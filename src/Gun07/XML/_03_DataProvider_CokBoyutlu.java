package Gun07.XML;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_CokBoyutlu {


    @Test(dataProvider = "getData")
    void UsernameTest(String username,String password)
    {
        System.out.println("Username = " + username+",password="+password);
    }

    @DataProvider
    public Object[][] getData()
    {

        Object[][] data={
                        {"Merve","12345"},
                        {"Mine","ererer4567"},
                        {"Ahmet","asserfr"},
                        {"Hakan","ksksksk"}
        };

        return data;
    }









}
