package primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class PrimusBankHomePage extends Apputils
{

	
	public boolean adminLogin(String uid,String pwd)
	{
		
		String expurl,acturl;
		expurl="adminflow";
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();
		if(acturl.toLowerCase().contains(expurl))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean adminLogout()
	{
		driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']")).click();
		if(driver.findElement(By.id("login")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	public boolean bankerLogin(String brname,String uid,String pwd)
	{
		String expurl,acturl;
		expurl="Bankers_flow";
		
		Select blist = new Select(driver.findElement(By.id("drlist")));
		blist.selectByVisibleText(brname);
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		
		acturl=driver.getCurrentUrl();
		if(acturl.toLowerCase().contains(expurl.toLowerCase()))
		{
			return true;
		}else
		{
			return false;
		}
				
	}
	
	public boolean bankerLogout()
	{
		driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']")).click();
		if(driver.findElement(By.id("login")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
