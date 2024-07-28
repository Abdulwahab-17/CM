package Billing;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import configuration.base;
import pageObject.PaidByObject;
import pageObject.PlaceOfServiceObject;

public class PlaceOfService extends base {
	
    /////Just change the edit test data//////////////
	String Name;
	@Test(priority = 1)
	public void AddPlaceOfService() throws Exception {
//		Thread.sleep(8000);
		PlaceOfServiceObject obj = PageFactory.initElements(driver,PlaceOfServiceObject.class);
		Thread.sleep(5000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(8000);
//		obj.ClickBill();
//		Thread.sleep(3000);
		obj.ClickPlaceOfService();
		Thread.sleep(3000);
		obj.ClickAddNewPlaceOfService();
		Thread.sleep(3000);
		obj.AddCode("786");
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
	public void FilterPlaceOfService() throws Exception {
		Thread.sleep(3000);
		PlaceOfServiceObject obj = PageFactory.initElements(driver,PlaceOfServiceObject.class);
//		Thread.sleep(5000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(8000);
//		obj.ClickBill();
//		Thread.sleep(3000);
//		obj.ClickPlaceOfService();
		Thread.sleep(3000);
		obj.Filtercode("786");
		obj.FilterName(Name);
		obj.FilterDescription("1111");
		obj.FilterComments("Testing");
		obj.ClickFilter();
	}
	
	@Test(priority = 3)
	public void EditPlaceOfService() throws Exception {
		Thread.sleep(8000);
		PlaceOfServiceObject obj = PageFactory.initElements(driver,PlaceOfServiceObject.class);
		Thread.sleep(2000);
		obj.ClickEdit();
		obj.ClearCode();
		obj.EditCode("5555");
		obj.ClearName();
		////just change the name here
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
