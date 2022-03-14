package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	static ExtentReports extentReport = null;
	
	public static ExtentReports getExtentReport() {
		
		String extentReportPath = System.getProperty("user.dir")+"\\Reports\\ExtentReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("Apollo 24/7 - Automation Results Report");
		reporter.config().setDocumentTitle("Apollo 24/7 Report");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Project Name","Apollo 24/7");
		extentReport.setSystemInfo("Application Version","3.7.0");
		extentReport.setSystemInfo("Operating System","Windows 10");
		extentReport.setSystemInfo("Run By","Sanket Pande");
		
		
		return extentReport;
		
	}

}
