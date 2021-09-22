package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
  @Test
  public void f() 
  {
	  WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      
      WebElement element = driver.findElement(By.id("dropdown-class-example")); 
      
      Select s = new Select (element);
      
      s.selectByVisibleText("Option2");
  }
  
  
  
  
}
