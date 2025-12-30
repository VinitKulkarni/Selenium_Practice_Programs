// working with browser and open the url
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.close();
	}
}
