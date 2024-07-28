package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceAccidentObject {
	
	WebDriver driver;

	public InsuranceAccidentObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Insurance") WebElement Insurance;
	public void ClickInsurance() {
		Insurance.click();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using = "Accident") WebElement Accident;
	public void ClickAccident() {
		Accident.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='DOA(MM/DD/YYYY) *']/following::input") WebElement Date;
	public void AddDate(String data) {
		Date.sendKeys(data);
	}
	
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-accident/div/div/div/app-injury-information-form/div[2]/dynamic-form/form/app-div/div/app-input[2]/div/div/div/input") WebElement AccidentTime;
	public void ClickAccidentTime() {
		AccidentTime.click();
	}
	

	@FindBy(how=How.XPATH, using = "//label[contains(@class,'d-block position-relative')]//span") WebElement Location;
	public void ClickLocation() {
		Location.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Where did the injury/illness happen?']/following::input") WebElement Injury;
	public void AddInjury(String data) {
		Injury.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Street Address']/following::input") WebElement StreetAddress;
	public void AddStreetAddress(String data) {
		StreetAddress.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Suite / Floor']/following::input") WebElement Suite;
	public void AddSuite(String data) {
		Suite.sendKeys(data);
	}

	
	@FindBy(how=How.XPATH, using = "//label[text()='What were you doing when you were injured or became ill? (e.g, unloading a truck, typing a report) *']/following::input") WebElement InjuryActivity;
	public void AddInjuryActivity(String data) {
		InjuryActivity.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='How did the injury/illness happen? (e.g., I tripped over a pipe and fell on the floor) *']/following::input") WebElement InjuryHappen;
	public void AddInjuryHappen(String data) {
		InjuryHappen.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Describe your injury?']/following::input") WebElement InjuryDescribe;
	public void AddDEscribeInjury(String data) {
		InjuryDescribe.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Explain fully the nature of your injury / illness(e.g., twisted left ankle and cut to forehead) *']/following::input") WebElement InjuryNature;
	public void AddInjuryNature(String data) {
		InjuryNature.sendKeys(data);
	}
	
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-accident[1]/div[1]/div[1]/div[1]/app-object-involved-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]") WebElement ObjectInvolve;
	public void ClickObjectInvolve() {
		ObjectInvolve.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='If Yes, what? *']/following::input") WebElement WhichObject;
	public void AddWhichObject(String data) {
		WhichObject.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-accident[1]/div[1]/div[1]/div[1]/app-object-involved-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[2]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]") WebElement License;
	public void ClickVehicle() {
		License.click();
	}
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-accident[1]/div[1]/div[1]/div[1]/app-object-involved-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[3]/div[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]") WebElement Passenger;
	public void ClickPassenger() {
		Passenger.click();
	}
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-accident[1]/div[1]/div[1]/div[1]/app-object-involved-form[1]/div[2]/dynamic-form[1]/form[1]/app-div[3]/div[1]/app-div[2]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]") WebElement Employeer;
	public void ClickEmployeer() {
		Employeer.click();
	}
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-case-insurance[1]/div[1]/app-accident[1]/div[1]/div[1]/div[1]/div[1]/div[2]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]") WebElement Witness;
	public void ClickWitness() {
		Witness.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='First Name *']/following::input") WebElement FirstName;
	public void AddFirstName(String data) {
		FirstName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Middle Name']/following::input") WebElement MiddleName;
	public void AddMiddleName(String data) {
		MiddleName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Last Name *']/following::input") WebElement LastName;
	public void AddLastName(String data) {
		LastName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Street Address'])[2]/following::input") WebElement WitnessStreetAddress;
	public void AddWitnessStreetAddress(String data) {
		WitnessStreetAddress.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save']") WebElement WitnessSave;
	public void ClickWitnessSave() {
		WitnessSave.click();
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()=' Save & Continue']") WebElement Save;
	public void ClickSave() {
        Save.click();
	}
	
}
