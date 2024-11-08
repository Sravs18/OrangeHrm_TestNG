package OrangeHRM.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminUtils 
{
	LoginPage lp;
	
	@BeforeTest
	public void adminLogin()
	{
		lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
	}
	
	
	@AfterTest
	public void adminLogout()
	
	{
		lp.logout();
		
	}
	
	
	
}
