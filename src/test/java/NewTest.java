import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.qantasstore.com.au");
	//updating sample comment
	  driver.close();
  }
}
