package JavaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property {
  @Test
  public void f() throws IOException 
  
  
  {
	  
	  
		     
File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\JavaTraining\\src\\test\\java\\JavaProgram\\orangehrm.properties");
	     
	 FileInputStream fInput= new FileInputStream(file);
	     
	  Properties prop = new Properties();
	     
	    prop.load(fInput);
	     
	  System.out.println(prop.getProperty("objUsername"));
	  

	  
	  
  }
}
