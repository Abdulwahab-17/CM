package BillingCodes;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
//import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;
import pageObject.ICD10CodesObject;

public class ICD10Codes extends base {
	
	String Name;
    ////////////Just update the unique data of edit test case 
	@Test(priority = 1)
	public void AddICDCode() throws Exception {
		Thread.sleep(8000);
		ICD10CodesObject code = PageFactory.initElements(driver, ICD10CodesObject.class);
		Thread.sleep(5000);
		code.ClickMaster();
		Thread.sleep(4000);
		code.ClickBilling();
		Thread.sleep(15000);
		code.ClickCodes();
		Thread.sleep(5000);
		code.ClickAddNewICD();
		Thread.sleep(5000);
		Name=data.currency().code();
		code.AddCodeName(Name);
		code.AddDescription("Deline");
		code.Addcomments("Testing");
		Thread.sleep(2000);
		code.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterICD() throws Exception {
		Thread.sleep(3000);
		ICD10CodesObject code = PageFactory.initElements(driver, ICD10CodesObject.class);
		code.FilterCodeName(Name);
		code.FilterDescription("Deline");
		code.FilterComments("Testing");
		code.ClickFilter();
	}
	
	@Test(priority = 3)
	public void EditICD() throws Exception {
		Thread.sleep(8000);
		ICD10CodesObject code = PageFactory.initElements(driver, ICD10CodesObject.class);
		Thread.sleep(2000);
		code.ClickEdit();
		code.ClearCodeName();
		////Change the name here
		code.EditCodeName(data.currency().code());
		code.ClearDescription();
		code.EditDescription("2222");
		code.ClearComments();
		code.Editcomments("333");
		code.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
