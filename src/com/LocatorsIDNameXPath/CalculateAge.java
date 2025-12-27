
package com.LocatorsIDNameXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalculateAge {
    @Test
    public void IDLocatorsExample() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\SeleniumCoforgeProgram\\Locators in Selenium\\Chrome Browser Jars\\chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.easycalculation.com/date-day/age-calculator.php");
	        
	         driver.manage().window().maximize();
	         Thread.sleep(5000);
	        
	         driver.findElement(By.id("i21")).sendKeys("10");
	         driver.findElement(By.id("i22")).sendKeys("5");
	         driver.findElement(By.id("i23")).sendKeys("2003");
	         //Thread.sleep(5000);
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[6]/div[3]/form/table/tbody/tr[10]/td/input[1]")).click();
	       //  driver.findElement(By.xpath("input[@name='but']")).click();
	         String ageText = driver.findElement(By.id("r1")).getText();
	         String ageText1 = driver.findElement(By.id("r4")).getText();
	         String ageText2 = driver.findElement(By.id("r3")).getText();
	         String ageText3 = driver.findElement(By.id("r2")).getText();
	         if (ageText == null || ageText.trim().isEmpty()) {
	             ageText = driver.findElement(By.id("r1")).getAttribute("value");
	         }
	         if (ageText1 == null || ageText1.trim().isEmpty()) {
	             ageText1 = driver.findElement(By.id("r4")).getAttribute("value");
	         }
	         if (ageText2 == null || ageText2.trim().isEmpty()) {
	             ageText2 = driver.findElement(By.id("r3")).getAttribute("value");
	         }
	         if (ageText3 == null || ageText3.trim().isEmpty()) {
	             ageText3 = driver.findElement(By.id("r2")).getAttribute("value");
	         }
			System.out.println("Calculated Age in years Format: "+ageText);
			System.out.println("Calculated Age in Days Format: "+ageText1);
			System.out.println("Calculated Age in Hours Format: "+ageText2);
			System.out.println("Calculated Age in Minutes Format: "+ageText3);
			
			//driver.findElement(By.xpath("//input[@value='Reset']")).click();
			
	  		
	         
	
	         driver.quit();
    }
}


