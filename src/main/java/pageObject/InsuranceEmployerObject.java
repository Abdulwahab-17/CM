package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceEmployerObject {
	
	WebDriver driver;
	
	public InsuranceEmployerObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-employer/div/div[1]/dynamic-form/form/app-div/div/app-div/div/app-radiobutton[1]/div/div/div/ul/li[1]/label/span[1]") WebElement Employed;
	public void ClickEmployed() {
		Employed.click();
	}
	
	
	@FindBy(how=How.XPATH, using = "//label[text()='Employer Name']/following::input") WebElement EmployerName;
	public void AddEmployerName(String name) {
		EmployerName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/ngb-modal-window/div/div/app-employer-form/div[2]/div/dynamic-form/form/app-div[1]/div/app-radiobutton/div/div/div[1]/ul/li[1]/label/span[1]") WebElement Time;
	public void ClickTime() {
		Time.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='First Name']/following::input") WebElement FirstName;
	public void AddFirstName(String name) {
		FirstName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Middle Name'])[2]/following::input") WebElement MiddleName;
	public void AddMiddleName(String name) {
		MiddleName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Last Name']/following::input") WebElement LastName;
	public void AddLastName(String name) {
		LastName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save & Continue']") WebElement SaveContinue;
	public void ClickSaveContinue() {
		SaveContinue.click();
	}
	
	//////////////////////////////////////Secondary Employee////////////////////////
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-employer/div/div[1]/dynamic-form/form/app-div/div/app-div/div/app-radiobutton[2]/div/div/div/ul/li[1]/label/span[1]") WebElement SecondaryEmployee;
	public void ClickSecondaryEmployee() {
		SecondaryEmployee.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-employer/div/div[1]/dynamic-form/form/app-div/div/app-div/div/app-radiobutton[3]/div/div/div/ul/li[1]/label/span[1]") WebElement YearlyEmployee;
	public void ClickYearlyEmployee() {
		YearlyEmployee.click();
	}

	

}
