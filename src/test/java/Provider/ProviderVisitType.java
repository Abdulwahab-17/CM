package Provider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class ProviderVisitType extends base {
	
    /////No need to change
	@Test(priority = 1)
	public void AddVisitType() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.linkText("Provider")).click();
		driver.findElement(By.linkText("Visit Type")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='d-block']//button[1]")).click();
		driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).sendKeys("Test entry");
		driver.findElement(By.xpath("//div[contains(@class,'form-group field')]//textarea[1]")).sendKeys("test");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterVisitType() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.linkText("Provider")).click();
		driver.findElement(By.linkText("Visit Type")).click();
		driver.findElement(By.id("name")).sendKeys("Test entry");
		driver.findElement(By.id("description")).sendKeys("test");
		driver.findElement(By.xpath("(//div[contains(@class,'col-5 col-sm-3')]//button)[1]")).click();
		
	}
	
	@Test(priority = 3)
	public void EditVisitType() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//input)[3]")).clear();
		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//input)[3]")).sendKeys("11");
		driver.findElement(By.xpath("//div[contains(@class,'form-group field')]//textarea[1]")).clear();
		driver.findElement(By.xpath("//div[contains(@class,'form-group field')]//textarea[1]")).sendKeys("22");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

}
