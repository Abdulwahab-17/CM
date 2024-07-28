package BillingCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.CodeTypeObject;

public class CodeType extends base {
	String Name;
    ////////////Just update the unique data of edit test case
	@Test(priority = 1)
	public void AddCodeType() throws Exception {
//		Thread.sleep(8000);
		CodeTypeObject cd = PageFactory.initElements(driver, CodeTypeObject.class);
//		Thread.sleep(5000);
//		cd.ClickMaster();
//		Thread.sleep(4000);
//		cd.ClickBilling();
//		Thread.sleep(10000);
//		cd.ClickCodes();
		Thread.sleep(3000);
		cd.ClickCodeType();
		Thread.sleep(3000);
		cd.ClickAddNewCodeType();
		Thread.sleep(2000);
		Name=data.currency().code();
		cd.AddName(Name);
    	cd.AddDescription("1234");
    	//cd.AddSlug("Slug");
    	cd.Addcomments("Code Type testing");
		Thread.sleep(2000);
		cd.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterCodeType() throws Exception {
		Thread.sleep(3000);
		CodeTypeObject cd = PageFactory.initElements(driver, CodeTypeObject.class);
		cd.FilterCode(Name);
		cd.FilterDescription("1234");
		cd.FilterComments("Code Type testing");
		cd.ClickFilter();	
		
	}
	
	@Test (priority = 3)
	public void EditCodeType() throws Exception {
		Thread.sleep(8000);
		CodeTypeObject cd = PageFactory.initElements(driver, CodeTypeObject.class);
		Thread.sleep(2000);
		cd.ClickEdit();
		cd.ClearName();
		////Change the name here
		cd.EditName(data.currency().code());
		cd.ClearDescription();
		cd.EditDescription("Deline");
		//cd.ClearSlug();
		//cd.EditSlug("Edit Slug");
		cd.ClearComments();
		cd.Editcomments("Tested");
		cd.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
	}

}
