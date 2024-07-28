package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.HospitalObject;
import pageObject.PracticeObject;

public class Hospital extends base {
	///No need to change because we can add same hospital again
	//	String storeAddress="";
	@Test(priority = 1)
	public void AddHospital() throws Exception {
		Thread.sleep(13000);
		HospitalObject obj = PageFactory.initElements(driver,HospitalObject.class);
		Thread.sleep(5000);
		obj.ClickMaster();
		Thread.sleep(4000);
		obj.ClickPractice();
		Thread.sleep(3000);
		obj.ClickHospital();
		Thread.sleep(5000);
		obj.ClickAddNewHospital();
		obj.AddHospitalName("eo");
		obj.AddStreetAddress("34");
		obj.AddSuite("3rd");
		//		Thread.sleep(5000);
		//		Actions act = new Actions(driver);
		//		act.sendKeys(Keys.DOWN).perform();
		//		act.sendKeys(Keys.ENTER).perform();
		//		Thread.sleep(3000);
		//		storeAddress=driver.findElement(By.xpath("//label[text()='Street Address']/following::input")).getText();
		//		System.out.println("here is result"+storeAddress);
		obj.AddCity("Test");  
		obj.ClickStateList();
		obj.ClickChooseState();
		obj.AddZip("53000");
		obj.AddPhone("3214534231");
		obj.AddExtension("3426776564");
		obj.AddFax("3012345654");
		obj.AddEmail("atiq.r@ovada.com");
		obj.ClickDepatmentList();
		obj.ClickChooseDepartment();//////////////at this time department is not added
		//driver.findElement(By.xpath("//label[text()='Department']")).click();
		obj.ClickDepartmentHeading();
		/////////////////Contact Person Information//////////////////////////////////
		obj.AddFirstName("Atiq");
		obj.AddMiddleName("Deline");
		obj.AddLastName("Ra");
		obj.AddPersonPhone("3214455666");
		obj.AddPersonExtension("3239988777");
		obj.AddPersonCell("3012277555");
		obj.AddPersonFax("3426543245");
		obj.AddPersonEmail("test.e@ovada.com");
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");	

	}

	@Test(priority = 2)
	public void FilterHospital() throws Exception {
		Thread.sleep(3000);
		HospitalObject obj = PageFactory.initElements(driver,HospitalObject.class);
		Thread.sleep(5000);
		obj.FilterHospitalName("eo");
		obj.FilterPhone("3214534231");
		obj.FilterAddress("34,Test");
		obj.FilterEmail("atiq.r@ovada.com");
		obj.ClickPlusIcon();
		obj.FilterFax("3012345654");
		////For now Contact person name is not showing after adding ////////////////////////
		// obj.FilterContactPersonName("Test");
		obj.ClickFilter(); 	
	}

	@Test(priority = 3)
	public void EditHospital() throws Exception {
		Thread.sleep(5000);
		HospitalObject obj = PageFactory.initElements(driver,HospitalObject.class);
		Thread.sleep(3000);
		obj.ClickEdit();
		//driver.findElement(By.xpath("//a[@class='edit-hov mx-1']//i")).click();
		obj.ClearStreetAddress();
		obj.AddStreetAddress("56");
		obj.ClearSuite();
		obj.AddSuite("2nd");
		//		Thread.sleep(5000);
		//		Actions act = new Actions(driver);
		//		act.sendKeys(Keys.DOWN).perform();
		//		act.sendKeys(Keys.ENTER).perform();
		//		Thread.sleep(3000);
		//		storeAddress=driver.findElement(By.xpath("//label[text()='Street Address']/following::input")).getText();
		//		System.out.println("here is result"+storeAddress);
		obj.ClearCity();
		obj.AddCity("Abc");  

		//		obj.ClickStateList();
		//		obj.ClickChooseState();

		obj.ClearZip();
		obj.AddZip("44000");
		obj.ClearPhone();
		obj.AddPhone("3214534000");
		obj.ClearExtension();
		obj.AddExtension("3426776111");
		obj.ClearFax();
		obj.AddFax("3012345222");
		obj.ClearEmail();
		obj.AddEmail("ali.test@ovada.com");
		obj.ClickDepatmentList();
		obj.ClickChooseDepartment();
		//driver.findElement(By.xpath("//label[text()='Department']")).click();
		obj.ClickDepartmentHeading();
		/////////////////Contact Person Information//////////////////////////////////
		obj.ClearFirstName();
		obj.AddFirstName("Sajad");
		obj.ClearMiddleName();
		obj.AddMiddleName("Deline");
		obj.ClearLastName();
		obj.AddLastName("Media");
		obj.ClearPersonPhone();
		obj.AddPersonPhone("3214455000");
		obj.ClearPersonExtension();
		obj.AddPersonExtension("3239922123");
		obj.ClearPersonCell();
		obj.AddPersonCell("3012277444");
		obj.ClearPersonFax();
		obj.AddPersonFax("3426543111");
		obj.ClearPersonEmail();
		obj.AddPersonEmail("ali.test@ovada.com");
		obj.ClickUpdate();
		// driver.findElement(By.xpath("//button[text()='Update']")).click();
		//		Thread.sleep(4000);
		//		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		//		System.out.println("here is result:"+Result);
		//		Assert.assertEquals(Result, "Success");	

	}

}
