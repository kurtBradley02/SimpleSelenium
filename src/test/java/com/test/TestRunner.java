package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestRunner extends BaseTest{

    @Test
    public void executeTest() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"btn-answer-yes\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("USERNAME");

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("USERNAME");

    }

}
