package User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class Department extends base {
	///Now we can not update Department name so we will have to add new Department name every time
	@Test(priority = 1)	
	public void AddDepartment() throws Exception {	
		Thread.sleep(8000);	
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();	
		Thread.sleep(3000);

		driver.findElement(By.xpath("//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Department")).click();	
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='d-block']//a[1]")).click();	
		Thread.sleep(2000);	
		///Add name here
		driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).sendKeys("gt");
		driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("Test");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

	@Test(priority = 2)	
	public void FilterDepartment() throws Exception {	
		Thread.sleep(8000);		
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[3]/a[1]")).click();	
		Thread.sleep(10000);	
		driver.findElement(By.linkText("Department")).click();	
		Thread.sleep(2000);	
        /////////////////Change the name here which you added again
		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("gt");	
		driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("Test");	
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[text()=' Filter ']")).click();
	}
	
	@Test(priority = 3)	
	public void EditDepartment() {	
		driver.findElement(By.xpath("//a[@tooltip='Edit']//i[1]")).click();	
		driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).clear();	
		driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("Testing");	
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
	}
}