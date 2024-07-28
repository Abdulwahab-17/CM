package Patient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import configuration.base;

public class Injury extends base {

	@Test
	public void AddInjury() throws Exception {
		////Click Injury//////
		Thread.sleep(3000);
		driver.findElement(By.linkText("Injury")).click();
		Thread.sleep(3000);
		////Click head
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-untouched ng-pristine')]/following-sibling::span")).click();



		
        Thread.sleep(5000);
	    WebElement sliderLocation = driver.findElement(By.xpath("//label[text()='Range']/following::input"));
	    sliderLocation.click();
	    
	    
//		WebElement elem17 = driver.findElement(By.xpath("//*[@id='64']/div[2]/div[1]/div/div[17]"));
//
//		Actions action = new Actions(driver);
////		action.clickAndHold(sliderLocation).moveToElement(elem17).release(sliderLocation).build().perform();
//	    
//	    action.moveToElement(sliderLocation)
//		   .dragAndDropBy
//		     (sliderLocation,10, 0)
//		   .build()
//		   .perform();
	}

}
