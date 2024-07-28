package Provider;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import configuration.base;

public class Login extends base {
	 
	 @Test
	 public void login() {
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@ovada.com");
		 driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
}
