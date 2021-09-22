package JavaProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPriority {
  @Test(priority=3)

  public void testMethod1() {
      System.out.println("test method 1 running...");
  }
  
  @Test(priority=1)
  public void testMethod2() {
      System.out.println("test method 2 running...");
  }
  
  @Test(priority=2)
  public void testMethod3() {
      System.out.println("test method 3 running...");
  }  
  
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("beforeMethod running...");
  }

 

  @AfterMethod
  public void afterMethod() {
      System.out.println("afterMethod running...");
  }

 

  @BeforeClass
  public void beforeClass() {
      System.out.println("beforeClass running...");
  }

 

  @AfterClass
  public void afterClass() {
      System.out.println("afterClass running...");
  }

 

  @BeforeTest
  public void beforeTest() {
      System.out.println("beforeTest running...");
  }

 

  @AfterTest
  public void afterTest() {
      System.out.println("afterTest running...");
  }

 

  @BeforeSuite
  public void beforeSuite() {
      System.out.println("beforeSuite running...");
  }

 

  @AfterSuite
  public void afterSuite() {
      System.out.println("afterSuite running...");
  }

  
}
