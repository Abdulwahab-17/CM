package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HospitalObject {

	WebDriver driver;

	public HospitalObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Master')]") WebElement Master;
	public void ClickMaster() {
		Master.click();
	}


	@FindBy(how=How.XPATH, using = "//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[2]/a[1]") WebElement Practice;
	public void ClickPractice() {
		Practice.click();
	}

	@FindBy(how=How.XPATH, using = "//a[@href='/front-desk/masters/practice/hospital']") WebElement Hospital;
	public void ClickHospital() {
		Hospital.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@class='float-right']//a[1]") WebElement NewHospitalAdd;
	public void ClickAddNewHospital() {
		NewHospitalAdd.click();
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='name'])[2]") WebElement HospitalNameAdd;
	public void ClearHospitalName() {
		HospitalNameAdd.clear();
	}
	public void AddHospitalName(String name) {
		HospitalNameAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'edit-hov mx-1')]//i[1]") WebElement Edit;
	public void ClickEdit() {
		Edit.click();
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='street_address'])[2]") WebElement StreetAdd;
	public void ClearStreetAddress() {
		StreetAdd.clear();
	}
	public void AddStreetAddress(String name) {
		StreetAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='apartment_suite']") WebElement SuiteAdd;
	public void ClearSuite() {
		SuiteAdd.clear();
	}
	public void AddSuite(String name) {
		SuiteAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='city']") WebElement City;
	public void ClearCity() {
		City.clear();
	}
	public void AddCity(String name) {
		City.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='ng-select-container']//span") WebElement StateList;
	public void ClickStateList() {
		StateList.click();
	}


	@FindBy(how = How.XPATH, using = "//span[@class='ng-option-label']") WebElement ChooseState;
	public void ClickChooseState() {
		ChooseState.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='zip']") WebElement ZipAdd;
	public void ClearZip() {
		ZipAdd.clear();
	}
	public void AddZip(String name) {
		ZipAdd.sendKeys(name);
	}


	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='work_phone'])[2]") WebElement PhoneAdd;
	public void ClearPhone() {
		PhoneAdd.clear();
	}
	public void AddPhone(String name) {
		PhoneAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='ext']") WebElement ExtensionAdd;
	public void ClearExtension() {
		ExtensionAdd.clear();
	}
	public void AddExtension(String name) {
		ExtensionAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='fax'])[2]") WebElement FaxAdd;
	public void ClearFax() {
		FaxAdd.clear();
	}
	public void AddFax(String name) {
		FaxAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='email'])[2]") WebElement EmailAdd;
	public void ClearEmail() {
		EmailAdd.clear();
	}
	public void AddEmail(String name) {
		EmailAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//span[@class='dropdown-btn']//span)[3]") WebElement DepatmentList;
	public void ClickDepatmentList() {
		DepatmentList.click();
	}

	@FindBy(how = How.XPATH, using = "//div[text()='Select All']") WebElement ChooseDepartment;
	public void ClickChooseDepartment() {
		ChooseDepartment.click();
	}

	@FindBy(how = How.XPATH, using = "//label[text()='Department']") WebElement Department;
	public void ClickDepartmentHeading() {
		Department.click();
	}
	//////////////////////////////////////////////////Contact Person Information/////////////////////////////////////////

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='first_name']") WebElement FirstNameAdd;
	public void ClearFirstName() {
		FirstNameAdd.clear();
	}
	public void AddFirstName(String name) {
		FirstNameAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='middle_name']") WebElement  MiddleNameAdd;
	public void ClearMiddleName() {
		MiddleNameAdd.clear();
	}
	public void AddMiddleName(String name) {
		MiddleNameAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='last_name']") WebElement  LastNameAdd;
	public void ClearLastName() {
		LastNameAdd.clear();
	}
	public void AddLastName(String name) {
		LastNameAdd.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='phone_no']") WebElement PersonPhoneAdd;
	public void ClearPersonPhone() {
		PersonPhoneAdd.clear();
	}
	public void AddPersonPhone(String name) {
		PersonPhoneAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='extension']") WebElement PersonExtensionAdd;
	public void ClearPersonExtension() {
		PersonExtensionAdd.clear();
	}
	public void AddPersonExtension(String name) {
		PersonExtensionAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='cell_no']") WebElement PersonCellAdd;
	public void ClearPersonCell() {
		PersonCellAdd.clear();
	}
	public void AddPersonCell(String name) {
		PersonCellAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='fax'])[3]") WebElement PersonFaxAdd;
	public void ClearPersonFax() {
		PersonFaxAdd.clear();
	}
	public void AddPersonFax(String name) {
		PersonFaxAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='email'])[3]") WebElement PersonEmailAdd;
	public void ClearPersonEmail() {
		PersonEmailAdd.clear();
	}
	public void AddPersonEmail(String name) {
		PersonEmailAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Save']") WebElement Save;
	public void ClickSave() {
		Save.click();
	}

	//////////////////////////////////////////Filter Hospital////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='name']") WebElement HospitalNameFilter;
	public void FilterHospitalName(String name) {
		HospitalNameFilter.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='work_phone']") WebElement PhoneFilter;
	public void FilterPhone(String name) {
		PhoneFilter.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='street_address']") WebElement AddressFilter;
	public void FilterAddress(String name) {
		AddressFilter.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']") WebElement EmailFilter;
	public void FilterEmail(String name) {
		EmailFilter.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-practice[1]/div[1]/div[1]/app-hospital[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]") WebElement PlusIcon;
	public void ClickPlusIcon() {
		PlusIcon.click();
	}
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='fax']") WebElement FaxFilter;
	public void FilterFax(String name) {
		FaxFilter.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='contact_person_name']") WebElement ContactPersonNameFilter;
	public void FilterContactPersonName(String name) {
		ContactPersonNameFilter.sendKeys(name);
	}
	@FindBy(how = How.XPATH, using = "//button[text()=' Filter ']") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Update']") WebElement Update;
	public void ClickUpdate() {
		Update.click();
	}


}
