package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PlanNameObject {

	
	WebDriver driver;

	public PlanNameObject(WebDriver driver) {
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
	
	@FindBy(how = How.LINK_TEXT, using = "Plan Name") WebElement  PlanName;
	public void ClickPlanName() {
		PlanName.click();
	}
	
	
	@FindBy(how=How.XPATH, using = "//button[text()='Add New ']") WebElement AddNew;
	public void ClickAddNew() {
		AddNew.click();
	}
	
	@FindBy(how=How.XPATH, using = "(//input[@formcontrolname='plan_name'])[2]") WebElement Name;
	public void ClearName() {
		Name.clear();
	}
	public void AddName(String name) {
		Name.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//textarea[@formcontrolname='comments']") WebElement Comments;
	public void ClearComments() {
		Comments.clear();
	}
	public void AddComments(String name) {
		Comments.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save']") WebElement Save;
	public void ClickSave() {
		Save.click();
	}
	////////////////////////////////Filter/////////////////////////////////////////////
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='plan_name']") WebElement NameFilter;
	public void FilterName(String name) {
		NameFilter.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='comments']") WebElement CommentsFilter;
	public void FilterComments(String name) {
		CommentsFilter.sendKeys(name);
	}

	@FindBy(how=How.XPATH, using = "//button[text()=' Filter ']") WebElement Filter;
	public void ClickFilter() {
		Filter.click();
	}
	
}
