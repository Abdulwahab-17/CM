package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeObject {

	WebDriver driver;

	public PracticeObject(WebDriver driver) {
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

	@FindBy(how=How.XPATH, using = "//a[@href='/front-desk/masters/practice/practice/list']") WebElement SubPractice;
	public void ClickSubPractice() {
		SubPractice.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@class='text-right px-0']//a[1]") WebElement NewPracticeAdd;
	public void ClickAddNewPractice() {
		NewPracticeAdd.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='name']") WebElement PracticeNameAdd;
	public void ClearPracticeName() {
		PracticeNameAdd.clear();
	}
	public void AddPracticeName(String name) {
		PracticeNameAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='address'])[1]") WebElement StreetAdd;
	public void ClearStreetAddress() {
		StreetAdd.clear();
	}
	public void AddStreetAddress(String name) {
		StreetAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='floor'])[1]") WebElement SuiteAdd;
	public void ClearSuite() {
		SuiteAdd.clear();
	}
	public void AddSuite(String name) {
		SuiteAdd.sendKeys(name);
	}

	@FindBy(how = How.ID, using = "city") WebElement City;
	public void ClearCity() {
		City.clear();
	}
	public void AddCity(String name) {
		City.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-practice[1]/div[1]/div[1]/app-practice-add[1]/app-practice-form[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/ng-select[1]/div[1]/span[2]") WebElement StateList;
	public void ClickStateList() {
		StateList.click();
	}


	@FindBy(how = How.XPATH, using = "(//span[@class='ng-option-label'])[1]") WebElement ChooseState;
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
	
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='phone']") WebElement PhoneAdd;
	public void ClearPhone() {
		PhoneAdd.clear();
	}
	public void AddPhone(String name) {
		PhoneAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='ext_no']") WebElement ExtensionAdd;
	public void ClearExtension() {
		ExtensionAdd.clear();
	}
	public void AddExtension(String name) {
		ExtensionAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='cell_no']") WebElement AltPhoneAdd;
	public void ClearAltPhone() {
		AltPhoneAdd.clear();
	}
	public void AddAltPhone(String name) {
		AltPhoneAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='fax']") WebElement FaxAdd;
	public void ClearFax() {
		FaxAdd.clear();
	}
	public void AddFax(String name) {
		FaxAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']") WebElement EmailAdd;
	public void ClearEmail() {
		EmailAdd.clear();
	}
	public void AddEmail(String name) {
		EmailAdd.sendKeys(name);
	}
	
    ///////////////////////////////////////////////////////Add Location/////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//button[text()='Add Location']") WebElement LocationAdd;
	public void AddLocation() {
		LocationAdd.click();
	}
	
	@FindBy(how = How.XPATH, using = "//label[text()='Name*']/following::input") WebElement  LocationNameAdd;
	public void ClearLocationName() {
		 LocationNameAdd.clear();
	}
	public void AddLocationName(String name) {
		LocationNameAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='phone'])[3]") WebElement LocationPhoneAdd;
	public void ClearLocationPhone() {
		LocationPhoneAdd.clear();
	}
	public void AddLocationPhone(String name) {
		LocationPhoneAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='fax'])[3]") WebElement LocationFaxAdd;
	public void ClearLocationFax() {
		LocationFaxAdd.clear();
	}
	public void AddLocationFax(String name) {
		LocationFaxAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='email'])[3]") WebElement LocationEmailAdd;
	public void ClearLocationEmail() {
		LocationEmailAdd.clear();
	}
	public void AddLocationEmail(String name) {
		LocationEmailAdd.sendKeys(name);
	}
	

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='address'])[3]") WebElement LocationStreetAdd;
	public void ClearLocationStreetAddress() {
		LocationStreetAdd.clear();
	}
	
	public void AddLocationStreetAddress(String name) {
		LocationStreetAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "(//label[text()='Suite / Floor'])[3]/following::input") WebElement LocationSuiteAdd;
	public void ClearLocationSuite() {
		LocationSuiteAdd.clear();
	}
	public void AddLocationSuite(String name) {
		LocationSuiteAdd.sendKeys(name);
	}
    
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='region_id']") WebElement SelectRegion;
	public void ClickSelectRegion() {
		SelectRegion.click();
	}
	
	@FindBy(how = How.XPATH, using = "//label[text()='Place of Service*']/following::input") WebElement PlaceOfServiceAdd;
	public void PlaceOfService(String name) {
		 PlaceOfServiceAdd.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()=' Wednesday ']") WebElement dayWednesday;
	public void ClickDayWednesday() {
		dayWednesday.click();
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()=' Add ']") WebElement Add;
	public void ClickAdd() {
		Add.click();
	}
	///////////////////////////////////////////////////////Filter///////////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//label[text()='Search Practice Name']/following::input") WebElement PracticeNameSearch;
	public void SearchPracticeName(String name) {
		PracticeNameSearch.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='phone']") WebElement PhoneSearch;
	public void SearchPhone(String name) {
		PhoneSearch.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()=' Filter ']") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}
	//////////////////////////////////////////////Edit////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//main[@id='main']/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-practice[1]/div[1]/div[1]/app-practice-listing[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]") WebElement Edit;
	public void ClickEdit() {
		Edit.click();
	}
	@FindBy(how = How.XPATH, using = "//button[text()=' Monday ']") WebElement dayMonday;
	public void ClickDayMonday() {
		dayMonday.click();
	}
	
	@FindBy(how = How.XPATH, using = "(//button[text()=' Update '])[2]") WebElement UpdateLocation;
	public void ClickUpdateLocation() {
		UpdateLocation.click();
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()=' Update ']") WebElement UpdatePractice;
	public void ClickUpdatePractice() {
		UpdatePractice.click();
	}
	
}
