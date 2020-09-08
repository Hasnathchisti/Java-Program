import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kriks\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		
	}

}
