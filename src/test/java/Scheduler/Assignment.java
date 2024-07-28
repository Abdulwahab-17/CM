package Scheduler;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class Assignment extends base {

	//@Test(priority = 1)
	public void AddAssignmentWithSpeciality() throws Exception {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[contains(text(),'Scheduler')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Assignment")).click();
		Thread.sleep(3000);
		//////Choose Location
		driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div[1]/div[2]/label/span")).click();
		////Click Speciality
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-speciality/app-home-spec/div/div/div[3]/div[1]/div/div[2]/app-speciality-clinic-list/div[1]/div[2]")).click();
		////Choose Speciality 
		driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[3]/div[1]/div[2]/label/span")).click();
		///Double click calendar field
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-speciality/app-home-spec/div/div/div[3]/div[2]/div/div/table/tbody/tr/td/cal-assign-speciality-month-view/div/div/div[2]/div/mwl-calendar-month-cell[4]/div"));
		actions.doubleClick(elementLocator).perform();
		////Number Of Provider/////////////////////////////////////
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[1]/div[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[1]/div[3]/input")).sendKeys("2");
		///Start Time
		//driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_131_input\"]")).clear();
		//	driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_131_input\"]")).sendKeys("12:00 AM");
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_43\"]/span/span[2]")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////End Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_44\"]/span/span[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Assign provider
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[3]/div[1]/label/label")).click();
		///Do not Assign
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[3]/div[2]/ul/li[1]/label/span[2]")).click();
		///Click Save

		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[10]/div[2]/button")).click();
		Thread.sleep(4000);
		// String message=driver.findElement(By.xpath("//div[text()=' Error ']")).getText();
		//System.out.println(message);
		if (driver.findElement(By.xpath("//div[text()=' Error ']")).getText().equals("Error")) {
			driver.findElement(By.xpath("//button[text()='×']")).click();
			Assert.fail();
		}
	}

	//@Test(priority = 2)
	public void AddAssignmentWithProvider() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Scheduler')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Assignment")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='d-block'])[2]")).click();
		////Click Location
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-scheduler-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-assign-doctor/app-home-doc/div/div/div[3]/div[1]/div/div[2]/app-doctor-clinic-list/div[3]/div/div/div/div[1]/div[1]/div[2]/label/span")).click(); 
		//// Click Provider
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-doctor/app-home-doc/div/div/div[3]/div[1]/div/div[2]/app-doctor-clinic-list/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[4]/div[2]/div[4]/label/span")).click();
		//////
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-doctor/app-home-doc/div/div/div[3]/div[2]/div/div/table/tbody/tr/td/mwl-calendar-month-view/div/div/div[3]/div/mwl-calendar-month-cell[3]/div"));
		actions.doubleClick(elementLocator).perform();

		////STart Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_131\"]/span/span[2]")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///End Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_132\"]/span/span[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Click Save
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-doc-assignment-modal/div[2]/form/div[7]/div[2]/button")).click();
		Thread.sleep(4000);
		if (driver.findElement(By.xpath("//div[text()=' Error ']")).getText().equals("Error")) {
			driver.findElement(By.xpath("//button[text()='×']")).click();
			Assert.fail();
		}	
	}

	@Test(priority = 1)
	public void Fields() throws Exception {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[contains(text(),'Scheduler')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Assignment")).click();
		Thread.sleep(3000);
		//////Choose Location
		driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[1]/div[1]/div[2]/label/span")).click();
		///Speciality /Location Click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-3']//select[1]")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Click Speciality
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-speciality/app-home-spec/div/div/div[3]/div[1]/div/div[2]/app-speciality-clinic-list/div[1]/div[2]")).click();
		////Choose Speciality 
		driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[3]/div[1]/div[2]/label/span")).click();
		///Double click calendar field
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-speciality/app-home-spec/div/div/div[3]/div[2]/div/div/table/tbody/tr/td/cal-assign-speciality-month-view/div/div/div[2]/div/mwl-calendar-month-cell[4]/div"));
		actions.doubleClick(elementLocator).perform();
		///Create Assigment Location List
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-md-4']//select")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Create Assigment Speciality List
		driver.findElement(By.xpath("(//div[@class='col-md-4']//select)[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Number Of Provider/////////////////////////////////////
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[1]/div[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[1]/div[3]/input")).sendKeys("2");
		///Start Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_43\"]/span/span[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///End Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_44\"]/span/span[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Assign provider
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[3]/div[1]/label/label")).click();
		///Do not Assign
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[3]/div[2]/ul/li[1]/label/span[2]")).click();
		///Manual Assign
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[3]/div[2]/ul/li[3]/label/span[1]")).click();
		///Automatic Assign
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[3]/div[2]/ul/li[2]/label/span[1]")).click();
		///Recurrence Click
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[6]/div/label/span")).click();
		///Range Of Recurence
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[9]/div[1]/label/span")).click();
		///End After
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[9]/div[2]/ul/li[1]/label/span[1]")).click();
		//End By
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[9]/div[2]/ul/li[4]/label/span[1]")).click();
		///Click Save
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-assignment-modal/div[2]/form/div[10]/div[2]/button")).click();

		Thread.sleep(4000);
		if (driver.findElement(By.xpath("//div[text()=' Error ']")).getText().equals("Error")) {
			driver.findElement(By.xpath("//button[text()='×']")).click();
			Assert.fail();
		}
	}

	@Test (priority = 2)
	public void ProviderFields() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='d-block'])[2]")).click();
		////Click Location
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-scheduler-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-assign-doctor/app-home-doc/div/div/div[3]/div[1]/div/div[2]/app-doctor-clinic-list/div[3]/div/div/div/div[1]/div[1]/div[2]/label/span")).click(); 
		//// Click Provider
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-doctor/app-home-doc/div/div/div[3]/div[1]/div/div[2]/app-doctor-clinic-list/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"list\"]/div/div/div[4]/div[2]/div[4]/label/span")).click();
		//////
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-assign-doctor/app-home-doc/div/div/div[3]/div[2]/div/div/table/tbody/tr/td/mwl-calendar-month-view/div/div/div[3]/div/mwl-calendar-month-cell[3]/div"));
		actions.doubleClick(elementLocator).perform();
		///Create Assigment Location List
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-doc-assignment-modal/div[2]/form/div[1]/div[1]/select")).click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		///Create Assigment Provider List
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-doc-assignment-modal/div[2]/form/div[1]/div[2]/select")).click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		///Start Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_43\"]/span/span[2]")).click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		///End Time
		driver.findElement(By.xpath("//*[@id=\"ej2_timepicker_44\"]/span/span[2]")).click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();



	}

}
