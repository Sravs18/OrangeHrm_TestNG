package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.library.AdminUtils;
import OrangeHRM.library.Employee;

public class EmployeeRegTest extends AdminUtils
{
	
	@Parameters({"fname","lname"})
	@Test
	public void checkempReg(String fname,String lname)
	
	{
		Employee emp=new Employee();
		boolean res=emp.addEmployee(fname,lname);
		Assert.assertTrue(res);
		
		
	}
	
	
	
	
	
}
