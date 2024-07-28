package BillingInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.PlanNameObject;
import pageObject.PlanTypeObject;

public class PlanType extends base{
	
    String PlanType;
    ////////////Every time add unique Plan Type and change in filter test case. because we can not edit Plan Type we can just edit comment
	@Test(priority = 1)
	public void AddPlanType() throws Exception {
		Thread.sleep(8000);
		PlanTypeObject obj = PageFactory.initElements(driver,PlanTypeObject.class);
		Thread.sleep(5000);
		obj.ClickMaster();
		Thread.sleep(4000);
		obj.ClickBilling();
		Thread.sleep(6000);
		obj.ClickPlanType();
		Thread.sleep(3000);
		obj.ClickAddNew();
		Thread.sleep(3000);
		PlanType=data.currency().code();
		/////Add name here
		obj.AddName(PlanType);
		obj.AddComments("Testing");
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterPlanType() throws Exception {
		Thread.sleep(2000);
		PlanTypeObject obj = PageFactory.initElements(driver,PlanTypeObject.class);
		//////////Change the search name here
		obj.FilterName(PlanType);
		obj.FilterComments("Testing");
		obj.ClickFilter();	
	}
	
	@Test(priority = 3)
	public void EditPlanType() throws Exception {
		Thread.sleep(8000);
		PlanTypeObject obj = PageFactory.initElements(driver,PlanTypeObject.class);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[1]")).click();
		obj.ClearComments();
		obj.AddComments("Verified");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		Assert.assertEquals(Result, "Success");
	}



}
