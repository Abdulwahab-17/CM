package BillingCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.FeeTypeObject;
import pageObject.HCPCSObject;

public class FeeType extends base {
	String Name;
    ////////////Just update the unique data of edit test case
	@Test(priority = 1)
	public void AddFeeType() throws Exception {
//		Thread.sleep(8000);
		FeeTypeObject fee = PageFactory.initElements(driver, FeeTypeObject.class);
//		Thread.sleep(5000);
//		fee.ClickMaster();
//		Thread.sleep(4000);
//		fee.ClickBilling();
//		Thread.sleep(10000);
//		fee.ClickCodes();
//		Thread.sleep(3000);
		fee.ClickFeeType();
		Thread.sleep(3000);
		fee.ClickAddNewFeeType();
		Thread.sleep(3000);
		Name=data.currency().code();
		fee.AddName(Name);
		fee.AddDescription("1234");
		fee.Addcomments("Fee testing");
		Thread.sleep(2000);
		fee.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterFeeType() throws Exception {
		Thread.sleep(3000);
		FeeTypeObject fee = PageFactory.initElements(driver, FeeTypeObject.class);
		fee.FilterName(Name);
		fee.FilterDescription("1234");
		fee.FilterComments("Fee testing");
		fee.ClickFilter();
		
	}

	@Test(priority = 3)
	public void EditFeeType() throws Exception {
		Thread.sleep(8000);
		FeeTypeObject fee = PageFactory.initElements(driver, FeeTypeObject.class);
		Thread.sleep(2000);
		fee.ClickEdit();
		fee.ClearFeeName();
		///Change Name here
		fee.EditFeeName(data.currency().code());
		fee.ClearDescription();
		fee.EditDescription("Media");
		fee.ClearComments();
		fee.Editcomments("Test");
		fee.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
}
