package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeMethod;
//
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.ApolloAppointmentsPage;
import pageobjects.ApolloHomePage;
import pageobjects.ApolloSpecialitiesPage;

public class ApolloBase {
	
//	public WebDriver driver = null;
	public Properties prop = null;
	
	public String takeScreenshotHere(String testName, WebDriver driver) {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destFilePath = System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
		try {
			FileHandler.copy(srcFile,new File(destFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return destFilePath;
			
	}
	
	public void loadproperties() {
		
		prop = new Properties();
		
		try {
			prop.load(new FileInputStream (new File("./src/test/java/Files/Projectdata1.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
//	public void GetLogin() {
//			
//			ApolloHomePage homepage = new ApolloHomePage(driver);
//			
//			homepage.ClickonProfileButton();
//			homepage.EnterMobileNumber(prop.getProperty("mobilenumber"));
//			
//			homepage.ClickonLoginButton();
//	
//			try {
//				Thread.sleep(20000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			homepage.ClickonLoginButton();
//			
//			
//		}
	
	public WebDriver Initializebrowser(String browsername, WebDriver driver) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		}else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browsername.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else if(browsername.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get(prop.getProperty("url"));
		
//		driver.switchTo().frame("wiz-iframe-intent");
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"close\"]")));
//		
//		driver.findElement(By.xpath("//span[@class=\"close\"]")).click();
//		
//		driver.switchTo().defaultContent();
		
		return driver;	
	}
	
	public String generateTimeStamp() {
		Date date = new Date();
		String timestamp = date.toString().replace(" ", "_").replace(":","_");
		return timestamp;
	}
	
}
