package OrangeHRM.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.library.EmployeeUtils;
import OrangeHRM.library.LoginPage;

public class EmployeeLoginTest extends EmployeeUtils

{
//	@Parameters({"uname","pwd"})
	@Test
	public void chkEmployeeLogin() 
	{
		
		LoginPage lp=new LoginPage();
		
		
		boolean res=	lp.isDashBoardModuleDisplayed();
		
		if(res)
		{
			System.out.println("employee login test pass");
		}
		else
		{
			System.out.println("employee login test fail");
		}
	//lp.logout();
	}
	
}
