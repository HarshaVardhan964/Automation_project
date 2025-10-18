package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	
	@Test
	public void createReport() {
		String time = LocalDateTime.now().toString().replace(":", "-");
		//step1 : create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ExtentReports_"+time+".html");
		
		//step2 : create ExtentReports object
		ExtentReports ereport = new ExtentReports();
		
		//step3 : attach ExtentSparkReporter to ExtentReports
		ereport.attachReporter(spark);
		
		//step4 : create ExtentTest object
		ExtentTest test = ereport.createTest("createReport");
		
		//step5 : call log(Status, "message")
		test.log(Status.PASS, "message added into report");
		
		//step6 : call flush()
		ereport.flush();
	}

}
