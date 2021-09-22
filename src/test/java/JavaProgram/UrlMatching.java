package JavaProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlMatching {
  @Test
  public void f() 
  
  {
	  
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    String url="https://opensource-demo.orangehrmlive.com/";
	    driver.get(url);
	    String ActURL=driver.getCurrentUrl();
	    Assert.assertEquals(url, ActURL);
	   
	    
	  
  }
  
}


