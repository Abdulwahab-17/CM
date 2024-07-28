package Employer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.EmployerObject;

public class employer extends base {
	String Name;
	String state;
	////////////Just update the name in edit test case
	@Test(priority = 1)
	public void AddEmployer() throws Exception  {
		Thread.sleep(8000);
		EmployerObject employer = PageFactory.initElements(driver, EmployerObject.class);
		Thread.sleep(5000);
		employer.ClickMaster();
		Thread.sleep(4000);
		employer.ClickBilling();
		Thread.sleep(8000);
		employer.ClickEmployer();
		Thread.sleep(3000);
		employer.ClickAddNewEmployer();
		Thread.sleep(3000);
		Name=data.currency().code();
		employer.AddEmployerName(Name);
		employer.AddEmployerStreetAddress("Phase5");
		employer.AddEmployerSuite("3rd");
		employer.AddEmployerCity("Lahore");
		employer.ClickEmployerState();
		Thread.sleep(2000);
	    state=employer.ClickEmployerStateChoose();
		employer.AddEmployerZip("54000");
		employer.AddEmployerPhone("3217809911");
		employer.AddEmployerExtension("54000");
		employer.AddEmployerEmail("atiq.r@ovada.com");
		employer.AddEmployerFax("3017895643");
		/////////////////////////////////////Contact Person Information///////////////////////////////////////////////
		employer.AddEmployerFirstName("Awa");
		employer.AddEmployerMiddleName("Media");
		employer.AddEmployerLastName("Raza");
		employer.AddContactPersonPhone("3214567897");
		employer.AddContactPersonExtension("45678");
		employer.AddContactPersonEmail("atiq.raza@ovada.com");
		employer.AddContactPersonFax("3017895643");
		employer.ClickSubmit();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");

	}

	@Test(priority = 2)
	public void FilterEmployeer() throws Exception {
		Thread.sleep(3000);
		EmployerObject employer = PageFactory.initElements(driver, EmployerObject.class);
		Thread.sleep(2000);
		/////Change name here which you added
		employer.FilterEmployerName(Name);
		employer.FilterEmployerAddress("Phase5");
		employer.FilterEmployerCity("Lahore");
		employer.FilterEmployerState(state);
		employer.ClickPlusIcon();
		employer.FilterEmployerZip("54000");
		employer.FilterEmployerPhone("3217809911");
		employer.FilterEmployerExtension("54000");
		employer.FilterEmployerEmail("atiq.r@ovada.com");
		employer.FilterEmployerFax("3017895643");
		/////With club name not searching////////////////
		employer.FilterPersonName("Awa");
		employer.ClickFilter();
	}

	@Test(priority = 3)
	public void EditEmployer() throws Exception {
		Thread.sleep(8000);
		EmployerObject employer = PageFactory.initElements(driver, EmployerObject.class);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@tooltip='Edit']//i[1]")).click();
		Thread.sleep(3000);
		employer.ClearEmployerName();
		////Change the name here
		employer.AddEmployerName(data.currency().code());
		employer.ClearEmployerStreetAddress();
		employer.AddEmployerStreetAddress("Phase5");
		employer.ClearEmployerSuite();
		employer.AddEmployerSuite("3rd");
		employer.ClearEmployerCity();
		employer.AddEmployerCity("Lahore");
		employer.ClearEmployerZip();
		employer.AddEmployerZip("52000");
		employer.ClearEmployerPhone();
		employer.AddEmployerPhone("3217802211");
		employer.ClearEmployerExtension();
		employer.AddEmployerExtension("50000");
		employer.ClearEmployerEmail();
		employer.AddEmployerEmail("ali.r@ovada.com");
		employer.ClearEmployerFax();
		employer.AddEmployerFax("3017895000");
		/////////////////////////////////////Contact Person Information///////////////////////////////////////////////
		employer.ClearPersonFirstName();
		employer.AddEmployerFirstName("far");
		employer.ClearPersonMiddleName();
		employer.AddEmployerMiddleName("Deline");
		employer.ClearPersonLastName();
		employer.AddEmployerLastName("ha");
		employer.ClearPersonPhone();
		employer.AddContactPersonPhone("3214567786");
		employer.ClearPersonExtension();
		employer.AddContactPersonExtension("40000");
		employer.ClearPersonEmail();
		employer.AddContactPersonEmail("far.hab@ovada.com");
		employer.ClearPersonFax();
		employer.AddContactPersonFax("3017895000");
		employer.ClickSubmit();

		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");

	}

}
