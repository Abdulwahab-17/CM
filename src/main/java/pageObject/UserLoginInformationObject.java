package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserLoginInformationObject {
	
	WebDriver driver;

	public UserLoginInformationObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Master')]") WebElement Master;
	public void ClickMaster() {
		Master.click();
	}
	
	@FindBy(how=How.XPATH, using = "//header[@id='header']/app-front-desk-navbar[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[3]/a[1]") WebElement User;
	public void ClickUser() {
		User.click();
	}

	@FindBy(how=How.XPATH, using = "//div[@class='d-block']//a[1]") WebElement AddNew;
	public void ClickAddNew() {
		AddNew.click();
	}
	
	@FindBy(how=How.ID, using = "FirstName") WebElement FirstName;
	public void AddFirstName(String name) {
		FirstName.sendKeys(name);
	}
	
	@FindBy(how=How.ID, using = "MiddleName") WebElement MiddleName;
	public void AddMiddleName(String name) {
		MiddleName.sendKeys(name);
	}
	@FindBy(how=How.ID, using = "LastName") WebElement LastName;
	public void AddLastName(String name) {
		LastName.sendKeys(name);
	}
	@FindBy(how=How.ID, using = "Email") WebElement Email;
	public void AddEmail(String name) {
		Email.sendKeys(name);
	}
	@FindBy(how=How.ID, using = "Password") WebElement Password;
	public void AddPassword(String name) {
		Password.sendKeys(name);
	}
	@FindBy(how=How.ID, using = "c_password") WebElement ConfirmPassword;
	public void AddConfirmPassword(String name) {
		ConfirmPassword.sendKeys(name);
	}
	@FindBy(how=How.XPATH, using = "//div[@class='ng-select-container']//span") WebElement RolesList;
	public void ClickRolesList() {
		RolesList.click();
	}
	@FindBy(how=How.XPATH, using = "//*[@id=\"p_practice\"]/div/span") WebElement PracticeList;
	public void ClickPracticeList() {
		PracticeList.click();
	}
	@FindBy(how=How.XPATH, using = "//*[@id=\\\"main\\\"]/perfect-scrollbar/div/div[1]/div/app-users/div/div/app-users-add/div/div/tabset/div/tab[1]/div/div/form/div[3]/div/button") WebElement Register;
	public void ClickRegister() {
		Register.click();
	}
}
