package OrangeHRM.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class User extends AppUtils
{

	public boolean addUser(String ename,String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		String role="ESS";
		Select cat=new Select(driver.findElement(By.id("systemUser_userType")));
		cat.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.className("addbutton")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("searchBtn")).click();
	
		WebElement usertable=driver.findElement(By.id("tableWrapper"));
		List<WebElement> rows=usertable.findElements(By.tagName("tr"));
		
		boolean result=false;
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(uname))
			{
				result= true;
				break;
				
			}
		}
			
		return result;
		
		
		
		
		
		
		
	}
	
}
