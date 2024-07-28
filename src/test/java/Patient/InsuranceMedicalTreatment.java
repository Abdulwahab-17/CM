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
import pageObject.InsuranceMedicalTreatmentObject;

public class InsuranceMedicalTreatment extends base {
	
	@Test 
	public void AddMedicalTreatment() throws Exception {
		
	//	Thread.sleep(3000);
		InsuranceMedicalTreatmentObject obj = PageFactory.initElements(driver,	InsuranceMedicalTreatmentObject .class);
//		Thread.sleep(2000);
//		obj.ClickInsurance();
//		Thread.sleep(7000); 
//		obj.ClickMedicalTreatment();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(@class,'d-block position-relative')]//span")).click();
		driver.findElement(By.xpath("//label[text()='First Treatment Date']/following::input")).sendKeys("12122019");
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-medical-treatment[1]/app-medical-treatment-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();
		///yes click
		//driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-medical-treatment[1]/app-medical-treatment-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
	    ///Date of treatment(i am not able to send values in field even cursor is moving in the field)
		//driver.findElement(By.xpath("//label[text()='Date Of Treatment']")).sendKeys("12");
		Thread.sleep(3000);
		///off site
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-medical-treatment[1]/app-medical-treatment-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		////No
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-medical-treatment[1]/app-medical-treatment-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[4]/div[1]/div[1]/div[1]/ul[1]/li[5]/label[1]/span[1]")).click();
	    /////treated fot injury
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-medical-treatment[1]/app-medical-treatment-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[5]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
	    //////Doctor
		///Name
		Thread.sleep(2000); 

		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/dynamic-form/form/app-div[1]/div/app-input[1]/div/div/div[1]/input")).sendKeys("Atiq");
		driver.findElement(By.xpath("//label[text()='Middle Name']/following::input")).sendKeys("Raza");
		driver.findElement(By.xpath("//label[text()='Last Name *']/following::input")).sendKeys("Deline");
		//driver.findElement(By.xpath("html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-input[1]/div[1]/div[1]/label[1]")).sendKeys("atiq");
		driver.findElement(By.xpath("(//label[text()='Street Address'])[2]/following::input")).sendKeys("phase6");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		///Having another injury(No Click)
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-medical-treatment/app-medical-treatment-form/div[2]/div/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-radiobutton[6]/div/div/div[1]/ul/li[2]/label/span[1]")).click();
        ////Independent medical examination
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-medical-treatment[1]/app-medical-treatment-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[10]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();		
		
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Save & Continue']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		////General information
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-medical-treatment/app-medical-treatment-form/div[2]/div/dynamic-form/form/app-div[1]/div/app-div[2]/div/app-input[1]/div/div/div[1]/input")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-medical-treatment/app-medical-treatment-form/div[2]/div/dynamic-form/form/app-div[1]/div/app-div[2]/div/app-radiobutton[3]/div/div/div[1]/ul/li[2]/label/span[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-medical-treatment/app-medical-treatment-form/div[2]/div/dynamic-form/form/app-div[1]/div/app-div[2]/div/app-radiobutton[4]/div/div/div[1]/ul/li[2]/label/span[1]")).click();
		
		
		
		driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
	    Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
