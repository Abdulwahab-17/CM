package Billing;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.PaymentTypeObject;
import pageObject.VerificationTypeObject;

public class VerificationType extends base {
	
/////Just change the edit test data//////////////ok
	String Name;
	@Test(priority = 1)
	public void AddVerificationType() throws Exception {
//		Thread.sleep(8000);
		VerificationTypeObject bill = PageFactory.initElements(driver,VerificationTypeObject.class);
		Thread.sleep(5000);
//		bill.ClickMaster();
//		Thread.sleep(4000);
//		bill.ClickBilling();
//		Thread.sleep(8000);
//		bill.ClickBill();
//		Thread.sleep(3000);
		bill.ClickVerificationType();
		Thread.sleep(3000);
		bill.ClickAddNewVerificationType();
		Thread.sleep(3000);
	    Name=data.currency().code();
		bill.AddName(Name);
		bill.AddDescription("1111");
		bill.Addcomments("Testing");
		Thread.sleep(2000);
		bill.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterVerificationType() throws Exception {
		
		Thread.sleep(3000);
		VerificationTypeObject bill = PageFactory.initElements(driver,VerificationTypeObject.class);
//		Thread.sleep(5000);
//		bill.ClickMaster();
//		Thread.sleep(4000);
//		bill.ClickBilling();
//		Thread.sleep(8000);
//		bill.ClickBill();
//		Thread.sleep(3000);
//		bill.ClickVerificationType();
		Thread.sleep(3000);
		bill.FilterName(Name);
		bill.FilterDescription("1111");
		bill.FilterComments("Testing");
		bill.ClickFilter();
		
	}
	
	
	@Test(priority = 3)
	public void EditVerificationType() throws Exception {
		Thread.sleep(8000);
		VerificationTypeObject bill = PageFactory.initElements(driver,VerificationTypeObject.class);
		Thread.sleep(2000);
		bill.ClickEdit();
		bill.ClearName();
		///Just change the name here
		bill.EditName(data.currency().code());
		bill.ClearDescription();
		bill.EditDescription("2222");
		bill.ClearComments();
		bill.Editcomments("Tested");
		bill.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
