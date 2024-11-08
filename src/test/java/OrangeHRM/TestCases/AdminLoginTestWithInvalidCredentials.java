package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.library.LoginPage;
import Utils.AppUtils;

public class AdminLoginTestWithInvalidCredentials extends AppUtils

{
	@Parameters({"uid","pwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	
	
	{
		LoginPage lp=new LoginPage();
		lp.login(uid, pwd);
		boolean res=lp.isErrMsgDisplayed();
		Assert.assertTrue(res);
		
	}
	
	
	
}
