package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.PracticeObject;

public class PracticeList extends base {

	/////No need to change because can add same Practice again//////////////
	@Test(priority = 1)
	public void AddPractice() throws Exception {
		Thread.sleep(13000);
		PracticeObject obj = PageFactory.initElements(driver,PracticeObject.class);
		Thread.sleep(5000);
		obj.ClickMaster();
		Thread.sleep(4000);
		obj.ClickPractice();
		Thread.sleep(3000);
		obj.ClickSubPractice();
		obj.ClickAddNewPractice();
		obj.AddPracticeName("Pvt");
		obj.AddStreetAddress("Phase6");
		obj.AddSuite("3rd");
		obj.AddCity("Lahore");
		obj.ClickStateList();
		obj.ClickChooseState();
		obj.AddZip("54000");
		obj.AddPhone("3214568800");
		obj.AddExtension("3016775456");
		obj.AddAltPhone("3314356736");
		obj.AddFax("3214566990");
		obj.AddEmail("test.a@ovada.com");
		driver.findElement(By.xpath("//label[@for=' same_as_provider']//span[1]")).click();
		////////////////////////////////////////Add Location/////////////////////////////////////
		WebElement element = driver.findElement(By.xpath("//button[text()='Add Location']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		obj.AddLocation();
		obj.AddLocationName("Test");
		obj.AddLocationPhone("3214002233");
		obj.AddLocationFax("0314356765");
		obj.AddLocationEmail("atiq.r@ovada.com");
		obj.AddLocationStreetAddress("Phase4");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.AddLocationSuite("2nd");
		obj.ClickSelectRegion();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.PlaceOfService("786");
		Thread.sleep(5000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickDayWednesday();
		obj.ClickAdd();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");	
	}

	@Test(priority = 2)
	public void FilterPractice() throws Exception {
		Thread.sleep(3000);
		PracticeObject obj = PageFactory.initElements(driver,PracticeObject.class);
		Thread.sleep(5000);
		obj.SearchPracticeName("Pvt");
		obj.SearchPhone("3214568800");
		obj.ClickFilter();

	}

	@Test(priority = 3)
	public void EditPractice() throws Exception {
		Thread.sleep(3000);
		PracticeObject obj = PageFactory.initElements(driver,PracticeObject.class);
		Thread.sleep(5000);
		obj.ClickEdit();
		Thread.sleep(5000);

		obj.ClearPracticeName();
		obj.AddPracticeName("New");
		obj.ClearStreetAddress();
		obj.AddStreetAddress("Phase4");
		obj.ClearSuite();
		obj.AddSuite("2nd");
		obj.ClearCity();
		obj.AddCity("Test");


		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-practice[1]/div[1]/div[1]/app-practice-edit[1]/app-practice-form[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();


		obj.ClearZip();
		obj.AddZip("50000");
		obj.ClearPhone();
		obj.AddPhone("3214562222");
		obj.ClearExtension();
		obj.AddExtension("3016774444");
		obj.ClearAltPhone();
		obj.AddAltPhone("3314353333");
		obj.ClearFax();
		obj.AddFax("3214565555");
		obj.ClearEmail();
		obj.AddEmail("atiq.a@ovada.com");
		///////////////////////////Edit Location first and then click on upadte button of firm edit//////////
		WebElement element = driver.findElement(By.xpath("//button[@tooltip='Edit']//i[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//button[@tooltip='Edit']//i[1]")).click();

		Thread.sleep(4000);
		obj.ClearLocationName();
		obj.AddLocationName("Ittef");
		obj.ClearLocationPhone();
		obj.AddLocationPhone("3245674587");
		obj.ClearLocationFax();
		obj.AddLocationFax("3214560000");
		obj.ClearLocationEmail();
		obj.AddLocationEmail("ali.d@ovada.com");
		obj.ClearLocationStreetAddress();
		obj.AddLocationStreetAddress("Phase5");
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClearLocationSuite();
		obj.AddLocationSuite("4th");
		obj.ClickSelectRegion();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.PlaceOfService("565");
		Thread.sleep(5000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickDayMonday();
		obj.ClickUpdateLocation();
		Thread.sleep(4000);
		obj.ClickUpdatePractice();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");	

	}

}
