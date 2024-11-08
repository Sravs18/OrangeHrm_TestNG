package OrangeHRM.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EmployeeUtils 

{
	LoginPage lp;
	
	@BeforeTest
	public void EmployeeLogin()
	{
		lp=new LoginPage();
		lp.login("sravs7600", "Sravlu244!");
		
	}
	@AfterTest
	public void EmployeeLogout()
	{
		lp.logout();
	}
}
