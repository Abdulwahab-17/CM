package Patient;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.InsuranceAttorneyObject;
import pageObject.InsuranceSubInsuranceObject;

public class InsuranceSubInsurance extends base{
	///Having issues just run properly in Debug mode
	@Test(priority = 1)
	public void AddPatientInsurance() throws Exception {
		//Run then commented lines if you want to run alone AddInsurance test case 
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Insurance")).click(); 
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("(//li[@class='nav-item']//a)[2]")).click();  
		
		Thread.sleep(2000);
		InsuranceSubInsuranceObject obj = PageFactory.initElements(driver,		InsuranceSubInsuranceObject .class);
		Thread.sleep(2000);
		obj.ClickPrimary();
		Thread.sleep(3000);
		obj.ClickPrivateInsurance();
	    Thread.sleep(3000);
		obj.ClickSelf();
	    Thread.sleep(3000);
	    obj.ClickGenderMale();
	    obj.AddInsuranceName("Deline Media");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///////////////////Write Worker Compensation code here/////////////////////////////////////////////////

		
		//////////////////////Secondary Insurance///////////////////////////////////
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//h6[text()=' Secondary Insurance Information']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
		obj.ClickPlanName();
    	Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
    	act.sendKeys(Keys.ENTER).perform();
    	/////////////////////////////Policy Holder Information/////////////////////////////////////////////////
    	obj.AddPolicyHolderFirstName("Atiq");
    	obj.AddPolicyHolderMiddleName("Raza");
    	obj.AddPolicyHolderLastName("Deline");
    	obj.AddPolicyHolderClaimN0("32324343");
    	obj.AddPolicyHolderPolicyN0("1234");
    	obj.AddPolicyHolderWCBN0("d123456");
    	///////////////////////////Adjuster Information//////////////////////////////////////////////////////
    	obj.ClickAdjusterList();
    	Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
    	act.sendKeys(Keys.ENTER).perform();
    	
    	obj.ClickSecondryInsuranceNO();
    	Thread.sleep(3000);
    	obj.ClickSaveContinue();
    	Thread.sleep(3000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success"); 
	
	}

}
