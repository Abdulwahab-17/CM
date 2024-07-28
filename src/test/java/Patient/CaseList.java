package Patient;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.CaseListObject;

public class CaseList extends base {
	////////No need to change simple execute this script
	@Test (priority = 1)
	public void AddCaseList() throws Exception {
		Thread.sleep(28000);
		CaseListObject obj = PageFactory.initElements(driver,CaseListObject .class);
		Thread.sleep(5000);
		obj.ClickPatient();
		Thread.sleep(3000);
		obj.ClickCaseList();
		Thread.sleep(13000);
		obj.ClickAddNew();
		Thread.sleep(5000);
		obj.ClickPatiendCharId();
		obj.ClickPractice();
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickCategory();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickPurposeOfVisit();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickCaseType();
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickSave();
		Thread.sleep(4000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");
	}

	@Test(dependsOnMethods = "AddCaseList")
	public void AddPersonalInformation() throws Exception {
		CaseListObject obj = PageFactory.initElements(driver,CaseListObject .class);
		Thread.sleep(4000);
		obj.ClearHeightFt();
		obj.AddHeightFt("5");
		Thread.sleep(2000);
		obj.ClearHeightInches();
		obj.AddHeightInches("8");
		Thread.sleep(3000);
		obj.ClickMartialStatus();
		WebElement translatorCheckbox=	driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-personal-information-edit[1]/div[1]/app-personal-information-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[2]/div[1]/app-radiobutton[4]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]"));
		if (!translatorCheckbox.isEnabled()) {
			translatorCheckbox.click();
		}
		//driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-personal-information-edit[1]/div[1]/app-personal-information-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[2]/div[1]/app-radiobutton[4]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]")).click();

		obj.ClickSave();
		Thread.sleep(3000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");

	}

	@Test(dependsOnMethods = "AddPersonalInformation")
	public void AddBasicInformation() throws Exception {
		CaseListObject obj = PageFactory.initElements(driver,CaseListObject .class);
		Thread.sleep(3000);
		obj.ClearHomePhone();
		obj.AddHomePhone("0324356367");
		//obj.ClearCellPhone();
		//obj.AddCellPhone("8799886766");
		obj.ClearWorkPhone();
		obj.AddWorkPhone("3456776546");
		obj.ClearExtension();
		obj.AddExtension("3314567456");
		obj.ClearSuite();
		obj.AddSuite("3rd");
		obj.ClearEmail();
		obj.AddEmail("atiq.r@ovada.com");
		obj.ClearFax();
		obj.AddFax("5467890044");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//label[contains(@class,'d-block position-relative')]//span)[3]")).click();
		WebElement checkboxaddress= driver.findElement(By.xpath("//label[contains(@class,'d-block position-relative')]//span"));
		if (!checkboxaddress.isEnabled()) {
			checkboxaddress.click();
		}

		obj.ClearStreetAddress();
		obj.AddStreetAddress("Phase6");
		obj.ClearResidentialSuite();
		obj.AddResidentialSuite("2nd");
		obj.ClearCity();
		obj.AddCity("Test");
		obj.ClearState();
		obj.AddState("Testing");
		obj.ClearZip();
		obj.AddZip("52000");
		WebElement CheckboxInformation=	driver.findElement(By.xpath("//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-personal-information-edit[1]/div[1]/app-contact-info-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[4]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]"));
		if (!CheckboxInformation.isEnabled()) {
			CheckboxInformation.click();
		}
		Thread.sleep(3000);
		obj.ClickSave();
		///////////////////////

	}

	@Test(dependsOnMethods = "AddBasicInformation")
	public void AddEmergencyContact() throws Exception {
		Thread.sleep(3000);
		CaseListObject obj = PageFactory.initElements(driver,CaseListObject .class);
		Thread.sleep(3000);
		obj.ClearFirstName();
		obj.AddFirstName("Ali");
		obj.ClearMiddleName();
		obj.AddMiddleName("Deline");
		obj.ClearLastName();
		obj.AddLastName("Ra");
		obj.ClearHomePhone();
		obj.AddHomePhone("3217896677");
		obj.ClearCellPhone();
		obj.AddCellPhone("32145678790");
		obj.ClearEmail();
		obj.AddEmail("ali.r@ovada.com");
		obj.ClearFax();
		obj.AddFax("3224567986");
		//driver.findElement(By.xpath("//label[text()='Home Phone']/following::input")).sendKeys("3217896677");
		//driver.findElement(By.xpath("//label[text()='Cell Phone *']/following::input")).sendKeys("32145678790");
		//driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("ali.r@ovada.com");
		//driver.findElement(By.xpath("//label[text()='Fax']/following::input")).sendKeys("3224567986");
		driver.findElement(By.xpath("//label[text()='Street Address']/following::input")).sendKeys("phase5");
		driver.findElement(By.xpath("//label[text()='Suite / Floor']/following::input")).sendKeys("3rd");
		driver.findElement(By.xpath("//label[text()='City']/following::input")).sendKeys("test");
		driver.findElement(By.xpath("//label[text()='State']/following::input")).sendKeys("Test");
		driver.findElement(By.xpath("//label[text()='Zip']/following::input")).sendKeys("50000");
		driver.findElement(By.tagName("select")).click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		obj.ClickGuarantorCheckbox();
		obj.ClickSave();
		Thread.sleep(3000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");

	}

	@Test(dependsOnMethods = "AddEmergencyContact")
	public void AddGuarantor() throws Exception {
		Thread.sleep(3000);
		CaseListObject obj = PageFactory.initElements(driver,CaseListObject .class);
		Thread.sleep(3000);
		obj.ClearFirstName();
		obj.AddFirstName("Awais");
		obj.ClearMiddleName();
		obj.AddMiddleName("Media");
		obj.ClearLastName();
		obj.AddLastName("Raza");
		obj.ClearHomePhone();
		obj.AddHomePhone("3217896600");
		obj.ClearCellPhone();
		obj.AddCellPhone("32145678111");
		obj.ClearEmail();
		obj.AddEmail("awais.r@ovada.com");
		obj.ClearFax();
		obj.AddFax("3224500986");
		obj.ClearSSN();
		obj.AddSSN("322324244");
		obj.ClickGender();
		//driver.findElement(By.xpath("//label[text()='Home Phone']/following::input")).sendKeys("3217896677");
		//driver.findElement(By.xpath("//label[text()='Cell Phone *']/following::input")).sendKeys("32145678790");
		//driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("ali.r@ovada.com");
		//driver.findElement(By.xpath("//label[text()='Fax']/following::input")).sendKeys("3224567986");
		driver.findElement(By.xpath("//label[text()='Street Address']/following::input")).sendKeys("phase4");
		driver.findElement(By.xpath("//label[text()='Suite / Floor']/following::input")).sendKeys("2nd");
		driver.findElement(By.xpath("//label[text()='City']/following::input")).sendKeys("test");
		driver.findElement(By.xpath("//label[text()='State']/following::input")).sendKeys("Test");
		driver.findElement(By.xpath("//label[text()='Zip']/following::input")).sendKeys("54000");
		driver.findElement(By.tagName("select")).click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		obj.ClickSave();
		Thread.sleep(3000);
		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
		System.out.println("here is result:"+Result);
		Assert.assertEquals(Result, "Success");

	}

//	@Test
//	public void AddReferrals() throws Exception {
//		Thread.sleep(3000);
//		CaseListObject obj = PageFactory.initElements(driver,CaseListObject .class);
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//label[contains(@class,'d-block position-relative')]//span")).click();
//				obj.ClearFirstName();
//				obj.AddFirstName("Sajad");
//				driver.findElement(By.xpath("//*[@id=\"f3d553c0-d0dd-484d-a55f-cc930616d6ad\"]")).sendKeys("Test");
////				obj.ClearMiddleName();
////				obj.AddMiddleName("Media");
//				obj.ClearLastName();
//				obj.AddLastName("Raza");
//		//		obj.ClearHomePhone();
//		//		obj.AddHomePhone("3217896600");
//		//		obj.ClearCellPhone();
//		//		obj.AddCellPhone("32145678111");
//		//		obj.ClearEmail();
//		//		obj.AddEmail("awais.r@ovada.com");
//		//		obj.ClearFax();
//		//		obj.AddFax("3224500986");
//		//		obj.ClearSSN();
//		//		obj.AddSSN("322324244");
//		//		obj.ClickGender();
//		//		//driver.findElement(By.xpath("//label[text()='Home Phone']/following::input")).sendKeys("3217896677");
//		//		//driver.findElement(By.xpath("//label[text()='Cell Phone *']/following::input")).sendKeys("32145678790");
//		//		//driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("ali.r@ovada.com");
//		//		//driver.findElement(By.xpath("//label[text()='Fax']/following::input")).sendKeys("3224567986");
//		//		driver.findElement(By.xpath("//label[text()='Street Address']/following::input")).sendKeys("phase4");
//		//		driver.findElement(By.xpath("//label[text()='Suite / Floor']/following::input")).sendKeys("2nd");
//		//		driver.findElement(By.xpath("//label[text()='City']/following::input")).sendKeys("test");
//		//		driver.findElement(By.xpath("//label[text()='State']/following::input")).sendKeys("Test");
//		//		driver.findElement(By.xpath("//label[text()='Zip']/following::input")).sendKeys("54000");
//		//		driver.findElement(By.tagName("select")).click();
//		//		Thread.sleep(5000);
//		//		Actions act = new Actions(driver);
//		//		act.sendKeys(Keys.DOWN).perform();
//		//		act.sendKeys(Keys.DOWN).perform();
//		//		act.sendKeys(Keys.DOWN).perform();
//		//		act.sendKeys(Keys.ENTER).perform();
//		//		obj.ClickSave();
//		//		Thread.sleep(3000);
//		//		String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
//		//		System.out.println("here is result:"+Result);
//		//		Assert.assertEquals(Result, "Success");
//
//	}


}
