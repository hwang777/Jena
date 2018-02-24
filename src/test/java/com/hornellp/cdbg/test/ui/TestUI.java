package com.hornellp.cdbg.test.ui;


import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestUI {
    //@Inject
    private WebDriver driver;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/C:/apps/webdrive/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void getCase() throws Exception {
    	driver.get("https://hornellpdev.appiancloud.com/suite/sites/cdbg/page/cases");

        WebElement email = driver.findElement(By.id("un"));
        Thread.sleep(1000);
        email.clear();
        email.sendKeys("henry.wang@bestit.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("pw"));
        password.clear();
        password.sendKeys("appian");
        Thread.sleep(1000);
        
        //driver.findElement(By.cssSelector("input[type='submit']"))
        //   .click();
        
        new Actions(driver)
        .click(driver.findElement(By.cssSelector("input[type='submit']")))
        .perform();
        Thread.sleep(15000);
        assertTrue(driver.findElements(By.id("appian-body")).size() > 0);
        new Actions(driver)
        .click(driver.findElement(By.xpath("//a[text()[contains(.,'TX-FL16-01368')]]"))).perform();
        Thread.sleep(10000);
        

        //driver.close();

    }

@Test
public void reassignTask() throws Exception {
	driver.get("https://hornellpdev.appiancloud.com/suite/sites/cdbg/page/task");

    WebElement email = driver.findElement(By.id("un"));
    Thread.sleep(1000);
    email.clear();
    email.sendKeys("henry.wang@bestit.com");
    Thread.sleep(1000);
    WebElement password = driver.findElement(By.id("pw"));
    password.clear();
    password.sendKeys("appian");
    Thread.sleep(1000);
    
    //driver.findElement(By.cssSelector("input[type='submit']"))
    //   .click();
    
    new Actions(driver)
    .click(driver.findElement(By.cssSelector("input[type='submit']")))
    .perform();
    Thread.sleep(15000);
    assertTrue(driver.findElements(By.id("appian-body")).size() > 0);
    new Actions(driver)
    .click(driver.findElement(By.xpath("//a[text()[contains(.,'TX-FL16-01368')]]"))).perform();
    Thread.sleep(10000);
    

    //driver.close();

}
}
