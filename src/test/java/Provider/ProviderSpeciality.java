package Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class ProviderSpeciality extends base {
    //////No need to change
	@Test(priority = 1)
	public void providerAdd() throws Exception {
		Thread.sleep(18000);
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.linkText("Provider")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-target='#speciality-name']")).click();
		driver.findElement(By.id("name")).sendKeys("ABC");
		driver.findElement(By.xpath("(//div[@class='ng-select-container']//span)[1]")).click();
		driver.findElement(By.xpath("(//div[@role='option'])[2]")).click();
		////For hidding list
		driver.findElement(By.xpath("html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("(//input[@formcontrolname='time_slot'])[2]")).sendKeys("20");
		//driver.findElement(By.id("time_slot")).sendKeys("20");
		driver.findElement(By.xpath("(//input[@formcontrolname='over_booking'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("//label[@class='chkbox']//span[1]")).click();
		driver.findElement(By.id("comments")).sendKeys("Testing");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("Here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void ProviderSearch() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.linkText("Provider")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group field']//input)[2]")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@formcontrolname='time_slot']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@formcontrolname='over_booking']")).sendKeys("2");
		driver.findElement(By.xpath("(//div[contains(@class,'col-5 col-sm-6')]//button)[1]")).click();

	}
	
	@Test(priority = 3)
	public void providerEdit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@tooltip='Edit']//i)[1]")).click();
		driver.findElement(By.id("name")).sendKeys("CDE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ng-select-container ng-has-value']//span)[5]")).click();
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.xpath("(//div[@role='option']//span)[5]")).click();
		////For hidding list
		driver.findElement(By.xpath("//label[text()='Visit Types']")).click();
		driver.findElement(By.xpath("(//input[@formcontrolname='time_slot'])[2]")).clear();;
		driver.findElement(By.xpath("(//input[@formcontrolname='time_slot'])[2]")).sendKeys("30");
		driver.findElement(By.xpath("(//input[@formcontrolname='over_booking'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@formcontrolname='over_booking'])[2]")).sendKeys("3");
		driver.findElement(By.id("comments")).sendKeys("Edit");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();		
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("Here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
