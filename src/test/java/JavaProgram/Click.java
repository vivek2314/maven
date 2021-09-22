package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {
  @Test
  public void f() 
  
  
  {
	  
	  
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
	    driver.manage().window().maximize();
	
	    //**************Double Click********************************//
	    WebElement db=driver.findElement(By.id("doubleClickBtn"));
	    Actions act=new Actions(driver);
	    act.doubleClick(db).build().perform();
	    
	    
	    //*******************Right Click******************************//
	    
	    WebElement db1=driver.findElement(By.id("rightClickBtn"));
	    Actions act1=new Actions(driver);
	    act1.contextClick(db1).build().perform();
	    
	    //***************************Normal Click****************************//
	    
	    driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	    
	  
	    
	 
	    
	    
  }
}
