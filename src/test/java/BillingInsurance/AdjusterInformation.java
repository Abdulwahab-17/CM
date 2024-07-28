package BillingInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.AdjusterInformationObject;


public class AdjusterInformation extends base {
	String state;
	String InsuranceName;
	String Name;
	/////////No need to change because can add same adjuster
	@Test(priority = 1)
	public void AddAdjuster() throws Exception {
		Thread.sleep(18000);
		AdjusterInformationObject obj = PageFactory.initElements(driver,AdjusterInformationObject.class);
		Thread.sleep(8000);
		obj.ClickMaster();
		Thread.sleep(3000);
		obj.ClickBilling();
		Thread.sleep(6000);
    	obj.ClickAdjusterInformation();
		Thread.sleep(3000);
		obj.ClickAddNew();
		Thread.sleep(3000);
		obj.ClickInsuranceList();
		Thread.sleep(2000);
		InsuranceName=obj.ClickChooseInsurance();
		Name=data.currency().code();
		obj.AddFirstName(Name);
		obj.AddMiddleName("Word");
		obj.AddLastName("Habib");
		obj.AddStreetAddress("Phase6");
		obj.AddSuite("4th");
		obj.AddCity("Lahore");
		obj.ClickState();
		Thread.sleep(2000);
		state=obj.ClickChooseState();
		obj.AddZip("54000");
		obj.AddPhone("3217893366");
		obj.AddExtension("3215637788");
		obj.AddCell("3014568899");
		obj.AddFax("3234567890");
		obj.AddEmail("atiq.r@ovada.com");
		obj.AddPersonComments("Testing");
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
	}
	
	@Test(priority = 2)
	public void FilterAdjuster() throws Exception {
		Thread.sleep(5000);
		AdjusterInformationObject obj = PageFactory.initElements(driver,AdjusterInformationObject.class);
		Thread.sleep(5000);
//		obj.ClickMaster();
//		Thread.sleep(4000);
//		obj.ClickBilling();
//		Thread.sleep(6000);
//    	obj.ClickAdjusterInformation();
//		Thread.sleep(3000);
		//////////Try to get from list index value can be change or add from Cms
		obj.FilterInsuranceName(InsuranceName);
		obj.FilterAdjusterName(Name+" Word Habib");
		obj.FilterPhoneNo("321-789-3366");
		obj.FilterFax("323-456-7890");
		obj.FilterEmail("atiq.r@ovada.com");
		obj.Filter();	
		
	}
	
	@Test(priority = 3)
	public void EditAdjuster() throws Exception {
		Thread.sleep(8000);
		AdjusterInformationObject obj = PageFactory.initElements(driver,AdjusterInformationObject.class);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='edit-hov mx-1']//i[1]")).click();
		obj.ClickEditIcon();
		Thread.sleep(2000);
		obj.ClickEditChooseInsuranceList();
		obj.ClearFirstName();
		obj.AddFirstName(data.currency().code());
		obj.ClearMiddleName();
		obj.AddMiddleName("Automation");
		obj.ClearLastName();
		obj.AddLastName("Last");
		obj.ClearStreetAddress();
		obj.AddStreetAddress("New");
		obj.ClearSuite();
		obj.AddSuite("5th");
		obj.ClearCity();
		obj.AddCity("New");
		obj.ClickState();
		obj.ClickEditChooseState();
		obj.ClearZip();
		obj.AddZip("52000");
		obj.ClearPhone();
		obj.AddPhone("3217893300");
		obj.ClearExtension();
		obj.AddExtension("3215637668");
		obj.ClearCell();
		obj.AddCell("3215637668");
		obj.ClearFax();
		obj.AddFax("3234567880");
		obj.ClearEmail();
		obj.AddEmail("Ali.r@ovada.com");
		obj.ClearComments();
		obj.AddPersonComments("Testing");
		obj.Update();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
		
		
		//driver.findElement(By.xpath("//button[@class='edit-hov mx-1']//i[1]")).click();
		//driver.findElement(By.xpath("(//div[@class='ng-select-container ng-has-value']//span)[5]")).click();

		
//		driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys("Ali");
//		driver.findElement(By.xpath("//input[@formcontrolname='middle_name']")).sendKeys("Automation");
//		driver.findElement(By.xpath("//input[@formcontrolname='last_name']")).sendKeys("Last");
//		driver.findElement(By.xpath("//input[@formcontrolname='street_address']")).sendKeys("New");
//		driver.findElement(By.xpath("//input[@formcontrolname='apartment_suite']")).sendKeys("5th");
//		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("New");
//		driver.findElement(By.xpath("html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-adjuster-information-modal-component[1]/div[1]/div[2]/form[1]/div[2]/div[7]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		driver.findElement(By.xpath("//span[text()='Missouri']")).click();
		
		
		
//    	driver.findElement(By.xpath("//input[@formcontrolname='zip']")).sendKeys("0");
//    	////Clearing the phone no
//		driver.findElement(By.xpath("(//input[@formcontrolname='phone_no'])[2]")).clear();
//		driver.findElement(By.xpath("(//input[@formcontrolname='phone_no'])[2]")).sendKeys("3217893300");
//	    ////Clearing the extension
//		driver.findElement(By.xpath("//input[@formcontrolname='ext']")).clear();
//		driver.findElement(By.xpath("//input[@formcontrolname='ext']")).sendKeys("3215637668");
//		////Clearing the cell no
//		driver.findElement(By.xpath("//input[@formcontrolname='cell_no']")).clear();
//		driver.findElement(By.xpath("//input[@formcontrolname='cell_no']")).sendKeys("3014568009");
//		////Clearing the fax
//		driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).clear();
//		driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).sendKeys("3234567880");
//		///Clearing the email
//		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).clear();
//		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).sendKeys("Ali.r@ovada.com");
//		driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("Testing");
//		driver.findElement(By.xpath("//button[text()='Update']")).click();
//		Thread.sleep(4000);
//		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
//		System.out.println("here is result:"+Result);
//		Assert.assertEquals(Result, "Success");
	}

}
