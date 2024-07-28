package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceSubInsuranceObject {
	
	WebDriver driver;

	public InsuranceSubInsuranceObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-insurance/div/div/div/div/div/app-health-insurance-form/div/div[2]/dynamic-form/form/app-div/div/app-checkbox/div/label/span[2]") WebElement Primary;
	public void ClickPrimary() {
		Primary.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-insurance/div/div/div/div/div/app-health-insurance-form/div/div[2]/dynamic-form/form/app-div/div/app-radiobutton/div/div/div[1]/ul/li[1]/label/span[1]") WebElement Private;
	public void ClickPrivateInsurance() {
		Private.click();
	}
	
	@FindBy(how=How.XPATH, using = "//div[@id='insurance-type']/div[1]/div[1]/div[1]/app-health-insurance-form[1]/div[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]") WebElement Self;
	public void ClickSelf() {
		Self.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-insurance/div/div/div/div/div/app-health-insurance-form/div/div[2]/dynamic-form/form/app-div/div/app-div[1]/div/app-div[1]/div/app-div/div/app-radiobutton/div/div/div[1]/ul/li[1]/label/span[1]") WebElement Gender;
	public void ClickGenderMale() {
		Gender.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Plan Name']/following::input") WebElement PlanName;
	public void ClickPlanName() {
		PlanName.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-insurance/div/div/div/div/div/app-health-insurance-form/div/div[2]/dynamic-form/form/app-div/div/app-div[1]/div/app-div[2]/div/app-auto-complete[1]/div/div/ng-select/div/div/div[2]/input") WebElement InsuranceName;
	public void AddInsuranceName(String data) {
		InsuranceName.sendKeys(data);
	}

	@FindBy(how=How.XPATH, using = "//label[text()='First Name']/following::input") WebElement PolicyHolderName;
	public void AddPolicyHolderFirstName(String data) {
		PolicyHolderName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Middle Name'])[2]/following::input") WebElement PolicyHolderMiddleName;
	public void AddPolicyHolderMiddleName(String data) {
		PolicyHolderMiddleName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Last Name']/following::input") WebElement PolicyHolderLastName;
	public void AddPolicyHolderLastName(String data) {
		PolicyHolderLastName.sendKeys(data);
	}
	

	@FindBy(how=How.XPATH, using = "//label[text()='Claim No']/following::input") WebElement PolicyHolderClaimNo;
	public void AddPolicyHolderClaimN0(String data) {
		PolicyHolderClaimNo.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Policy No']/following::input") WebElement PolicyHolderPolicyNo;
	public void AddPolicyHolderPolicyN0(String data) {
		PolicyHolderPolicyNo.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='WCB No']/following::input") WebElement PolicyHolderWCBNo;
	public void AddPolicyHolderWCBN0(String data) {
		PolicyHolderWCBNo.sendKeys(data);
	}
	
	
	@FindBy(how=How.XPATH, using = "//label[text()='Name']/following::input") WebElement Adjuster;
	public void ClickAdjusterList() {
		Adjuster.click();
	}
	
	@FindBy(how=How.XPATH, using = "//div[@id='insurance-type']/div[1]/div[1]/div[1]/app-insurance-form[2]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]") WebElement SecondryInsuranceNO;
	public void ClickSecondryInsuranceNO() {
		SecondryInsuranceNO.click();
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()=' Save & Continue']") WebElement SaveContinue;
	public void ClickSaveContinue() {
		SaveContinue.click();
	}
	
	
}
