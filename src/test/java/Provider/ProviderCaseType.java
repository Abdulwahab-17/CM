package Provider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;

public class ProviderCaseType extends base{

    /////No need to change
	@Test(priority = 1)
	public void AddCaseType() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.linkText("Provider")).click();
		driver.findElement(By.linkText("Case Type")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//input)[5]")).sendKeys("Testing");
	    driver.findElement(By.xpath("(//input[contains(@class,'form-control mb-0')])[2]")).sendKeys("3");
	    driver.findElement(By.xpath("(//input[contains(@class,'form-control mb-0')])[3]")).sendKeys("not");
	    driver.findElement(By.xpath("//div[contains(@class,'form-group field')]//textarea[1]")).sendKeys("Test");
	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();  
	    Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("Here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}
	
	@Test(priority = 2)
	public void FilterCaseType() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.linkText("Provider")).click();
		driver.findElement(By.linkText("Case Type")).click();
		driver.findElement(By.id("name")).sendKeys("test");
//		driver.findElement(By.id("remainder_days")).sendKeys("56");
//		driver.findElement(By.id("description")).sendKeys("not4");
//		driver.findElement(By.id("comments")).sendKeys("test8");
		driver.findElement(By.xpath("(//div[contains(@class,'col-5 col-sm-3')]//button)[1]")).click();
	}
	
    @Test(priority = 3)
	public void EditCaseType() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@tooltip='Edit']//i)[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'form-group field')]//input)[5]")).sendKeys("Automation");
		driver.findElement(By.xpath("(//input[@formcontrolname='remainder_days'])[2]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@formcontrolname='description'])[2]")).sendKeys("Testing");
		driver.findElement(By.tagName("textarea")).sendKeys("Test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();	
	    Thread.sleep(2000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("Here is result:"+Result);
		Assert.assertEquals(Result, "Success");
		
	}
}
