package seleniumSampleTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import seleniumDriverConfig.Driver;

public class Drafts1 {

    @Test
    public void test1(){
        Driver.get().get("https://www.google.ca");
        System.out.println("Test 1");
    }


    @Test
    public void test2(){
        Driver.get().get("https://www.bestbuy.ca");
        System.out.println("Test 2");
    }

    @AfterMethod
    public void tearDown(){
        Driver.quit();
    }


}
