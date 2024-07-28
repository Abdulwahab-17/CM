package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployerObject {
	
	WebDriver driver;

	public EmployerObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Master')]") WebElement Master;
	public void ClickMaster() {
		Master.click();
	}


	@FindBy(how=How.XPATH, using = "//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[4]/a[1]") WebElement Billing;
	public void ClickBilling() {
		Billing.click();
	}
	

	@FindBy(how = How.LINK_TEXT, using = "Employer") WebElement employer;
	public void ClickEmployer() {
		employer.click();
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Add New") WebElement AddNewEmployer;
	public void ClickAddNewEmployer() {
		AddNewEmployer.click();
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='employer_name']") WebElement EmployerName;
	public void ClearEmployerName() {
		EmployerName.clear();
	}
	public void AddEmployerName(String name) {
		EmployerName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='street_address'])[2]") WebElement EmployerStreetAddress;
	public void ClearEmployerStreetAddress() {
		EmployerStreetAddress.clear();
	}
	public void AddEmployerStreetAddress(String name) {
		EmployerStreetAddress.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='apartment_suite']") WebElement EmployerSuite;
	public void ClearEmployerSuite() {
		EmployerSuite.clear();
	}
	public void AddEmployerSuite(String name) {
		EmployerSuite.sendKeys(name);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='city'])[2]") WebElement EmployerCity;
	public void ClearEmployerCity() {
		EmployerCity.clear();
	}
	public void AddEmployerCity(String name) {
		EmployerCity.sendKeys(name);
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='ng-select-container']//span)[1]") WebElement EmployerState;
	public void ClickEmployerState() {
		EmployerState.click();
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@role='option']//span)[2]") WebElement EmployerStateChoose;
	public String ClickEmployerStateChoose() {
		     String state= driver.findElement(By.xpath("(//div[@role='option']//span)[2]")).getText();
             EmployerStateChoose.click();
             return state;
	}
	//////////////////////////////////////////////////////////
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='zip'])[2]") WebElement EmployerZip;
	public void ClearEmployerZip() {
		EmployerZip.clear();
	}
	public void AddEmployerZip(String name) {
		EmployerZip.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='phone_no'])[2]") WebElement EmployerPhone;
	public void ClearEmployerPhone() {
		EmployerPhone.clear();
	}
	public void AddEmployerPhone(String name) {
		EmployerPhone.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='ext'])[2]") WebElement EmployerExtension;
	public void ClearEmployerExtension() {
		EmployerExtension.clear();
	}
	public void AddEmployerExtension(String name) {
		EmployerExtension.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='email'])[2]") WebElement EmployerEmail;
	public void ClearEmployerEmail() {
		EmployerEmail.clear();
	}
	public void AddEmployerEmail(String name) {
		EmployerEmail.sendKeys(name);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='fax'])[2]") WebElement EmployerFax;
	public void ClearEmployerFax() {
		EmployerFax.clear();
	}
	public void AddEmployerFax(String name) {
		EmployerFax.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='first_name']") WebElement EmployerFirstName;
	public void ClearPersonFirstName() {
		EmployerFirstName.clear();
	}
	public void AddEmployerFirstName(String name) {
		EmployerFirstName.sendKeys(name);
	}
	

	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='middle_name']") WebElement EmployerMiddleName;
	public void ClearPersonMiddleName() {
		EmployerMiddleName.clear();
	}
	public void AddEmployerMiddleName(String name) {
		EmployerMiddleName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='last_name']") WebElement EmployerLastName;
	public void ClearPersonLastName() {
		EmployerLastName.clear();
	}
	public void AddEmployerLastName(String name) {
		EmployerLastName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='phone_no'])[3]") WebElement ContactPersonPhone;
	public void ClearPersonPhone() {
		ContactPersonPhone.clear();
	}
	public void AddContactPersonPhone(String name) {
		ContactPersonPhone.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='extension']") WebElement ContactPersonExtension;
	public void ClearPersonExtension() {
		ContactPersonExtension.clear();
	}
	public void AddContactPersonExtension(String name) {
		ContactPersonExtension.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='email'])[3]") WebElement ContactPersonEmail;
	public void ClearPersonEmail() {
		ContactPersonEmail.clear();
	}
	public void AddContactPersonEmail(String name) {
		ContactPersonEmail.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='fax'])[3]") WebElement ContactPersonFax;
	public void ClearPersonFax() {
		ContactPersonFax.clear();
	}
	public void AddContactPersonFax(String name) {
		ContactPersonFax.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[3]") WebElement Submit;
	public void ClickSubmit() {
		Submit.click();
	}
	
	

	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='name']") WebElement EmployerNameFilter;
	public void FilterEmployerName(String name) {
		EmployerNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='street_address']") WebElement EmployerAddressFilter;
	public void FilterEmployerAddress(String name) {
		EmployerAddressFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='city']") WebElement EmployerCityFilter;
	public void FilterEmployerCity(String name) {
		EmployerCityFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='state']") WebElement EmployerStateFilter;
	public void FilterEmployerState(String name) {
		EmployerStateFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[contains(@class,'btn plus-btn')]//span[1]") WebElement PlusIcon;
	public void ClickPlusIcon() {
		PlusIcon.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='zip']") WebElement EmployerZipFilter;
	public void FilterEmployerZip(String name) {
		EmployerZipFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='phone_no']") WebElement EmployerPhoneFilter;
	public void FilterEmployerPhone(String name) {
		EmployerPhoneFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='ext']") WebElement EmployerExtFilter;
	public void FilterEmployerExtension(String name) {
		EmployerExtFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='email']") WebElement EmployerEmailFilter;
	public void FilterEmployerEmail(String name) {
		EmployerEmailFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='fax']") WebElement EmployerFaxFilter;
	public void FilterEmployerFax(String name) {
		EmployerFaxFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_name']") WebElement PersonNameFilter;
	public void FilterPersonName(String name) {
		PersonNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()=' Filter ']") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}
	
	
}
