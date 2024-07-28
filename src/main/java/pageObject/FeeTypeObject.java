package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeeTypeObject {

	WebDriver driver;

	public FeeTypeObject(WebDriver driver) {
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


	@FindBy(how = How.LINK_TEXT, using = "Codes") WebElement codes;
	public void ClickCodes() {
		codes.click();
	}

	@FindBy(how = How.LINK_TEXT, using = "Fee Type") WebElement FeeType;
	public void ClickFeeType() {
		FeeType.click();
	}

	@FindBy(how = How.XPATH, using = "(//a[@data-toggle='modal'])[1]") WebElement NewFeeTypeAdd;
	public void ClickAddNewFeeType() {
		NewFeeTypeAdd.click();
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='name'])[2]") WebElement NameAdd;
	public void AddName(String name) {
		NameAdd.sendKeys(name);
	}


	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='description']") WebElement DescriptionAdd;
	public void AddDescription(String name) {
		DescriptionAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']") WebElement CommentsAdd;
	public void Addcomments(String name) {
		CommentsAdd.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[3]") WebElement Save;
	public void ClickSave() {
		Save.click();
	}

	///////////////////////////////////////////Filter///////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='name']") WebElement NameFilter;
	public void FilterName(String name) {
		NameFilter.sendKeys(name);
	}
	//////////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='description']") WebElement DescriptionFilter;
	public void FilterDescription(String name) {
		DescriptionFilter.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='comments']") WebElement CommentsFilter;
	public void FilterComments(String name) {
		CommentsFilter.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "//button[text()=' Filter ']") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}

	///////////////////////////////////////Edit////////////////////////////////////////////
	@FindBy(how=How.XPATH, using = "(//a[@role='button']//i)[1]") WebElement Edit;
	public void ClickEdit() {
		Edit.click();
	}

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='name'])[2]") WebElement FeeNameEdit;
	public void ClearFeeName() {
		FeeNameEdit.clear();
	}
	public void EditFeeName(String name) {
		FeeNameEdit.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='description']") WebElement DescriptionEdit;
	public void ClearDescription() {
		DescriptionEdit.clear();
	}
	public void EditDescription(String name) {
		DescriptionEdit.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']") WebElement CommentsEdit;
	public void ClearComments() {
		CommentsEdit.clear();
	}
	public void Editcomments(String name) {
		CommentsEdit.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "(//button[@type='submit'])[3]") WebElement Submit;
	public void ClickSubmit() {
		Submit.click();
	}





}
