package configuration;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Basic {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void Browse()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ovadamd.org/front-desk");
	}
	
	/// Capturing the Screenshots of Fail test cases.
	public static void getScreenshot(String s) throws IOException {
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		/// Please just change the location where you want to save screenshots on your
		/// pc
		FileUtils.copyFile(scrfile, new File(("C:\\Users\\atiq.r\\Desktop\\Framework\\Screenshots\\") + s + ".png"));

	}

}
