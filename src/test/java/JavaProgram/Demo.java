package JavaProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception 
	{/*
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElementByXPath("//input[@name='txtUsername']").sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        
        // take screenshot after login.
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Pictures\\screenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);
        
        //Assert if condition false it stop execution
        String actualUrl="https://opensource-demo.orangehrmlive.com/"; 
        String expectedUrl= driver.getCurrentUrl(); 
        Assert.assertEquals(expectedUrl,actualUrl); }   
	*/
	    // Verify  check if condition wrong it does not stop
        // Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Relia");
        // assertFalse(verifyTitle);
	
	    // xpath = //*[@id="txtPassword"]   titile xpath = //*[@id="logInPanelHeading"]
	
		
	}
	
	    
	}


