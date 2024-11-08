package OrangeHRM.library;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class LoginPage extends AppUtils


{
	
	public void login(String uid,String pwd)
	{
	
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
	}

	public boolean isAdminModuleDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
			
		}
	}
	public boolean isDashBoardModuleDisplayed()
	{
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			return true;
		}else
		{
			return false;
			
		}
	}

	public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean isErrMsgDisplayed()
	{
		String errmsg=driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		if(errmsg.contains("invalid")||errmsg.contains("empty"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	}
