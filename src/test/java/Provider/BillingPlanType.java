package Provider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class BillingPlanType extends base {
	 ////////////////// Must add the new PlanName which does not exist 
	@Test(priority = 1)
	public void AddPlanType() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.linkText("Plan Type")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    ///////Here add the new PlanName
		driver.findElement(By.xpath("(//input[@formcontrolname='plan_type'])[2]")).sendKeys("Quarterly");
		driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("Testing");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterPlanType() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='plan_type']")).sendKeys("Yearly");
		driver.findElement(By.xpath("//button[text()=' Filter ']")).click();
	}
	
	@Test(priority = 3)
	public void EditPlanType() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[1]")).click();
		driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("Test");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		Assert.assertEquals(Result, "Success");
	}

}
