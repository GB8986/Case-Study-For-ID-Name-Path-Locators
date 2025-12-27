package com.LocatorsIDNameXPath;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementLink {
    WebDriver driver;
    int Total = 0;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", 
            "C:\\SeleniumCoforgeProgram\\Locators in Selenium\\Chrome Browser Jars\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void IDLocatorsExample() throws InterruptedException {
        driver.navigate().to("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        driver.findElement(By.linkText("Vitamins & Supplements")).click();

        List<WebElement> links = driver.findElements(By.tagName("//a"));
        int linkCount = links.size();
        Total += linkCount;

        System.out.println("Number of Links: " + linkCount);
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
