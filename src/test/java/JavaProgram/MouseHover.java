package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
  @Test
  public void f()
  
  {
	  WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      
      WebElement element = driver.findElement(By.id("mousehover"));
      
      JavascriptExecutor js= (JavascriptExecutor)driver;
      js.executeScript("window.scroll(0,1300)");
      
      Actions act = new Actions(driver);
      
      act.moveToElement(element).build().perform();
  }
}
