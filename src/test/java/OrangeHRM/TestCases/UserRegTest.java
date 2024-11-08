package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.library.AdminUtils;
import OrangeHRM.library.User;

public class UserRegTest extends AdminUtils

{
	@Parameters({"ename","uname","pwd"})
	@Test
	public void chkUserReg(String ename,String uname,String pwd) throws InterruptedException
	{
		User usr=new User();
		boolean res=usr.addUser(ename,uname,pwd);
		Assert.assertTrue(res);	
		
		
	}
	
}
