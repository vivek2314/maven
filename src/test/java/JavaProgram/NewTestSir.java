package JavaProgram;

import org.testng.annotations.Test;

public class NewTestSir {
  @Test
  public void f() 
  {
	  
	  /**
	     * @param args
	     * @throws InterruptedException
	     * @throws IOException 
	     */
	    public static void main(String[] args) throws InterruptedException, IOException {
	        // TODO Auto-generated method stub

	 

	        //System.setProperty("webdriver.chrome.driver", "F:\\Selenium Resources\\chromedriver_win32\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	                
	        driver.manage().window().maximize();    
	                    
	        //Click
	        /*
	        driver.get("https://demoqa.com/buttons");
	        //driver.findElement(By.id("Uvi85")).click();
	        String str=driver.findElement(By.xpath("//button[text()='Click Me']")).getAttribute("id");
	        //driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	        System.out.println(str);
	        driver.findElement(By.id(str)).click();
	        */
	                
	        //Double Click
	        /*        
	        driver.get("https://demoqa.com/buttons");
	        WebElement element=driver.findElement(By.id("doubleClickBtn"));
	        
	        Actions act = new Actions(driver);
	        act.moveToElement(element).doubleClick().build().perform();
	        //act.doubleClick(element).build().perform();
	        */
	        
	        //Right Click
	        /*
	        driver.get("https://demoqa.com/buttons");
	        WebElement element=driver.findElement(By.id("rightClickBtn"));
	        
	        Actions act = new Actions(driver);
	        //act.moveToElement(element).contextClick().build().perform();
	        act.contextClick(element).build().perform();
	        */
	        
	        //MouseHover
	        /*
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        WebElement element = driver.findElement(By.id("mousehover"));
	        
	        JavascriptExecutor js= (JavascriptExecutor)driver;
	        js.executeScript("window.scroll(0,1300)");
	        
	        Actions act = new Actions(driver);
	        
	        act.moveToElement(element).build().perform();
	        */
	        
	        //dragAndDrop
	        /*
	        driver.get("https://jqueryui.com/droppable/");

	 

	        WebElement frm = driver.findElement(By.className("demo-frame"));    
	        driver.switchTo().frame(frm);
	        
	        WebElement elem1= driver.findElement(By.id("draggable"));
	        WebElement elem2= driver.findElement(By.id("droppable"));
	                
	        Actions act = new Actions(driver);
	        act.dragAndDrop(elem1, elem2).build().perform();
	        */
	        
	        //Keyboard inputs
	        /*
	        driver.get("https://the-internet.herokuapp.com/key_presses");
	        
	        Actions a = new Actions(driver);
	        a.sendKeys(Keys.ESCAPE).build().perform();
	        */
	        
	        //Page Scrolling
	        /*        
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scroll(0,800)");
	        Thread.sleep(3000);
	        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
	        */
	        
	        //Screenshots
	        /*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src, new File("F:\\screenshot\\Appscreenshot.png"));
	        */
	        
	        
	        /*
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        WebElement ele = driver.findElement(By.id("dropdown-class-example")); 
	        
	        Select slct = new Select (ele);
	        
	        slct.selectByVisibleText("Option2");
	        //slct.selectByIndex(2);
	        //slct.selectByValue("option3");
	        */
	        
	        /*
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.findElement(By.id("txtUsername")).sendKeys("abcd");
	        Thread.sleep(3000);
	        driver.findElement(By.id("txtUsername")).clear();
	        */
	        
	                
	            
	            
	        
	        
	        
	    }

	 

	
	 
  }
  
}
