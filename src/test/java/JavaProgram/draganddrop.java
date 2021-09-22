package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
  @Test
  public void f() 
  {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	  
	    driver.get("https://jqueryui.com/droppable/");
	 

     
     WebElement ele = driver.findElement(By.className("demo-frame"));    
      driver.switchTo().frame(ele);
      
      WebElement elem1= driver.findElement(By.id("draggable"));
      WebElement elem2= driver.findElement(By.id("droppable"));
              
      Actions act = new Actions(driver);
      act.dragAndDrop(elem1, elem2).build().perform(); 
	    
	    
	   
	     
	      
	    
  }
}
