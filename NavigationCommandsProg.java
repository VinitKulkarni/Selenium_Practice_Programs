import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsProg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(1000);
        
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(1000);
        
        driver.navigate().to("https://www.redbus.in/");
        Thread.sleep(1000);
        
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);        
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        
        String TitleOfThePage = driver.getTitle();
        System.out.println(TitleOfThePage);
        
        String UrlOfCurrentPage = driver.getCurrentUrl();
        System.out.println(UrlOfCurrentPage);
        
        driver.quit();
	}
}
