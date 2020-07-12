package jenkin_pipeline.priyanka;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openBrowserTest {

	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
	}
}
