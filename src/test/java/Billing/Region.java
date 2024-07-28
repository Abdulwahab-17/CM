package Billing;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.base;
import pageObject.RegionObject;

public class Region extends base {
	
	  /////Just change the edit test data//////////////Ok
	        String Name;
			@Test(priority = 1)
			public void AddRegion() throws Exception {
//				Thread.sleep(8000);
				RegionObject obj = PageFactory.initElements(driver,RegionObject.class);
				Thread.sleep(5000);
//				obj.ClickMaster();
//				Thread.sleep(4000);
//				obj.ClickBilling();
//				Thread.sleep(8000);
//				obj.ClickBill();
//				Thread.sleep(5000);
				obj.ClickRegion();
				Thread.sleep(3000);
				obj.ClickAddNewRegion();
				Thread.sleep(3000);
				Name=data.currency().code();
				obj.AddName(Name);
				obj.AddDescription("1111");
				obj.Addcomments("Testing");
				Thread.sleep(2000);
				obj.ClickSave();
				Thread.sleep(4000);
				String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
				System.out.println("here is result:"+Result);
				Assert.assertEquals(Result, "Success");
			}
			
			@Test(priority = 2)
			public void FilterRegion() throws Exception {
				Thread.sleep(2000);
				RegionObject obj = PageFactory.initElements(driver,RegionObject.class);
//				Thread.sleep(2000);
//				obj.ClickMaster();
//				Thread.sleep(4000);
//				obj.ClickBilling();
//				Thread.sleep(4000);
//				obj.ClickBill();
//				Thread.sleep(3000);
//				obj.ClickRegion();
				Thread.sleep(3000);
				obj.FilterName(Name);
				obj.FilterDescription("1111");
				obj.FilterComments("Testing");
				obj.ClickFilter();
			}
			
			@Test(priority = 3)
			public void EditRegion() throws Exception {
				Thread.sleep(8000);
				RegionObject obj = PageFactory.initElements(driver,RegionObject.class);
				Thread.sleep(2000);
				obj.ClickEdit();
				obj.ClearName();
				////just change the name here
				obj.EditName(data.currency().code());
				obj.ClearDescription();
				obj.EditDescription("8888");
				obj.ClearComments();
				obj.Editcomments("Testing");
				obj.ClickSubmit();
				Thread.sleep(4000);
				String Result=driver.findElement(By.xpath("//div[text()=' Success ']")).getText();
				System.out.println("here is result:"+Result);
				Assert.assertEquals(Result, "Success");
			}

}
