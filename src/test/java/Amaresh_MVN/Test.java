package Amaresh_MVN;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	@org.testng.annotations.Test
	public void openApp(){
		System.setProperty("webdriver.firefox.marionette", "D:Selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		
	}

}
