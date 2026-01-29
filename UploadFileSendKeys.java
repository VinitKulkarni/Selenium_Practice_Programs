package selenium.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSendKeys {
	public static void main(String args[]) throws InterruptedException {
		//this file upload will only work when [type=file]
		String filePath = "C:\\Users\\vinit\\OneDrive\\Desktop\\git.txt";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys(filePath);
		Thread.sleep(5000);
	}
}
