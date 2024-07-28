package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdjusterInformationObject {
	
	WebDriver driver;

	public AdjusterInformationObject(WebDriver driver) {
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
	
	@FindBy(how = How.LINK_TEXT, using = "Adjuster Information") WebElement  AdjusterInformation;
	public void ClickAdjusterInformation() {
		AdjusterInformation.click();
	}
	
	
	@FindBy(how=How.XPATH, using = "//button[text()='Add New ']") WebElement AddNew;
	public void ClickAddNew() {
		AddNew.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[@class='ng-select-container']//span)[1]") WebElement InsuranceList;
	public void ClickInsuranceList() {
		InsuranceList.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/ngb-modal-window/div/div/app-adjuster-information-modal-component/div/div[2]/form/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span") WebElement ChooseInsurance;
	public String ClickChooseInsurance() {
		String name=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-adjuster-information-modal-component/div/div[2]/form/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")).getText();
		ChooseInsurance.click();
		return name;
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='first_name']") WebElement FirstName;
	public void ClearFirstName() {
		FirstName.clear();
	}
	public void AddFirstName(String name) {
		FirstName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='middle_name']") WebElement MiddleName;
	public void ClearMiddleName() {
		MiddleName.clear();
	}
	public void AddMiddleName(String name) {
		MiddleName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='last_name']") WebElement LastName;
	public void ClearLastName() {
		LastName.clear();
	}
	public void AddLastName(String name) {
		LastName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='street_address']") WebElement StreetAddress;
	public void ClearStreetAddress() {
		StreetAddress.clear();
	}
	public void AddStreetAddress(String name) {
		StreetAddress.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='apartment_suite']") WebElement Suite;
	public void ClearSuite() {
		Suite.clear();
	}
	public void AddSuite(String name) {
		Suite.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='city']") WebElement City;
	public void ClearCity() {
		City.clear();
	}
	public void AddCity(String name) {
		City.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//span[@class='ng-arrow-wrapper'])[2]") WebElement State;
	public void ClickState() {
		State.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/ngb-modal-window/div/div/app-adjuster-information-modal-component/div/div[2]/form/div[2]/div[7]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]") WebElement ChooseState;
	public String ClickChooseState() {
		String state=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-adjuster-information-modal-component/div/div[2]/form/div[2]/div[7]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).getText();
		ChooseState.click();
		return state;
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='zip']") WebElement Zip;
	public void ClearZip() {
		Zip.clear();
	}
	public void AddZip(String name) {
		Zip.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='phone_no'])[2]") WebElement Phone;
	public void ClearPhone() {
		Phone.clear();
	}
	public void AddPhone(String name) {
		Phone.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='ext']") WebElement Extension;
	public void ClearExtension() {
		Extension.clear();
	}
	public void AddExtension(String name) {
		Extension.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='cell_no']") WebElement Cell;
	public void ClearCell() {
		Cell.clear();
	}
	public void AddCell(String name) {
		Cell.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='fax'])[2]") WebElement Fax;
	public void ClearFax() {
		Fax.clear();
	}
	public void AddFax(String name) {
		Fax.sendKeys(name);
	}
	
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='email'])[2]") WebElement Email;
	public void ClearEmail() {
		Email.clear();
	}
	public void AddEmail(String name) {
		Email.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//textarea[@formcontrolname='comments']") WebElement Comments;
	public void ClearComments() {
		Comments.clear();
	}
	public void AddPersonComments(String name) {
		Comments.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save']") WebElement Save;
	public void ClickSave() {
		Save.click();
	}
	
	//////////////////////////////Filter////////////////////////////////////////
	@FindBy(how=How.ID, using = "insurance_name") WebElement InsuranceNameFilter;
	public void FilterInsuranceName(String name) {
		InsuranceNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.ID, using = "name") WebElement AdjusterNameFilter;
	public void FilterAdjusterName(String name) {
		AdjusterNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.ID, using = "phone_no") WebElement PhoneNOFilter;
	public void FilterPhoneNo(String name) {
		PhoneNOFilter.sendKeys(name);
	}
	
	@FindBy(how=How.ID, using = "fax") WebElement FaxFilter;
	public void FilterFax(String name) {
		FaxFilter.sendKeys(name);
	}
	
	@FindBy(how=How.ID, using = "email") WebElement EmailFilter;
	public void FilterEmail(String name) {
		EmailFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//div[contains(@class,'col-5 col-sm-3')]//button)[1]") WebElement Filter;
	public void Filter() {
		Filter.click();
	}
	////////////////////////Edit///////////////////////////////////////
	@FindBy(how=How.XPATH, using = "(//button[@role='button']//i)[1]") WebElement Edit;
	public void ClickEditIcon() {
		Edit.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[@class='ng-select-container ng-has-value']//span)[5]") WebElement EditChooseInsuranceList;
	public void ClickEditChooseInsuranceList() {
		EditChooseInsuranceList.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[@role='option']//span)[2]") WebElement EditChooseState;
	public void ClickEditChooseState() {
		EditChooseState.click();
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Update']") WebElement Update;
	public void Update() {
		Update.click();
	}
	
	
}
