package JavaProgram;

import org.testng.annotations.DataProvider;

public class DataProvider_data

{
	@DataProvider(name = "Login")
	public Object[][] getDataforLogin() {
		// Multidimensional Object
		// 3X3 or 4X3 or 4X5
		return new Object[][] {

				{ "Admin", "admin123" }, { "Admin", "admin123" }, { "Admin", "admin123" } };

	}

	@DataProvider(name = "LoginScenario")
	public Object[][] getDataforLoginDifferentScenarios() {
		return new Object[][] { 
			
			     { "admin", "", "Password cannot be empty" },
				{ "", "admin123", "Username cannot be empty" },
				{ "AdminWrong", "admin123", "Invalid credentials" },
				
				{ "admin", "admin", "Invalid credentials" }, 
				{ "admin", "admin123", "Dashboard" } };

	}
}
