package BillingAttorney;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import configuration.base;
import pageObject.Homepage1;

public class AttorneyFirm extends base {
	
	String FirmName;
	String state;
	////////////Now we can not update firm name so we will have to add new firm name every time but when name will be updated then we can run same script then no need to change
	
	@Test(priority = 1)
	public void AddFirm() throws Exception {
		Thread.sleep(8000);
		Homepage1 attorney = PageFactory.initElements(driver, Homepage1.class);
		Thread.sleep(5000);
		attorney.ClickMaster();
		Thread.sleep(4000);
		attorney.ClickBilling();
		Thread.sleep(8000);
		attorney.ClickAttorney();
		Thread.sleep(10000);
		attorney.ClickAddNew();
		Thread.sleep(4000);
		////Change the firm name here
		FirmName=data.currency().code();
		attorney.AddFirmName(FirmName);
		attorney.ClickAddLocation();
		attorney.AddLocationName("Test Insurance");
		attorney.AddStreetAddress("Phase6");
		attorney.AddAppartment("4th");
		attorney.AddCity("Lahore");
		//////////////////////////////
		attorney.AddState();
		state=attorney.AddChooseState();
		attorney.AddZip("54000");
		attorney.AddPhone("3217802345");
		attorney.AddExtension("42000");
		attorney.AddCell("32117802334");
		attorney.AddFax("9234190000");
		attorney.AddEmail("atiq.r@ovada.com");
		attorney.AddFirstName("Atiq");
		attorney.AddMiddleName("Deline");
		attorney.AddLastName("Raza");
		attorney.AddPersonPhone("3217802336");
		attorney.AddPersonExtension("43000");
		attorney.AddPersonCell("32117802390");
		attorney.AddPersonFax("9234150000");
		attorney.AddPersonEmail("atiq.raza@ovada.com");
		attorney.AddComments("Automation Testing");
		attorney.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	    @Test(priority = 2)
	    public void FilterFirm() throws Exception {
	    	Thread.sleep(3000);
	    	Homepage1 attorney = PageFactory.initElements(driver, Homepage1.class);	
	    	Thread.sleep(3000);
	    	/////////Search same name here which you added
	    	attorney.SearchFirmName(FirmName);
	    	attorney.SearchLocationName("Test Insurance");
	    	attorney.SearchStreetName("Phase6");
	    	attorney.SearchCityName("Lahore");
	    	attorney.ClickMoreFields();
	    	attorney.SearchStateName(state);
	    	attorney.SearchZip("54000");
	    	attorney.SearchPhone("3217802345");
	    	attorney.SearchFax("9234190000");
	    	attorney.SearchEmail("atiq.r@ovada.com");
	    	attorney.ClickFilter();	
	    }
	    @Test(priority = 3)
	    public void EditFirm() throws Exception {
	    	Thread.sleep(8000);
	    	Homepage1 attorney = PageFactory.initElements(driver, Homepage1.class);
	    	Thread.sleep(2000);
	    	attorney.ClickEdit();
	    	//attorney.EditFirmName("New");
	    	//attorney.ClickUpdate();
	    	WebElement element = driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[2]"));
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[2]")).click();
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	
	    	driver.findElement(By.xpath("(//div[@class='form-group mb-1']//input)[1]")).clear();
	    	driver.findElement(By.xpath("(//div[@class='form-group mb-1']//input)[1]")).sendKeys("New Insurance");
	    	
	    	driver.findElement(By.xpath("(//input[@formcontrolname='street_address'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@formcontrolname='street_address'])[2]")).sendKeys("Phase5");
			
			driver.findElement(By.xpath("//input[@formcontrolname='apartment_suite']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='apartment_suite']")).sendKeys("4th");
			
			driver.findElement(By.xpath("(//input[@formcontrolname='city'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@formcontrolname='city'])[2]")).sendKeys("Lahore");
			
			//driver.findElement(By.xpath("(//div[@class='ng-select-container ng-has-value']//span)[5]")).click();
			//driver.findElement(By.xpath("//span[text()='Alaska']")).click();
			
			driver.findElement(By.xpath("(//input[@formcontrolname='zip'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@formcontrolname='zip'])[2]")).sendKeys("44000");
			
			driver.findElement(By.xpath("(//input[@formcontrolname='phone'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@formcontrolname='phone'])[2]")).sendKeys("3217802044");
			
			driver.findElement(By.xpath("//input[@formcontrolname='ext']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='ext']")).sendKeys("43000");
			
			driver.findElement(By.xpath("//input[@formcontrolname='cell']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='cell']")).sendKeys("32117802444");
			
			driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).sendKeys("9234190111");
			
			driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).sendKeys("raza.r@ovada.com");
			////////Contact Person Information///////////////////////////////////
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_first_name']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_first_name']")).sendKeys("Raza");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_middle_name']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_middle_name']")).sendKeys("Media");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_last_name']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_last_name']")).sendKeys("Atiq");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_phone']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_phone']")).sendKeys("3217802000");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_ext']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_ext']")).sendKeys("42000");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_cell']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_cell']")).sendKeys("32117802333");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_fax']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_fax']")).sendKeys("9234150011");
			
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_email']")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname='contact_person_email']")).sendKeys("atiq.atiq@ovada.com");
			
			driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).clear();
			driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("Testing");
			driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
			
			Thread.sleep(4000);
			String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
			System.out.println("here is result:"+Result);
			Assert.assertEquals(Result, "Success");
	    }
	
	
}
