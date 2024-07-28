package Patient;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import configuration.base;

public class Referrals extends base {
	
    @Test
    public void AddRefarrl() throws Exception {
    	Thread.sleep(5000);
    	driver.findElement(By.linkText("Referrals")).click(); 
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//label[contains(@class,'d-block position-relative')]//span")).click();
    	driver.findElement(By.xpath("//label[text()='First Name *']/following::input")).sendKeys("Sajad");//FirstName
    	driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-referrals/div/div/div/div/app-referring-form/div[2]/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-input[2]/div/div/div/input")).sendKeys("Media");//MiddleName
    	driver.findElement(By.xpath("//label[text()='Last Name *']/following::input")).sendKeys("Deline");
    	driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-referrals/div/div/div/div/app-referring-form/div[2]/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-input[4]/div/div/div/input")).sendKeys("OMC");
    	driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("sajad.r@ovada.com");
    	driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-referrals/div/div/div/div/app-referring-form/div[2]/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-input[6]/div/div/div[1]/input")).sendKeys("3214534234");
    	driver.findElement(By.xpath("//label[text()='Extention']/following::input")).sendKeys("3425678899");
    	driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-referrals/div/div/div/div/app-referring-form/div[2]/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-div/div/app-div/div/app-address/div/div/input")).sendKeys("Phase6");
    	driver.findElement(By.xpath("//label[text()='Suite / Floor']/following::input")).sendKeys("3rd");
    	driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-referrals/div/div/div/div/app-referring-form/div[2]/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-div/div/app-div/div/app-input[2]/div/div/div/input")).sendKeys("Test");
    	driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-referrals/div/div/div/div/app-referring-form/div[2]/dynamic-form/form/app-div[1]/div/app-div[1]/div/app-div/div/app-div/div/app-div/div/app-div/div/app-div/div/app-input[3]/div/div/div/input")).sendKeys("56000");
    	driver.findElement(By.xpath("//div[contains(@class,'form-group field')]//select")).click();
    	Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
//    	driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\\"f3d553c0-d0dd-484d-a55f-cc930616d6ad\\\"]\")).sendKeys(\"Test\");")).sendKeys("Delibe");//MiddleName
//    	driver.findElement(By.xpath("//input[@id='eb998578-12bc-436b-992b-67111f46cfe6']")).sendKeys("Media");//LastName
//    	driver.findElement(By.xpath("//input[@id='2dd13444-8a09-4462-8c4e-cf70bbb14988']")).sendKeys("OMC"); ///ClinicNmae
//    	driver.findElement(By.id("//input[@id='email']")).sendKeys("sajad.r@ovada.com");//Email
//    	driver.findElement(By.xpath("//input[@id='a4dd9b5c-c86b-4964-8f26-5e3dd869f7c3']")).sendKeys("3214567867");//Phone
//    	driver.findElement(By.xpath("//input[@id='6d3d5474-667f-41d2-bc6b-828755903834']")).sendKeys("3205367788");///Extension
//    	driver.findElement(By.xpath("//*[@id=\"027d4887-b7c4-49b1-8835-e3aa2e4f24c5\"]")).sendKeys("Phase6");//Address
//    	driver.findElement(By.xpath("//input[@id='0d353516-8ae7-499e-bb48-166b55224add']")).sendKeys("3rd");//Floor
//    	driver.findElement(By.xpath("//input[@id='0376a2f8-3aed-469b-965a-7f32ccd94913']")).sendKeys("Test");//City
//    	driver.findElement(By.xpath("//input[@id='2aa5bb0c-bae6-46ef-9fef-1ee3e8e9730e']")).sendKeys("56000");
    	
    	
    }
	
	

}
