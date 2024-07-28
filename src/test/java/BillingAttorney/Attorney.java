package BillingAttorney;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.AttorneyObject;
import pageObject.Homepage1;

public class Attorney extends base {
	String Firm;
	/////////////////////No need to change because can add same Attorney Again///////////////////////////////////////////
	@Test(priority = 1)
	public void AddAttorney() throws Exception
	{
		Thread.sleep(8000);
		AttorneyObject attorney = PageFactory.initElements(driver, AttorneyObject.class);
		Thread.sleep(3000);
		attorney.ClickMaster();
		Thread.sleep(4000);
		attorney.ClickBilling();
		Thread.sleep(8000);
		attorney.ClickAttorney();
		Thread.sleep(5000);
		attorney.ClickSubAttorney();
		Thread.sleep(8000);
		attorney.ClickAddNew();
		Thread.sleep(2000);
		attorney.ClickFirmList();
		Thread.sleep(4000);
		Firm=attorney.ClickChooseFirm();
		attorney.AddFirstName("Atiq");
		attorney.AddMiddleName("Deline");
		attorney.AddLastName("Raza");
		attorney.AddStreetAddress("Phase6");
		attorney.AddSuite("3rd");
		attorney.AddCity("Lahore");
		attorney.ClickState();
	    attorney.ClickChooseState();
		attorney.AddZip("54000");
		attorney.AddPhone("3217802345");
		attorney.AddExtension("42000");
		attorney.AddCell("32117802334");
		attorney.AddFax("9234190000");
		attorney.AddEmail("atiq.r@ovada.com");
		attorney.AddPersonFirstName("Atiq");
		attorney.AddPersonMiddleName("Deline");
		attorney.AddPersonLastName("Raza");
		attorney.AddPersonPhone("3217802336");
		attorney.AddPersonExtension("43000");
		attorney.AddPersonCell("32117802390");
		attorney.AddPersonFax("9234150000");
		attorney.AddPersonEmail("atiq.raza@ovada.com");
		attorney.AddPersonComments("Automation Testing");
		attorney.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

	@Test(priority = 2)
	public void FilterAttorney() throws Exception {

		Thread.sleep(3000);
		AttorneyObject attorney = PageFactory.initElements(driver, AttorneyObject.class);
//		Thread.sleep(2000);
//		
//		attorney.ClickMaster();
//		Thread.sleep(4000);
//		attorney.ClickBilling();
//		Thread.sleep(3000);
//		attorney.ClickAttorney();
//		Thread.sleep(4000);
//		attorney.ClickSubAttorney();
		Thread.sleep(3000);
		attorney.FilterFirmName(Firm);
		attorney.FilterAttorneyName("Atiq Deline Raza");
		attorney.FilterPhoneNo("3217802345");
		attorney.FilterEmail("atiq.r@ovada.com");
		attorney.FilterFax("9234190000");
		attorney.ClickFilter();

	}

	@Test (priority = 3)
	public void EditAttorney() throws Exception {
		Thread.sleep(8000);
		AttorneyObject attorney = PageFactory.initElements(driver, AttorneyObject.class);
		Thread.sleep(2000);
		attorney.ClickEditIcon();
		Thread.sleep(3000);
		attorney.ClickEditFirmList();
		Thread.sleep(1000);
		attorney.ClickEditChooseFirm();
		attorney.ClearFirstName();
		attorney.AddFirstName("Raza");
		attorney.ClearMiddleName();
		attorney.AddMiddleName("Media");
		attorney.ClearLastName();
		attorney.AddLastName("Atiq");
		attorney.ClearStreetAddress();
		attorney.AddStreetAddress("phase5");
        attorney.ClearSuite();
        attorney.AddSuite("2nd");
        attorney.ClearCity();
        attorney.AddCity("Sargodha");
        attorney.ClickState();
        attorney.ClickChooseState();
        attorney.ClearZip();
        attorney.AddZip("52000");
        attorney.ClearPhone();
        attorney.AddPhone("3217802300");
        attorney.ClearExtension();
        attorney.AddExtension("40000");
        attorney.ClearCell();
        attorney.AddCell("32117802334");
        attorney.ClearFax();
        attorney.AddFax("9234190011");
        attorney.ClearEmail();
        attorney.AddEmail("atiq.raza@ovada.com");
        attorney.ClearPersonFirstName();
        attorney.AddPersonFirstName("Raza");
        attorney.ClearPersonMiddleName();
        attorney.AddPersonMiddleName("Media");
        attorney.ClearPersonLastName();
        attorney.AddPersonLastName("Atiq");
        attorney.ClearPersonPhone();
        attorney.AddPersonPhone("3217802300");
        attorney.ClearPersonExtension();
        attorney.AddPersonExtension("41000");
        attorney.ClearPersonCell();
        attorney.AddPersonCell("32117802222");
        attorney.ClearPersonFax();
        attorney.AddPersonFax("9234150011");
        attorney.ClearPersonEmail();
        attorney.AddPersonEmail("atiq.ra@ovada.com");
        attorney.ClearComments();
        attorney.AddPersonComments("Tested");
        attorney.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
}
