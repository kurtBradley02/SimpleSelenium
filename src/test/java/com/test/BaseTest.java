package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void initTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://xyvlph.csb.app/");

    }

    @AfterTest
    public void endTest(){

    }

}
