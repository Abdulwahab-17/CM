package Patient;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.CaseListObject;
import pageObject.InsuranceAccidentObject;

public class InsuranceAccident extends base {
	
	@Test(priority = 1)
	public void AddAccident() throws Exception {
		Thread.sleep(3000);
		InsuranceAccidentObject obj = PageFactory.initElements(driver,	InsuranceAccidentObject .class);
		Thread.sleep(2000);
		
//		obj.ClickInsurance();
//		Thread.sleep(7000); 
//		obj.ClickAccident();
//		Thread.sleep(4000);
		
		
		obj.AddDate("08102019");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"accident_time\"]")).click();
		obj.ClickLocation();
		obj.AddInjury("Test");
	    obj.AddStreetAddress("phase6");
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.AddSuite("3rd");
		obj.AddInjuryActivity("sleeping");
        obj.AddInjuryHappen("during travel");
		obj.AddDEscribeInjury("Backbone");
		obj.AddInjuryNature("Back to leg");
	    obj.ClickObjectInvolve();
	    obj.AddWhichObject("Car");
	    Thread.sleep(2000);
	    obj.ClickVehicle();
	    
	    WebElement element = driver.findElement(By.xpath("//button[text()=' Back ']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	    obj.ClickPassenger();
	   // obj.ClickEmployeer();
	    obj.ClickWitness();
	    obj.AddFirstName("Atiq");
	    obj.AddMiddleName("Raza0");
	    obj.AddLastName("Deline");
	    obj.AddWitnessStreetAddress("phase6");
	    Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	  
		obj.ClickWitnessSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	
		Thread.sleep(10000);
		WebElement elemen = driver.findElement(By.xpath("//button[text()=' Back ']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elemen);
		Thread.sleep(3000);
		obj.ClickSave();
		Thread.sleep(4000);
		String Resul=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Resul);
		Assert.assertEquals(Resul, "Success");
		  
	}
	
	@Test(priority = 2)
	public void AddVehicle() throws Exception {
		Thread.sleep(4000);
		//////////////////Vehicle Information//////////////////////////////////////
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-vehicle/div/div/app-vehicle-info-form/div[2]/form/div/dynamic-form/form/app-div[1]/div/app-div/div/app-radiobutton/div/div/div[1]/ul/li[1]/label/span[1]")).click();
	    driver.findElement(By.xpath("//label[text()='Reporting Date* ']/following::input")).sendKeys("10102019");
	   /////State
	    driver.findElement(By.xpath("//label[text()='Precinct']/following::input")).sendKeys("Test");
	    driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-vehicle/div/div/app-vehicle-info-form/div[2]/form/div/dynamic-form/form/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-auto-complete[1]/div/div/ng-select/div/span")).click();
		Actions act = new Actions(driver);
	    Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		/////////City
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-vehicle/div/div/app-vehicle-info-form/div[2]/form/div/dynamic-form/form/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-auto-complete[2]/div/div/ng-select/div/span")).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		////Country//////////////////////////
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-vehicle/div/div/app-vehicle-info-form/div[2]/form/div/dynamic-form/form/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-auto-complete[3]/div/div/ng-select/div/span")).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		/////Bus
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-vehicle[1]/div[1]/div[1]/app-vehicle-info-form[1]/div[2]/form[1]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		////Denial Coverage
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-vehicle[1]/div[1]/div[1]/app-vehicle-info-form[1]/div[2]/form[1]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/label[1]/span[1]")).click();
	    ///Involved vehicle////////////////////////
		driver.findElement(By.xpath("//label[text()='How many vehicles were involved in the accident?']/following::input")).sendKeys("1");
		/////////Vehicle Owner///////////////
		
		
		
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-vehicle[1]/div[1]/div[1]/app-vehicle-info-form[1]/div[2]/form[1]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		//////////Add Vehicle////////////////////////////////
		driver.findElement(By.xpath("//div[@class='col-md-12 text-right']//a[1]")).click();
		//////Vehicle List////
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//select)[2]")).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		////Year add///////
		driver.findElement(By.xpath("//label[text()='Year']/following::input")).sendKeys("2019");
		/////Make
		driver.findElement(By.xpath("//label[text()='Make']/following::input")).sendKeys("Toyota");
		/////Model
		driver.findElement(By.xpath("//label[text()='Model']/following::input")).sendKeys("Gli");
		////Color
		driver.findElement(By.xpath("//label[text()='Color']/following::input")).sendKeys("Yellow");
		////Plate no
		driver.findElement(By.xpath("//label[text()='License Plate No']/following::input")).sendKeys("le123");
		////State
		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//select)[3]")).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		/////Insurance List
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div/div/dynamic-form/form/app-div[1]/div/app-auto-complete/div/div/ng-select/div/span")).click();
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Policy no
		driver.findElement(By.xpath("//label[text()='Policy Number']/following::input")).sendKeys("12345");
		/////Effective date
		driver.findElement(By.xpath("//label[text()='Effective Date']/following::input")).sendKeys("10102019");
		////expiration date
		driver.findElement(By.xpath("//label[text()='Expiration Date']/following::input")).sendKeys("08122020");
		////First Name
		//driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("//label[text()='Driver First Name']/following::input")).sendKeys("Wahab");
		////Middle name
		driver.findElement(By.xpath("//label[text()='Driver Middle Name']/following::input")).sendKeys("Test");
		///Last name
		driver.findElement(By.xpath("//label[text()='Driver Last Name']/following::input")).sendKeys("Deline");
		////Driver address
		driver.findElement(By.xpath("//label[text()='DriverAddress']/following::input")).sendKeys("test");
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////////Owner First Name
		driver.findElement(By.xpath("//label[text()='Owner First Name']/following::input")).sendKeys("Atiq");
		///////Owner Second Name
		driver.findElement(By.xpath("//label[text()='Owner Middle Name']/following::input")).sendKeys("Raza");
		//////Owner Last name
		driver.findElement(By.xpath("//label[text()='Owner Last Name']/following::input")).sendKeys("Test");
		/////Owner Address
		driver.findElement(By.xpath("//label[text()='OwnerAddress']/following::input")).sendKeys("test");
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		/////Save Vehicle Information
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		////////////////////Save////////////////////
		driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
//		Thread.sleep(4000);
//		String Resul=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
//		System.out.println("here is result:"+Resul);
//		Assert.assertEquals(Resul, "Success");
	
	
	
	
	}
	


}
