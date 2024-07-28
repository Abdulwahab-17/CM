package Patient;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class Marketing extends base {

	@Test(priority = 1)
	public void AddMarketing() throws Exception {
		////Click Marketing
		Thread.sleep(10000);

		driver.findElement(By.linkText("Marketing")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Referred By']/following-sibling::select")).click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
/////////////////////////////////////////sjdhjshdjsdh

		driver.findElement(By.xpath("//label[text()='Enter Name']/following::input")).sendKeys("At");

		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//select)[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Yes']")).click();

		Thread.sleep(15000);
		String Result=driver.findElement(By.xpath("//h4[text()='Document PIN']")).getText();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-kiosk-modal/div[1]/button/span")).click();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Document PIN");


	}
	
	@Test(priority = 2)
	public void AddMarketingWithSign() throws Exception {
		////Click Marketing
		Thread.sleep(4000);

		driver.findElement(By.linkText("Marketing")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Referred By']/following-sibling::select")).click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
/////////////////////////////////////////sjdhjshdjsdh

		driver.findElement(By.xpath("//label[text()='Enter Name']/following::input")).sendKeys("At");

		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//select)[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
		Thread.sleep(3000);
		////Sign Later
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/jaspero-confirmations/jaspero-confirmation/div[2]/div[3]/button[1]/jaspero-variable-content/div")).click();
	

		Thread.sleep(30000);
		String ExpectedResult="Edit Documents Manager";
		String ActualResult=driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult);
		
		System.out.println("here is page title:"+driver.getTitle());
//		String Result=driver.findElement(By.xpath("//h4[text()='Document PIN']")).getText();
//		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-kiosk-modal/div[1]/button/span")).click();
//		System.out.println("here is result:"+Result);
//		Assert.assertEquals(Result, "Document PIN");


	}


}
