package BillingCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.CPTCodesObject;
import pageObject.HCPCSObject;
import pageObject.ICD10CodesObject;

public class HCPCS extends base {
	String Name;
	//////////////No need to change because we can add same HCPCS again////////////////
	@Test(priority = 1)
	public void AddHCPCS() throws Exception {
//		Thread.sleep(8000);
		HCPCSObject hcpcs = PageFactory.initElements(driver, HCPCSObject.class);
//		Thread.sleep(5000);
//		hcpcs.ClickMaster();
//		Thread.sleep(4000);
//		hcpcs.ClickBilling();
//		Thread.sleep(10000);
//		hcpcs.ClickCodes();
		Thread.sleep(3000);
		hcpcs.ClickHCPCS();
		Thread.sleep(3000);
		hcpcs.ClickAddNewHCPCS();
		Thread.sleep(3000);
		Name=data.currency().code();
		hcpcs.AddCodeName(Name);
		hcpcs.AddDescription("Atiq");
		hcpcs.Addcomments("Testing");
		Thread.sleep(2000);
		hcpcs.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	
	@Test(priority = 2)
	public void FilterHCPCS() throws Exception {
		Thread.sleep(3000);
		HCPCSObject hcpcs = PageFactory.initElements(driver, HCPCSObject.class);
		hcpcs.FilterCodeName(Name);
		hcpcs.FilterDescription("Atiq");
		hcpcs.FilterComments("Testing");
		hcpcs.ClickFilter();
		
	}
	
	@Test(priority = 3)
	public void EditHCPCS() throws Exception {
		Thread.sleep(8000);
		HCPCSObject hcpcs = PageFactory.initElements(driver, HCPCSObject.class);
		Thread.sleep(2000);
		hcpcs.ClickEdit();
		hcpcs.ClearCodeName();
		hcpcs.EditCodeName(data.currency().code());
		hcpcs.ClearDescription();
		hcpcs.EditDescription("Deline");
		hcpcs.ClearComments();
		hcpcs.Editcomments("Verified");
		hcpcs.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
