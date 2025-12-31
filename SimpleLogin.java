package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.practicetestautomation.com/practice-test-login/");
	    System.out.println("URL LAUNCHED");
	    Thread.sleep(2000);
	    
	    //Enter username
        driver.findElement(By.id("username")).sendKeys("student");
        
        //Enter password
        driver.findElement(By.id("password")).sendKeys("Password123");
        
        //Click Login button
        driver.findElement(By.id("submit")).click();

        driver.quit();
        System.out.println("LOGIN SUCCESSFUL");
	}
}
