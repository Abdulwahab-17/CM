package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CaseListObject {
	
	WebDriver driver;

	public CaseListObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Patient')]") WebElement Patient;
	public void ClickPatient() {
		Patient.click();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using = "Case List") WebElement CaseList;
	public void ClickCaseList() {
		CaseList.click();
	}
	
	@FindBy(how=How.XPATH, using = "//span[text()='Add New']") WebElement AddNew;
	public void ClickAddNew() {
		AddNew.click();
	}
	@FindBy(how=How.XPATH, using = "html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-choose-patient[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/a[1]") WebElement ChoosePatient;
	public void ClickPatiendCharId() {
		ChoosePatient.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[@class='ng-select-container']//span)[1]") WebElement Practice;
	public void ClickPractice() {
		Practice.click();
	}
	

	@FindBy(how=How.XPATH, using = "(//div[contains(@class,'form-group field')]//select)[1]") WebElement Category;
	public void ClickCategory() {
		Category.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[contains(@class,'form-group field')]//select)[2]") WebElement PurposeOfVisit;
	public void ClickPurposeOfVisit() {
		PurposeOfVisit.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[contains(@class,'form-group field')]//select)[3]") WebElement CaseType;
	public void ClickCaseType() {
		CaseType.click();
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save & Continue']") WebElement Save;
	public void ClickSave() {
		Save.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Height in Ft.']/following::input)[1]") WebElement HeightFt;
	public void ClearHeightFt() {
		HeightFt.clear();
	}
	public void AddHeightFt(String data) {
		HeightFt.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Height in Inches']/following::input)[1]") WebElement HeightInches;
	public void ClearHeightInches() {
		HeightInches.clear();
	}
	public void AddHeightInches(String data) {
		HeightInches.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-personal-information-edit[1]/div[1]/app-personal-information-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[2]/div[1]/app-radiobutton[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]") WebElement MartialStatus;
	public void ClickMartialStatus() {
		MartialStatus.click();
	}
	//////////////////////////////////////Basic information/////////////////////////////////////////////////////

	@FindBy(how=How.XPATH, using = "//label[text()='Home Phone']/following::input") WebElement HomePhone;
	public void ClearHomePhone() {
		HomePhone.clear();
	}
	public void AddHomePhone(String data) {
		HomePhone.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Cell Phone *']/following::input") WebElement CellPhone;
	public void ClearCellPhone() {
		 CellPhone.clear();
	}
	public void AddCellPhone(String data) {
		 CellPhone.sendKeys(data);
	}
	
	
	@FindBy(how=How.XPATH, using = "//label[text()='Work Phone']/following::input") WebElement WorkPhone;
	public void ClearWorkPhone() {
		WorkPhone.clear();
	}
	public void AddWorkPhone(String data) {
		WorkPhone.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Extention']/following::input") WebElement Extension;
	public void ClearExtension() {
		Extension.clear();
	}
	public void AddExtension(String data) {
		Extension.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Suite / Floor']/following::input") WebElement Suite;
	public void ClearSuite() {
		Suite.clear();
	}
	public void AddSuite(String data) {
		Suite.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Email']/following::input") WebElement Email;
	public void ClearEmail() {
		Email.clear();
	}
	public void AddEmail(String data) {
		Email.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Fax']/following::input") WebElement Fax;
	public void ClearFax() {
		Fax.clear();
	}
	public void AddFax(String data) {
		Fax.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Street Address*']/following::input") WebElement StreetAddress;
	public void ClearStreetAddress() {
		StreetAddress.clear();
	}
	public void AddStreetAddress(String data) {
		StreetAddress.sendKeys(data);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//label[text()='City'])[2]/following::input") WebElement City;
	public void ClearCity() {
		City.clear();
	}
	public void AddCity(String data) {
		City.sendKeys(data);
	}
	@FindBy(how=How.XPATH, using = "(//label[text()='Suite / Floor'])[2]/following::input") WebElement ResidentialSuite;
	public void ClearResidentialSuite() {
		 ResidentialSuite.clear();
	}
	public void AddResidentialSuite(String data) {
		 ResidentialSuite.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='State'])[2]/following::input") WebElement State;
	public void ClearState() {
		State.clear();
	}
	public void AddState(String data) {
		State.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "(//label[text()='Zip'])[2]/following::input") WebElement Zip;
	public void ClearZip() {
		Zip.clear();
	}
	public void AddZip(String data) {
		Zip.sendKeys(data);
	}
	
	/////////////////////////////////////////Emergency Contact///////////////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH, using = "//label[text()='First Name *']/following::input") WebElement FirstName;
	public void ClearFirstName() {
		FirstName.clear();
	}
	public void AddFirstName(String data) {
		FirstName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Middle Name']/following::input") WebElement MiddleName;
	public void ClearMiddleName() {
		MiddleName.clear();
	}
	public void AddMiddleName(String data) {
		MiddleName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Last Name *']/following::input") WebElement LastName;
	public void ClearLastName() {
		LastName.clear();
	}
	public void AddLastName(String data) {
		LastName.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-cases[1]/app-case-edit[1]/div[1]/div[1]/app-case-left-sidebar[1]/div[1]/div[1]/div[1]/app-personal-information-edit[1]/div[1]/app-contact-people-form[1]/div[2]/div[1]/dynamic-form[1]/form[1]/app-div[1]/div[1]/app-radiobutton[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]") WebElement Guarantor;
	public void ClickGuarantorCheckbox() {
		Guarantor.click();
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='SSN']/following::input") WebElement SSN;
	public void ClearSSN() {
		SSN.clear();
	}
	public void AddSSN(String data) {
		SSN.sendKeys(data);
	}
	
	@FindBy(how=How.XPATH, using = "//label[contains(@class,'d-block position-relative')]//span") WebElement Gender;
	public void ClickGender() {
		Gender.click();
	}
	///////////////////////Referrals////////////////////////////////////////////////////////////////////////////
	@FindBy(how=How.XPATH, using = "//input[@id='f3d553c0-d0dd-484d-a55f-cc930616d6ad']") WebElement ReferralsMiddleName;
	public void ClearReferralsMiddleName() {
		ReferralsMiddleName.clear();
	}
	public void AddReferralsMiddleName(String data) {
		ReferralsMiddleName.sendKeys(data);
	}
}
