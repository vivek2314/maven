package JavaProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickonfirstlink 

{
  @Test
  public void f() throws InterruptedException 
  
  {
	  
	  WebDriverManager.chromedriver().setup();
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.findElement(By.className("gLFyf")).sendKeys("selenium");
      
      //Thread.sleep(1000);
      
      
      WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));    
      
      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span"))).click();
      
      //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span")).click();
  }
}
