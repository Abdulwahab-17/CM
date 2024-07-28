package BillingInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.PlanNameObject;

public class PlanName extends base{
	String PlanName;
	////////////Every time add unique Plan Name and change in filter test case. because we can not edit Plan Name we can just edit comment
	@Test(priority = 1)
	public void AddPlanName() throws Exception {
		Thread.sleep(8000);
		PlanNameObject obj = PageFactory.initElements(driver,PlanNameObject.class);
		Thread.sleep(5000);
		obj.ClickMaster();
		Thread.sleep(4000);
		obj.ClickBilling();
		Thread.sleep(6000);
    	obj.ClickPlanName();
		Thread.sleep(3000);
		obj.ClickAddNew();
		Thread.sleep(3000);
		///////add name here
		PlanName=data.currency().code();
		obj.AddName(PlanName);
		obj.AddComments("Testing");
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
	}
	
	@Test(priority = 2)
	public void FilterPlanName() throws Exception {
		PlanNameObject obj = PageFactory.initElements(driver,PlanNameObject.class);
		Thread.sleep(3000);
		//////////Change the search name here
		obj.FilterName(PlanName);
		obj.FilterComments("Testing");
		obj.ClickFilter();	
	}

	@Test(priority = 3)
	public void EditPlanName() throws Exception {
		Thread.sleep(8000);
		PlanNameObject obj = PageFactory.initElements(driver,PlanNameObject.class);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[1]")).click();
		obj.AddComments("Verified");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		Assert.assertEquals(Result, "Success");
	}
}
