package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AttorneyObject {

	WebDriver driver;

	public AttorneyObject(WebDriver driver) {
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


	@FindBy(how = How.LINK_TEXT, using = "Attorney") WebElement Attorney;
	public void ClickAttorney() {
		Attorney.click();
	}


	@FindBy(how = How.XPATH, using = "//a[@href='/front-desk/masters/billing/attorney/attorney']") WebElement SubAttorney;
	public void ClickSubAttorney() {
		SubAttorney.click();
	}

	@FindBy(how=How.XPATH, using = "//button[text()=' Add New ']") WebElement AddNew;
	public void ClickAddNew() {
		AddNew.click();
	}

	@FindBy(how=How.XPATH, using = "(//div[@class='ng-select-container']//span)[1]") WebElement FirmList;
	public void ClickFirmList() {
		FirmList.click();
	}

	@FindBy(how=How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]") WebElement ChooseList;
	public String ClickChooseFirm() {
		String Firm=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/form/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).getText();
		ChooseList.click();
		return Firm;
	}

	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='first_name'])[1]") WebElement FirstName;
	public void ClearFirstName() {
		FirstName.clear();
	}
	public void AddFirstName(String name) {
		FirstName.sendKeys(name);
	}

	
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='middle_name'])[1]") WebElement MiddleName;
	public void ClearMiddleName() {
		MiddleName.clear();
	}
	public void AddMiddleName(String name) {
		MiddleName.sendKeys(name);
	}


	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='last_name'])[1]") WebElement LastName;
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


	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='suit_floor']") WebElement Suite;
	public void ClearSuite() {
		Suite.clear();
	}
	public void AddSuite(String name) {
		Suite.sendKeys(name);
	}
	//////////////////////////////////////////////////////////////////////////////////////
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

	@FindBy(how=How.XPATH, using = "(//div[@role='option'])[1]") WebElement ChooseState;
	public String ClickChooseState() {
		String state=driver.findElement(By.xpath("(//div[@role='option'])[1]")).getText();
		ChooseState.click();
		return state;
	}

	///////////////////////////////////////////////////////////////////////////////////
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


	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='cell_no'])[1]") WebElement Cell;
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
	/////////////////////////////////////////////////////////////////////////////////////////

	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='first_name'])[2]") WebElement PersonFirstName;
	public void ClearPersonFirstName() {
		PersonFirstName.clear();
	}
	public void AddPersonFirstName(String name) {
		PersonFirstName.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='middle_name'])[2]") WebElement PersonMiddleName;
	public void ClearPersonMiddleName() {
		PersonMiddleName.clear();
	}
	public void AddPersonMiddleName(String name) {
		PersonMiddleName.sendKeys(name);
	}


	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='last_name'])[2]") WebElement PersonLastName;
	public void ClearPersonLastName() {
		PersonLastName.clear();
	}
	public void AddPersonLastName(String name) {
		PersonLastName.sendKeys(name);
	}


	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='phone_no'])[3]") WebElement PersonPhone;
	public void ClearPersonPhone() {
		PersonPhone.clear();
	}
	public void AddPersonPhone(String name) {
		PersonPhone.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='extension']") WebElement PersonExtension;
	public void ClearPersonExtension() {
		PersonExtension.clear();
	}
	public void AddPersonExtension(String name) {
		PersonExtension.sendKeys(name);
	}


	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='cell_no'])[2]") WebElement PersonCell;
	public void ClearPersonCell() {
		PersonCell.clear();
	}
	public void AddPersonCell(String name) {
		PersonCell.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='fax'])[3]") WebElement PersonFax;
	public void ClearPersonFax() {
		PersonFax.clear();
	}
	public void AddPersonFax(String name) {
		PersonFax.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='email'])[3]") WebElement PersonEmail;
	public void ClearPersonEmail() {
		PersonEmail.clear();
	}
	public void AddPersonEmail(String name) {
		PersonEmail.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "//textarea[@formcontrolname='comments']") WebElement Comments;
	public void ClearComments() {
		Comments.clear();
	}
	public void AddPersonComments(String name) {
		Comments.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[4]") WebElement Submit;
	public void ClickSubmit() {
		Submit.click();
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='firm_name']") WebElement FirmNameFilter;
	public void FilterFirmName(String name) {
		FirmNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='name']") WebElement AttorneyNameFilter;
	public void FilterAttorneyName(String name) {
		AttorneyNameFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='phone_no']") WebElement PhoneNoFilter;
	public void FilterPhoneNo(String name) {
		PhoneNoFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='email']") WebElement EmailFilter;
	public void FilterEmail(String name) {
		EmailFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//input[@formcontrolname='fax']") WebElement FaxFilter;
	public void FilterFax(String name) {
		FaxFilter.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[3]") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//a[@role='button']//i)[1]") WebElement Edit;
	public void ClickEditIcon() {
		Edit.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[@class='ng-select-container ng-has-value']//span)[5]") WebElement EditFirmList;
	public void ClickEditFirmList() {
		EditFirmList.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//div[@role='option']//span)[2]") WebElement EditChooseFirm;
	public void ClickEditChooseFirm() {
		EditChooseFirm.click();
	}
	
	
}
