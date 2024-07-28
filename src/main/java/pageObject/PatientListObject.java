package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatientListObject {
	
	WebDriver driver;

	public PatientListObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Patient')]") WebElement Patient;
	public void ClickPatient() {
		Patient.click();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using = "Patient List") WebElement PatientList;
	public void ClickPatientList() {
		PatientList.click();
	}
	
	@FindBy(how=How.XPATH, using = "//span[text()='Add New']") WebElement AddNew;
	public void ClickAddNew() {
		AddNew.click();
	}

	@FindBy(how=How.XPATH, using = "(//label[text()='First Name*']/following::input)[1]") WebElement FirstName;
	public void ClearFirstName() {
		FirstName.clear();
	}
	public void AddFirstName(String name) {
		FirstName.sendKeys(name);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Middle Name']/following::input)[1]") WebElement MiddleName;
	public void ClearMiddleName() {
		MiddleName.clear();
	}
	public void AddMiddleName(String name) {
		MiddleName.sendKeys(name);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Last Name*']/following::input)[1]") WebElement LastName;
	public void ClearLastName() {
		LastName.clear();
	}
	public void AddLastName(String name) {
		LastName.sendKeys(name);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//input[@type='radio']/following-sibling::span)[2]") WebElement Gender;
	public void SelectGender() {
		Gender.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Date Of Birth*']/following::input)[1]") WebElement DOB;
	public void ClearDOB() {
		DOB.clear();
	}
	public void AddDOB(String name) {
		DOB.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='SSN']/following::input)[1]") WebElement SSN;
	public void ClearSSN() {
		SSN.clear();
	}
	public void AddSSN(String name) {
		SSN.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Home Phone']/following::input)[1]") WebElement HomePhone;
	public void ClearHomePhone() {
		HomePhone.clear();
	}
	public void AddHomePhone(String name) {
		HomePhone.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Work Phone']/following::input)[1]") WebElement WorkPhone;
	public void ClearWorkPhone() {
		WorkPhone.clear();
	}
	public void AddWorkPhone(String name) {
		WorkPhone.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Cell Phone*']/following::input)[1]") WebElement CellPhone;
	public void ClearCellPhone() {
		CellPhone.clear();
	}
	public void AddCellPhone(String name) {
		CellPhone.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Email']/following::input)[1]") WebElement Email;
	public void ClearEmail() {
		Email.clear();
	}
	public void AddEmail(String name) {
		Email.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Address*']/following::input)[1]") WebElement Address;
	public void ClearAddress() {
		Address.clear();
	}
	public void AddAddress(String name) {
		Address.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Suite / Floor']/following::input)[1]") WebElement Suite;
	public void ClearSuite() {
		Suite.clear();
	}
	public void AddSuite(String name) {
		Suite.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='City']/following::input)[1]") WebElement City;
	public void ClearCity() {
		City.clear();
	}
	public void AddCity(String name) {
		City.sendKeys(name);
	}
	
	@FindBy(how=How.TAG_NAME, using = "select") WebElement State;
	public void ClickState() {
		State.click();
	}
	
	
	
	@FindBy(how=How.XPATH, using = "//label[text()='Zip']/following::input") WebElement Zip;
	public void ClearZip() {
		Zip.clear();
	}
	public void AddZip(String name) {
		Zip.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save & Continue']") WebElement Save;
	public void ClickSave() {
		Save.click();
	}
	
	////////////////////////Filter///////////////////////////////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Chart ID']/following::input)[1]") WebElement CharidFilter;
	public void FilterCharid(String name) {
	   CharidFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Patient Name']/following::input)[1]") WebElement PatientNameFilter;
	public void FilterPatientName(String name) {
	   PatientNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='DOB']/following::input)[1]") WebElement DOBFilter;
	public void FilterDOB(String name) {
	   DOBFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Primary Phone']/following::input)[1]") WebElement PrimaryPhoneFilter;
	public void FilterPrimaryPhone(String name) {
	   PrimaryPhoneFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Filter']") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}
	
	///////////////////////////Edit////////////////////////////////////////////////////////////////////////
	////////////////////////Edit///////////////////////////////////////
	@FindBy(how=How.XPATH, using = "//a[@class='edit-hov mx-1']//i[1]") WebElement Edit;
	public void ClickEditIcon() {
		Edit.click();
	}
}
