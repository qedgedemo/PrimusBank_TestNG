package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import primusbank.library.PrimusBankHomePage;
import utils.Apputils;

public class AdminLoginTest extends Apputils
{

	@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		
		PrimusBankHomePage phome=new PrimusBankHomePage();
		boolean res=phome.adminLogin(uid, pwd);
		Assert.assertTrue(res);
		phome.adminLogout();
		
	}
	
	
	
}
