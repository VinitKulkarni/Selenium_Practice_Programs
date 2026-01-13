import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This program will handle 1 window and 1 tab and play with it
public class WinTabExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		//to get the current window id
		String mainPageWinId = driver.getWindowHandle();
		System.out.println("main page id:" + mainPageWinId);
		
		//new window is opened & you are in the new window
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		//get back to main page window
		driver.switchTo().window(mainPageWinId);
		
		//new tab is opened & you are in the new tab
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		//now total 3 handles 1.main window 2.child window 3.child tab
		//get all the ids
		
		Set<String> allIds = driver.getWindowHandles();
		for(String win: allIds) {
			//System.out.println(win);
			String title = driver.switchTo().window(win).getTitle();
			System.out.println("Title of The page:" + title);
			
			String url = driver.getCurrentUrl();
			System.out.println("Url of the page:" + url);
			
			
			if(url.equals("https://www.letskodeit.com/courses")) {
				System.out.println("now you are in this window");
				break;
			}else {
				driver.switchTo().window(mainPageWinId);
			}
		}
		//driver.quit();
	}
}
