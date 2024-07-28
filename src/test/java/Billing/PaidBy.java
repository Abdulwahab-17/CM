
package Billing;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import configuration.base;
import pageObject.DenialObject;
import pageObject.PaidByObject;
import pageObject.PaymentTypeObject;

public class PaidBy extends base {
	
    /////Just change the edit test data//////////////ok
	String Name;
	@Test(priority = 1)
	public void AddPaidBy() throws Exception {
//		Thread.sleep(8000);
		PaidByObject obj = PageFactory.initElements(driver,PaidByObject.class);
		Thread.sleep(5000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(8000);
//		obj.ClickBill();
//		Thread.sleep(3000);
		obj.ClickPaidBy();
		Thread.sleep(3000);
		obj.ClickAddNewPaidBy();
		Thread.sleep(3000);
		Name=data.currency().code();
		obj.AddName(Name);
		obj.AddDescription("1111");
		obj.Addcomments("Testing");
		Thread.sleep(2000);
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterPaidBy() throws Exception {
		Thread.sleep(3000);
		PaidByObject obj = PageFactory.initElements(driver,PaidByObject.class);
//		Thread.sleep(5000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(8000);
//		obj.ClickBill();
//		Thread.sleep(3000);
//		obj.ClickPaidBy();
		Thread.sleep(3000);
		obj.FilterName(Name);
		obj.FilterDescription("1111");
		obj.FilterComments("Testing");
		obj.ClickFilter();
	}
	
	@Test(priority = 3)
	public void EditPaidBy() throws Exception {
		Thread.sleep(8000);
		PaidByObject obj = PageFactory.initElements(driver,PaidByObject.class);
		Thread.sleep(2000);
		obj.ClickEdit();
		obj.ClearName();
		///Just Change the name here 
		obj.EditName(data.currency().code());
		obj.ClearDescription();
		obj.EditDescription("8888");
		obj.ClearComments();
		obj.Editcomments("Test");
		obj.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	

}
