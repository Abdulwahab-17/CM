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
import pageObject.InsuranceAttorneyObject;

public class InsuranceAttorney extends base {

	@Test(priority = 1)
	public void AddPatientAttorney() throws Exception {
		Thread.sleep(4000);
		InsuranceAttorneyObject obj = PageFactory.initElements(driver,		InsuranceAttorneyObject .class);
		Thread.sleep(2000);
		obj.ClickInsurance();
		Thread.sleep(4000);
		obj.ClickAttorney();
		
		obj.ClickFirmList();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		obj.ClickAttorneyList();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//button[text()='Save & Continue']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}


}
