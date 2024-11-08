package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.library.LoginPage;
import Utils.AppUtils;

public class AdminLoginTestWithValidCredentials extends AppUtils


{

	@Parameters({"adminuid","adminpwd"})
	@Test
	public void CheckAdminLogin(String uid,String pwd)
	
	{
		LoginPage lp=new LoginPage();
		lp.login(uid, pwd);
		boolean res=lp.isAdminModuleDisplayed();		
		Assert.assertTrue(res);
		lp.logout();	
		
	}
	
	
	
	
	
}
