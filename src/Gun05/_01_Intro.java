package Gun05;

import org.testng.annotations.*;

public class _01_Intro {

    /*
     @BeforeSuit
      @BeforeTest
       @BeforeGroup
        @BeforeClass
         @BeforeMethod
          @Test
          @Test
         @AfterMethod
        @AfterClass
       @AfterGroup
      @AfterTest
     @AfterSuit
     */

    @BeforeSuite
    void bSuit(){
        System.out.println("Before Suit");
    }

    @BeforeTest
    void bTest(){
        System.out.println("Before Test");
    }


    @BeforeGroups
    void bGroup(){
        System.out.println("Before Group");
    }

    @BeforeClass
    void bClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    void bMethod(){
        System.out.println("Before Method");
    }


    @Test
    void TestIntro1_1(){
        System.out.println("Test Intro 1");
    }

    @Test
    void TestIntro1_2(){
        System.out.println("Test Intro 2");
    }



    @AfterMethod
    void aMethod(){
        System.out.println("After Method");
    }


    @AfterClass
    void aClass(){
        System.out.println("After Class");
    }


    @AfterGroups
    void aGroup(){
        System.out.println("After Group");
    }


    @AfterTest
    void aTest(){
        System.out.println("After Test");
    }


    @AfterSuite
    void aSuit(){
        System.out.println("After Suit");
    }

}
