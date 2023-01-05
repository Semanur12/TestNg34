package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/*
Senaryo
1-Sitesyi açınız
2-Top menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidition)

 */
public class _01_ValidateMenu extends GenelWebDriver {


    @Test
    void menuValidition(){

        List<String>menuExceptedList=new ArrayList<>();
        menuExceptedList.add("Desktops");
        menuExceptedList.add("Laptops & Notebooks");
        menuExceptedList.add("Components");
        menuExceptedList.add("Tablets");
        menuExceptedList.add("Software");
        menuExceptedList.add("Phones & PDAs");
        menuExceptedList.add("Cameras");
        menuExceptedList.add("MP3 Players");

       By menuFinder=By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement>mnuActualList=driver.findElements(menuFinder);


        Tools.compareToList(menuExceptedList,mnuActualList);




    }








}
