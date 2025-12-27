package com.LocatorsIDNameXPath;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountNoofIMGLinks {
    WebDriver driver;
    int Total = 0;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumCoforgeProgram\\Locators in Selenium\\Chrome Browser Jars\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void IDLocatorsExample() throws InterruptedException {
        driver.navigate().to("https://www.naukri.com/");
        Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

//        driver.findElement(By.partialLinkText("Vitamins")).click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links: " + links.size());
        
        
        for (WebElement ele:links) {
        	System.out.println(ele.getText());
            System.out.println(ele.getAttribute("href"));
            System.out.println(ele.isDisplayed());
            System.out.println(ele.isEnabled());
            
        }
        
        
        List<WebElement> imgs = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images in this page :"+ imgs.size());

        for(WebElement ele:imgs) {
        	System.out.println("Src"+ele.getAttribute("src"));
        }
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
