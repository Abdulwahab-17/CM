package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import bsh.This;


public class Homepage1 {
	
	WebDriver driver;
	
	public Homepage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Master')]") WebElement Master;
	
	@FindBy(how=How.XPATH, using = "//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[4]/a[1]") WebElement Billing;
	
	@FindBy(how = How.LINK_TEXT, using = "Attorney") WebElement Attorney;
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-master-billing/div/div/app-main-attorney/div/div/div[2]/div/div/app-firm/div/div[1]/div/button") WebElement AddNew;
	
	@FindBy(how = How.ID, using = "name") WebElement AddName;
	
	@FindBy(how = How.ID, using = "FirmName") WebElement FirmNameSearch;
	
	@FindBy(how = How.ID, using = "location") WebElement FirmLocationSearch;
	
	@FindBy(how = How.ID, using = "street_address") WebElement FirmStreetSearch;
	
	@FindBy(how = How.ID, using = "city") WebElement FirmCitySearch;
	
	@FindBy(how=How.XPATH, using = "//button[contains(@class,'btn plus-btn')]//span[1]") WebElement MoreFieldsButton;
	
	@FindBy(how = How.ID, using = "state") WebElement FirmStateSearch;
	
	@FindBy(how = How.ID, using = "zip") WebElement FirmZipSearch;
	
	@FindBy(how = How.ID, using = "phone") WebElement FirmPhoneSearch;
	
	@FindBy(how = How.ID, using = "fax") WebElement FirmFaxSearch;
	
	@FindBy(how = How.ID, using = "email") WebElement FirmEmailSearch;
	
	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[3]") WebElement Filter;
	
	@FindBy(how=How.XPATH, using = "(//span[@class='icon-pencil'])[1]") WebElement EditFilter;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='name'])[1]") WebElement FirmNameEdit;
	
	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[3]") WebElement FirmEditUpdate;
	
	@FindBy(how=How.XPATH, using = "(//button[text()=' Add Location'])[1]") WebElement FirmAddLocation;
	
	@FindBy(how=How.XPATH, using = "(//div[@class='form-group mb-1']//input)[1]") WebElement FirmLocationName;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='street_address'])[2]") WebElement FirmStreetAddress;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='apartment_suite']") WebElement FirmAppartment;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='city'])[2]") WebElement FirmCity;
	
	@FindBy(how=How.XPATH, using = "(//div[@class='ng-select-container ng-has-value']//span)[5]") WebElement FirmState;
	
	@FindBy(how=How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/form/div[3]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]") WebElement FirmChooseState;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='zip'])[2]") WebElement FirmZip;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='phone'])[2]") WebElement FirmPhone;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='ext']") WebElement FirmExtension;
	///////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='cell']") WebElement FirmCell;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='fax'])[2]") WebElement FirmFax;
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='email'])[2]") WebElement FirmEmail;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_first_name']") WebElement PersonFirstName;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_middle_name']") WebElement PersonMiddleName;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_last_name']") WebElement PersonLastName;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_phone']") WebElement PersonPhone;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_ext']") WebElement PersonExtension;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_cell']") WebElement PersonCell;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_fax']") WebElement PersonFax;
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='contact_person_email']") WebElement PersonEmail;
	
	@FindBy(how=How.XPATH, using = "//textarea[@formcontrolname='comments']") WebElement Comments;
	
	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[4]") WebElement Submit;
	
	
	public void ClickMaster() {
		Master.click();
	}
	
	public void ClickBilling() {
		Billing.click();
	}
	
	public void ClickAttorney() {
		Attorney.click();
	}
    
	public void ClickAddNew() {
		AddNew.click();
	}
	
	public void AddFirmName(String Name) {
		AddName.sendKeys(Name);
	}
	
	public void AddLocationName(String Name) {
		FirmLocationName.sendKeys(Name);
	}
	
	public void AddStreetAddress(String Name) {
		 FirmStreetAddress.sendKeys(Name);
	}
	
	public void AddAppartment(String Name) {
		FirmAppartment.sendKeys(Name);
	}
	
	public void AddCity(String Name) {
		FirmCity.sendKeys(Name);
	}
	
	public void AddState() {
		FirmState.click();
	}
	
	public String AddChooseState() {
		String state=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[3]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).getText();
		FirmChooseState.click();
		return state;
	}
	
	public void AddZip(String Name) {
		FirmZip.sendKeys(Name);
	}
	
	public void AddPhone(String Name) {
		FirmPhone.sendKeys(Name);
	}
	
	public void AddExtension(String Name) {
		FirmExtension.sendKeys(Name);
	}
	
	public void AddCell(String Name) {
		FirmCell.sendKeys(Name);
	}
	
	public void AddFax(String Name) {
		FirmFax.sendKeys(Name);
	}
	
	public void AddEmail(String Name) {
		FirmEmail.sendKeys(Name);
	}
	
	public void AddFirstName(String Name) {
		PersonFirstName.sendKeys(Name);
	}
	
	public void AddMiddleName(String Name) {
		PersonMiddleName.sendKeys(Name);
	}
	
	public void AddLastName(String Name) {
		PersonLastName.sendKeys(Name);
	}
	
	public void AddPersonPhone(String Name) {
		 PersonPhone.sendKeys(Name);
	}
	public void AddPersonExtension(String Name) {
		 PersonExtension.sendKeys(Name);
	}
	
	public void AddPersonCell(String Name) {
		PersonCell.sendKeys(Name);
	}
	
	public void AddPersonFax(String Name) {
		PersonFax.sendKeys(Name);
	}
	
	public void AddPersonEmail(String Name) {
		PersonEmail.sendKeys(Name);
	}
	
	
	public void AddComments(String Name) {
		Comments.sendKeys(Name);
	}
	
	public void ClickSubmit() {
		Submit.click();
	}
	
	
	
	
	
	public void SearchFirmName(String FirmName) {
		FirmNameSearch.sendKeys(FirmName);
	}

	public void SearchLocationName(String Name) {
		FirmLocationSearch.sendKeys(Name);
	}
	
	public void SearchStreetName(String Name) {
		FirmStreetSearch.sendKeys(Name);
	}
	
	public void SearchCityName(String Name) {
		FirmCitySearch.sendKeys(Name);
	}
	
	public void ClickMoreFields() {
		MoreFieldsButton.click();
	}
	
	public void SearchStateName(String Name) {
		FirmStateSearch.sendKeys(Name);
	}
	
	public void SearchZip(String Name) {
		FirmZipSearch.sendKeys(Name);
	}
	
	public void SearchPhone(String Name) {
		FirmPhoneSearch.sendKeys(Name);
	}
	
	
	public void SearchFax(String Name) {
		FirmFaxSearch.sendKeys(Name);
	}
	
	public void SearchEmail(String Name) {
		 FirmEmailSearch.sendKeys(Name);
	}
	
	public void ClickFilter() {
		Filter.click();
	}
	
	public void ClickEdit() {
		EditFilter.click();
	}
	
	public void EditFirmName(String Name) {
		FirmNameEdit.sendKeys(Name);
	}
	
	public void ClickUpdate() {
		FirmEditUpdate.click();
	}
	
	public void ClickAddLocation() {
		FirmAddLocation.click();
	}
}
