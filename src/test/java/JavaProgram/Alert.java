package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
  @Test
  public void f() throws InterruptedException 
  
  {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com/alerts");
      
      driver.manage().window().maximize();
      
      driver.findElement(By.id("alertButton")).click();
      Thread.sleep(2000);
      
      driver.switchTo().alert().accept();
              
      driver.findElement(By.id("timerAlertButton")).click();
      Thread.sleep(6000);
      String str=driver.switchTo().alert().getText();
      System.out.println(str);
      
      driver.switchTo().alert().accept();
      
      driver.findElement(By.id("confirmButton")).click();
      Thread.sleep(2000);
      
      driver.switchTo().alert().dismiss();
              
      driver.findElement(By.id("promtButton")).click();
      Thread.sleep(2000);
      
      driver.switchTo().alert().sendKeys("Selenium");
      
      driver.switchTo().alert().accept();
                      
  
	  
	  
	  
  }
}
