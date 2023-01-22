package Gun07.XML;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_DataProvider_Iterator {


    @Test(dataProvider = "getData")
    void UsernameTest(String username) {
        System.out.println("Username = " + username);
    }

    @DataProvider
    public Iterator<Object> getData() {


        List<Object> data = new ArrayList<>();
        data.add("Merve");
        data.add("Mine");
        data.add("Ahmet");
        data.add("Hakan");


        return data.iterator();
    }



    @Test(dataProvider = "getData")
    void UsernameTest2(String username,String password)
    {

        System.out.println("Username = " + username+",password="+password);
    }

    @DataProvider
    public Iterator<Object[]> getData2()
    {
        List<Object[]> data = new ArrayList<>();

        data.add(new Object[]{"Merve","12234rf"});
        data.add(new Object[]{"Mine","smsmmm"});
        data.add(new Object[]{"Ahmet","şdkdnddj"});
        data.add(new Object[]{"Hakan","123mffı"});



        return data.iterator();
    }

}



