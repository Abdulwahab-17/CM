package Provider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class BillingAdjusterInformation extends base {
	
	@Test(priority = 1)
	public void AddAdjuster() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.linkText("Adjuster Information")).click();
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		
//		driver.findElement(By.xpath("(//div[@class='ng-select-container']//span)[1]")).click();
//		////Here list value can be changed so before execution firstly check the value is available or not 
//		driver.findElement(By.xpath("//span[text()='Tested']")).click();
//		///Multiple adding adjuster here
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[@class='ng-select-container ng-has-value']//span)[5]")).click();
//		////Here list value can be changed so before execution firstly check the value is available or not 
//		driver.findElement(By.xpath("//span[text()='Automate']")).click();
//		///Multiple adding adjuster here
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-adjuster-information-modal-component[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/span[2]")).click();
//		////Here list value can be changed so before execution firstly check the value is available or not 
//		driver.findElement(By.xpath("//span[text()='Auto']")).click();
//		
//		driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys("Atiq");
//		driver.findElement(By.xpath("//input[@formcontrolname='middle_name']")).sendKeys("Deline");
//		driver.findElement(By.xpath("//input[@formcontrolname='last_name']")).sendKeys("Raza");
//		
//		driver.findElement(By.xpath("//input[@formcontrolname='street_address']")).sendKeys("Phase6");
//		driver.findElement(By.xpath("//input[@formcontrolname='apartment_suite']")).sendKeys("4th");
	
//		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Lahore");
	
//		driver.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@class='ng-option-label'])[1]")).click();
		
//		driver.findElement(By.xpath("//input[@formcontrolname='zip']")).sendKeys("54000");
//		driver.findElement(By.xpath("(//input[@formcontrolname='phone_no'])[2]")).sendKeys("3217893366");
//		driver.findElement(By.xpath("//input[@formcontrolname='ext']")).sendKeys("3215637788");
//		driver.findElement(By.xpath("//input[@formcontrolname='cell_no']")).sendKeys("3014568899");
//		driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).sendKeys("3234567890");
//		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).sendKeys("atiq.r@ovada.com");
//		driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("Testing");
//		driver.findElement(By.xpath("//button[text()='Save']")).click();
//		Thread.sleep(2000);
//		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
//		System.out.println("here is result:"+Result);
//		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterAdjuster() throws Exception {
		Thread.sleep(2000);
		////Here list value can be changed so before execution firstly check the value is available or not 
		driver.findElement(By.id("insurance_name")).sendKeys("QA Insurance");
		driver.findElement(By.id("name")).sendKeys("se at ra");
		driver.findElement(By.id("phone_no")).sendKeys("321-769-4455");
		driver.findElement(By.id("fax")).sendKeys("032-677-6764");
		driver.findElement(By.id("email")).sendKeys("atiq.r@ovada.com");
		driver.findElement(By.xpath("(//div[contains(@class,'col-5 col-sm-3')]//button)[1]")).click();
	}

	@Test(priority = 3)
	public void EditAdjuster() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='edit-hov mx-1']//i[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ng-select-container ng-has-value']//span)[5]")).click();
		
		driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[@formcontrolname='middle_name']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@formcontrolname='last_name']")).sendKeys("Last");
		driver.findElement(By.xpath("//input[@formcontrolname='street_address']")).sendKeys("New");
		driver.findElement(By.xpath("//input[@formcontrolname='apartment_suite']")).sendKeys("5th");
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("New");
		driver.findElement(By.xpath("html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-adjuster-information-modal-component[1]/div[1]/div[2]/form[1]/div[2]/div[7]/div[1]/ng-select[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='Missouri']")).click();
    	driver.findElement(By.xpath("//input[@formcontrolname='zip']")).sendKeys("0");
    	////Clearing the phone no
		driver.findElement(By.xpath("(//input[@formcontrolname='phone_no'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@formcontrolname='phone_no'])[2]")).sendKeys("3217893300");
	    ////Clearing the phone no
		driver.findElement(By.xpath("//input[@formcontrolname='ext']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='ext']")).sendKeys("3215637668");
		////Clearing the cell no
		driver.findElement(By.xpath("//input[@formcontrolname='cell_no']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='cell_no']")).sendKeys("3014568009");
		////Clearing the fax
		driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@formcontrolname='fax'])[2]")).sendKeys("3234567880");
		///Clearing the email
		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).sendKeys("Ali.r@ovada.com");
		driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
