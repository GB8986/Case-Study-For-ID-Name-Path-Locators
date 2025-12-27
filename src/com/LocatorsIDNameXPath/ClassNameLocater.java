

package com.LocatorsIDNameXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassNameLocater {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCoforgeProgram\\CaseStudyForIDNameXPathLocators\\Chrome Browser Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.className("srchBtnSe")).click();
		
		try {
			Thread.sleep(10000);
		}
		catch (Exception e) {
			
		}
		driver.quit();
	}
}