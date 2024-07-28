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
import pageObject.InsuranceAccidentObject;
import pageObject.InsuranceEmployerObject;

public class InsuranceEmployer extends base{

	@Test
	public void AddPatientEmployer() throws Exception {

//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Insurance")).click(); 
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("(//li[@class='nav-item']//a)[3]")).click();  
		
		
		Thread.sleep(3000);
		InsuranceEmployerObject obj = PageFactory.initElements(driver,	InsuranceEmployerObject .class);
		Thread.sleep(2000);
		obj.ClickEmployed();
		obj.AddEmployerName("Deline media");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
        obj.ClickTime();
        obj.AddFirstName("Atiq");
        obj.AddMiddleName("Raza");
        obj.AddLastName("Media");
        obj.ClickSaveContinue();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success"); 
		
		////////////////////////Secondary Employer////////////////////////////////////////
        obj.ClickSecondaryEmployee();
        obj.AddEmployerName("Deline media");
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickSaveContinue();
		Thread.sleep(4000);
		Assert.assertEquals(Result, "Success"); 
		
		//////////////////////Yearly Employer////////////////////////////////////////////
		obj.ClickYearlyEmployee();
	    obj.AddEmployerName("Deline media");
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickSaveContinue();
		Thread.sleep(4000);
		Assert.assertEquals(Result, "Success");
		
		///////////////////Add Employeers Information///////////////////////////////////
		
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//label[text()='Employer Name']/following::input")).sendKeys("Deline media");
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
		Thread.sleep(4000);
		Assert.assertEquals(Result, "Success");

		WebElement element = driver.findElement(By.xpath("//button[text()=' Back ']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		driver.findElement(By.xpath("//label[text()='Job Title / Description *']/following::input")).sendKeys("QA");
		driver.findElement(By.xpath("//label[text()='Type of Activities *']/following::input")).sendKeys("Testing");
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[1]/app-employment-info-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		/////////////////////////////////////////////////////
		//		Thread.sleep(2000);
		//		driver.findElement(By.tagName("select")).click();
		//		//driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-employer/div/div[2]/div/div[1]/app-employment-info-form/div[2]/dynamic-form/form/app-div[1]/div/app-select/div/div/select")).click();
		//
		//		Thread.sleep(3000);
		//		act.sendKeys(Keys.DOWN).perform();
		//		act.sendKeys(Keys.ENTER).perform();
        
		///full time
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[1]/app-employment-info-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
	    ///Pay yes
		driver.findElement(By.xpath("//label[text()='Please describe']/following::input")).sendKeys("Testing here");
		////////////////////////////Return To work////////////////////////////////
		///////////////////No Xpath are comments
//		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();
//		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[2]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();
//		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[4]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();
	
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		//driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[2]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		//driver.findElement(By.xpath("")).sendKeys("");
		
		//Same employer
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[3]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
		//////Regular Duty
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[3]/div[1]/app-radiobutton[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]")).click();
        /////Notice of injury
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		
		driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-employer[1]/div[1]/div[2]/div[1]/div[2]/app-return-to-work-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[4]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();
		

		driver.findElement(By.xpath("//button[text()=' Save & Continue']")).click();
		Thread.sleep(4000);
		Assert.assertEquals(Result, "Success");
	}
}
