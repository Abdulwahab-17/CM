package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceMedicalTreatmentObject {
	
	WebDriver driver;
	
	public InsuranceMedicalTreatmentObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Insurance") WebElement Insurance;
	public void ClickInsurance() {
		Insurance.click();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using = "Medical Treatment") WebElement MedicalTreatment;
	public void ClickMedicalTreatment() {
		MedicalTreatment.click();
	}
	

}
