package Patient;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.PatientListObject;

public class PatientList extends base {
	///No need to change because can add the same patient again simple execute this script
	@Test(priority = 1)
	public void AddPatientList() throws Exception {
		Thread.sleep(3000);
		PatientListObject obj = PageFactory.initElements(driver,PatientListObject.class);
		Thread.sleep(5000);
		obj.ClickPatient();
		Thread.sleep(3000);
		obj.ClickPatientList();
		Thread.sleep(3000);
		obj.ClickAddNew();
		Thread.sleep(2000);
		obj.AddFirstName("Atiq");
		obj.AddMiddleName("Deline");
		obj.AddLastName("Raza");
		obj.SelectGender();
		obj.AddDOB("10211992");
		obj.AddSSN("321780225");
		obj.AddHomePhone("3217804455");
		obj.AddWorkPhone("0314335675");
		obj.AddCellPhone("0347865345");
		obj.AddEmail("atiq.r@ovada.com");
		obj.AddAddress("Phase6");
		obj.AddSuite("3rd");
		obj.AddCity("ABC");
		
		obj.ClickState();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	    
		obj.AddZip("54000");
		obj.ClickSave();
	   
	}
	
	@Test(priority = 2)
	public void FilterPatientList() throws Exception {
		Thread.sleep(3000);
		PatientListObject obj = PageFactory.initElements(driver,PatientListObject.class);
		Thread.sleep(5000);
		obj.ClickPatient();
		Thread.sleep(3000);
		obj.ClickPatientList();
		Thread.sleep(3000);
		String Charid=	driver.findElement(By.xpath("(//div[@class='datatable-body-cell-label']//a)[1]")).getText();
		System.out.println("Char id is here:"+Charid);
		obj.FilterCharid(Charid);
		obj.FilterPatientName("Atiq Deline Raza");
		obj.FilterDOB("10211992");
		obj.FilterPrimaryPhone("0347865345");
		obj.ClickFilter();	
	}
	
	@Test(priority = 3)
	public void EditPatientList() throws Exception {
		Thread.sleep(2000);
		PatientListObject obj = PageFactory.initElements(driver,PatientListObject.class);
		Thread.sleep(3000);
		obj.ClickEditIcon();
		Thread.sleep(3000);
		obj.ClearFirstName();
		obj.AddFirstName("Ali");
		obj.ClearMiddleName();
		obj.AddMiddleName("S");
		obj.ClearLastName();
		obj.AddLastName("r");
		obj.ClearDOB();
		obj.AddDOB("11111990");
		obj.ClearSSN();
		obj.AddSSN("321780000");
		obj.ClearHomePhone();
		obj.AddHomePhone("3317801100");
		obj.ClearWorkPhone();
		obj.AddWorkPhone("0334335000");
		obj.ClearCellPhone();
		obj.AddCellPhone("0247865000");
		obj.ClearEmail();
		obj.AddEmail("ali.r@ovada.com");
		obj.ClearAddress();
		obj.AddAddress("Abc");
		obj.ClearSuite();
		obj.AddSuite("2nd");
		obj.ClearCity();
		obj.AddCity("Test");
		obj.ClearZip();
		obj.AddZip("53000");
		obj.ClickSave();
	}

}
