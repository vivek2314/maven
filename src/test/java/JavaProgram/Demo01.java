package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo01
{
	@Test
	void t_Test_Login()
	{
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    // using custom xpath = 
	    // //input[@name='txtUsername']
	    // //+
	    
	    // driver.findElementByXPath("//input[@name='txtUsername']").sendKeys("Admin");
        // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        //driver.findElement(By.id("btnLogin")).click();
        
        String str = driver.findElement(By.id("txtUsername")).getAttribute("type");
        System.out.println(str);
	}
      
}
