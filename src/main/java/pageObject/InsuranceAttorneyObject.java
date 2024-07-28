package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceAttorneyObject {

	WebDriver driver;
	
	public InsuranceAttorneyObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Insurance") WebElement Insurance;
	public void ClickInsurance() {
		Insurance.click();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using = "Attorney") WebElement Attorney;
	public void ClickAttorney() {
		Attorney.click();
	}
	
	@FindBy(how=How.XPATH, using = "//div[@class='ng-select-container']//span") WebElement FirmList;
	public void ClickFirmList() {
		FirmList.click();
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/app-root/app-wrapper/app-front-desk/div/main/perfect-scrollbar/div/div[1]/div/app-cases/app-case-edit/div/div/app-case-left-sidebar/div/div/div/app-case-insurance/div/app-attorney/div/div/div/app-attorney-form/div[2]/dynamic-form/form/app-div[2]/div/app-div/div/app-auto-complete/div/div/ng-select/div/span") WebElement AttorneyList;
	public void ClickAttorneyList() {
		AttorneyList.click();
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Save & Continue']") WebElement Save;
	public void ClickSave() {
		Save.click();
	}
	
}
