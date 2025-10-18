package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void launch() {
		Reporter.log("SampleTest executed",true);
	}
	public void test(){
		WebDriver driver = new ChromeDriver();
	}
}


