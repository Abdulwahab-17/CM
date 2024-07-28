package Billing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.BillingEmploymentTypeObject;
import pageObject.BillingTitleObject;

public class BillingEmploymentType extends base{
	
    /////No need to change because can add same Billing Title again//////////////Ok
	String Name;
	@Test(priority = 1)
	public void AddBillingEmploymentType() throws Exception {
//		Thread.sleep(8000);
		BillingEmploymentTypeObject obj = PageFactory.initElements(driver,BillingEmploymentTypeObject.class);
//		Thread.sleep(5000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(8000);
//		obj.ClickBill();
		Thread.sleep(5000);
		obj.ClickBillingEmploymentType();
		Thread.sleep(3000);
		obj.ClickAddNewBillingEmploymentType();
		Thread.sleep(3000);
		Name=data.currency().code();
		obj.AddName(Name);
		obj.Addcomments("Testing");
		Thread.sleep(2000);
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
	}
	
	@Test(priority = 2)
	public void FilterBillingEmploymentType() throws Exception {
		Thread.sleep(2000);
		BillingEmploymentTypeObject obj = PageFactory.initElements(driver,BillingEmploymentTypeObject.class);
//		Thread.sleep(2000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(4000);
//		obj.ClickBill();
//		Thread.sleep(3000);
//		obj.ClickBillingEmploymentType();
		Thread.sleep(3000);
		obj.FilterName(Name);
		obj.ClickFilter();
	}
	
	@Test(priority = 3)
	public void EditBillingEmploymentType() throws Exception {
		Thread.sleep(8000);
		BillingEmploymentTypeObject obj = PageFactory.initElements(driver,BillingEmploymentTypeObject.class);
		Thread.sleep(2000);
		obj.ClickEdit();
		obj.ClearName();
		obj.EditName(data.currency().code());
		obj.ClearComments();
		obj.Editcomments("Tested");
		obj.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
	
	}

}
