package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.UserLoginInformationObject;

public class UserLoginInformation extends base {

	@Test
	public void AddUserLoginInformation() throws Exception {
		UserLoginInformationObject cd = PageFactory.initElements(driver, UserLoginInformationObject.class);
		Thread.sleep(20000);
		cd.ClickMaster();
		Thread.sleep(3000);
		cd.ClickUser();
		Thread.sleep(15000);
		cd.ClickAddNew();
		cd.AddFirstName(data.name().firstName());
		cd.AddMiddleName(data.name().lastName());
		cd.AddLastName(data.name().lastName());
		cd.AddEmail(data.internet().safeEmailAddress());
		cd.AddPassword("abcdef");
		cd.AddConfirmPassword("abcdef");
		cd.ClickRolesList();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Provider']")).click();
		Actions act=new Actions(driver);
		//		Thread.sleep(2000);
		//		act.sendKeys(Keys.DOWN).perform();
		//		act.sendKeys(Keys.ENTER).perform();
		cd.ClickPracticeList();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Click Register
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-users-add/div/div/tabset/div/tab[1]/div/div/form/div[3]/div/button")).click();

	}

	@Test(dependsOnMethods = "AddUserLoginInformation")
	public void AddBasicInformation() throws Exception {
		Thread.sleep(10000);
		///Click Title
		driver.findElement(By.xpath("//*[@id=\"SelectTitle\"]")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///SSN 
		driver.findElement(By.id("SSN")).sendKeys("123456778");
		//Dob click
		driver.findElement(By.id("date_of_birth")).sendKeys("08101994");
		////Click Gender
		driver.findElement(By.id("SelectGender")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Work Phone
		driver.findElement(By.id("WorkPhone")).sendKeys("3216542345");
		///Extension
		driver.findElement(By.id("Extension")).sendKeys("321");
		///homePhone
		driver.findElement(By.id("homePhone")).sendKeys("3214567898");
		///cell_no
		driver.findElement(By.id("cell_no")).sendKeys("3214567891");
		///Address
		driver.findElement(By.id("address")).sendKeys("Dha phase 6");
		///Apartment
		driver.findElement(By.id("Apartment")).sendKeys("3rd");
		///Fax
		driver.findElement(By.id("Fax")).sendKeys("3012341233");
		///City
		driver.findElement(By.id("City")).sendKeys(data.address().city());
		///State
		driver.findElement(By.id("State")).sendKeys(data.address().state());
		///Zip
		driver.findElement(By.id("Zip")).sendKeys(data.address().zipCode());
		///Emergencyname
		driver.findElement(By.id("Emergencyname")).sendKeys(data.name().fullName());
		///EmergencyPhone
		String number=data.phoneNumber().cellPhone();
		driver.findElement(By.id("EmergencyPhone")).sendKeys(number);
		///Click Designation 
		driver.findElement(By.xpath("//div[@class='ng-select-container']//span")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Select Department
		driver.findElement(By.id("SelectDeparment")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Employment Type
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-basic-info/div[2]/app-user-form/form/div/div/div/div[2]/div[2]/div[2]/div/ng-select/div/span")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Employment By
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-basic-info/div[2]/app-user-form/form/div/div/div/div[2]/div[2]/div[3]/div/ng-select/div/span")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///BioGraphy
		driver.findElement(By.id("Biography")).sendKeys("Test");
		///Hiring Date
		driver.findElement(By.id("hiring_date")).sendKeys("06072020");
		/////////////////////////////////////////////////////////////////////////////
		WebElement element = driver.findElement(By.xpath("//button[text()=' Save & Continue ']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		////////////////////////////Document Upload///////////////////////////////////
		Thread.sleep(2000);
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-basic-info/div[2]/app-user-form/form/div/div/div/div[2]/app-shared-file-upload/div[1]/div/div/file-drop/div/div/div/input[1]"));
		Thread.sleep(2000);
		uploadElement.sendKeys("C:\\Users\\atiq.r\\Desktop\\Git\\test.pdf");


		////Save button
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//button[text()=' Save & Continue ']")).click();
	}

	@Test(dependsOnMethods = "AddBasicInformation")
	public void AddMedicalIdentifier() throws Exception {
		Thread.sleep(15000);
		driver.findElement(By.linkText("Medical Identifier")).click();
		////Verified click
		driver.findElement(By.xpath("//label[@for='Verified']//span[1]")).click();
		///License Name
		Thread.sleep(3000);
		driver.findElement(By.id("firstName0")).sendKeys("Medical123");
		///Issue date
		//		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/mat-datepicker-toggle/button/span/svg")).click();
		//	    WebElement issuedate=driver.findElement(By.xpath("//label[text()='Issue Date (mm/dd/yyyy)']"));
		//	    issuedate.click();
		//	    Thread.sleep(2000);
		//	    issuedate.sendKeys("08152018");
		driver.findElement(By.id("issueDate0")).sendKeys("08101994");
		//State
		driver.findElement(By.id("State")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Degree Listed
		driver.findElement(By.id("Degree")).sendKeys("MBBS");
		///ExpirationDate
		driver.findElement(By.id("expiration_date0")).sendKeys("08102021");
		///Registration Number
		driver.findElement(By.id("RegNumber")).sendKeys("234");
		///Registration Expiration
		driver.findElement(By.id("RegExpiration")).sendKeys("02122020");
		///DEA Number
		driver.findElement(By.id("DeaNumber")).sendKeys("ab12345622");
		///DEA Expiration
		driver.findElement(By.id("DeaExpiration")).sendKeys("11092020");
		///DEA Issue
		driver.findElement(By.id("DeaIssue")).sendKeys("09032020");
		///NPI Number
		driver.findElement(By.id("Zip")).sendKeys("1234455677");
		///Billing Title
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[1]/div[7]/div/ng-select/div/span[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///Employment Type
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[1]/div[8]/div/ng-select/div/span[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		///NADEAN Number
		driver.findElement(By.id("NADEAN")).sendKeys("ab32434355");
		///UPIN
		driver.findElement(By.id("UPIN")).sendKeys("324334");
		///WCB (Here facing an issue if  i add WCB then issue date field is mendatory and not able to add date)
	//	driver.findElement(By.id("WCB")).sendKeys("123");
		
		///wcbRatingCode
		driver.findElement(By.id("wcbRatingCode")).sendKeys("21323");
		///dob(Facing issue here)
		//driver.findElement(By.id("dob")).sendKeys("08101994");
		
		///
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[1]/div[14]/div/div[1]/ul/li[1]/label/span[2]")).click();
		///ICD 10 Codes
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[2]/div/div[1]/div[2]/ng-select/div/span")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		WebElement element = driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-users[1]/div[1]/div[1]/app-user-edit[1]/div[1]/app-medical-identifier[1]/app-medical-identifier-form[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		///CPT Codes
		//		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[2]/div/div[2]/div[2]/ng-select/div/span")).click();
		//		Thread.sleep(2000);
		//		act.sendKeys(Keys.DOWN).perform();
		//		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[3]/app-signature/div/div/input")).sendKeys("Test");
		////////////////////////////Document Upload///////////////////////////////////
		Thread.sleep(2000);
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/app-shared-file-upload/div[1]/div/div/file-drop/div/div/div/input[1]"));
		Thread.sleep(2000);
		uploadElement.sendKeys("C:\\Users\\atiq.r\\Desktop\\Git\\test.pdf");
        ////Select Folder
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div/div[1]/div/div/select")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		////Submit
		driver.findElement(By.xpath("//*[@id=\"btnFileUpload\"]")).click();
		Thread.sleep(3000);
		//////////////////////////////////////Scroll/////////////////////////////////////////////////////////
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		
		///Save and continue
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-user-edit/div/app-medical-identifier/app-medical-identifier-form/div/div/form/div/div/div/div[2]/div[4]/div[2]/button")).click();

	}


}
