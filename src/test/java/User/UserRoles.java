package User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class UserRoles extends base {
    ///Now we can not update Role name so we will have to add new Role name every time
	@Test(priority = 1)	
	public void AddUserRole() throws Exception {
		Thread.sleep(8000);	
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("User Roles")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='d-block']//a[1]")).click();
		//////Add name here
		Thread.sleep(2000);		driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).sendKeys("gt");
		driver.findElement(By.xpath("//textarea[@formcontrolname='comment']")).sendKeys("Test");
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");

	}

	@Test(priority = 2)	
	public void FilterUserRole() throws Exception {	
		Thread.sleep(8000);	
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();	
		Thread.sleep(3000);

		driver.findElement(By.xpath("//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[3]/a[1]")).click();	
		Thread.sleep(10000);	
		driver.findElement(By.linkText("User Roles")).click();
		Thread.sleep(2000);	
		/////////////////Change the name here which you added again
		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("gt");	
		driver.findElement(By.xpath("//input[@formcontrolname='comment']")).sendKeys("Test");	
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[text()='Filter']")).click();
	}

	@Test(priority = 3)	
	public void EditUserRole() throws Exception {	
		driver.findElement(By.xpath("//a[@tooltip='Edit']//i[1]")).click();
		driver.findElement(By.xpath("//textarea[@formcontrolname='comment']")).clear();	
		driver.findElement(By.xpath("//textarea[@formcontrolname='comment']")).sendKeys("Testing");	
		driver.findElement(By.xpath("//button[text()='Update']")).click();

		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

	


}
