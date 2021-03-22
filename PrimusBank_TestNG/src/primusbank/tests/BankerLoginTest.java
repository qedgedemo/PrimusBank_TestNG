package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import primusbank.library.PrimusBankHomePage;
import utils.Apputils;

public class BankerLoginTest extends Apputils
{

	@Parameters({"branchname","uid","pwd"})
	@Test
	public void checkBankerLogin(String brname,String uid,String pwd)
	{
		PrimusBankHomePage phome=new PrimusBankHomePage();
		boolean res=phome.bankerLogin(brname, uid, pwd);
		Assert.assertTrue(res);
		phome.bankerLogout();
	}
	
	
}
