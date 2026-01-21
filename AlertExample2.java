package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//added in github
public class AlertExample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		
		
		// ### Case 1: This tests alerts: click me (with value) ###
		driver.findElement(By.xpath("//a[@id='alert']")).click();
		System.out.println("Default value:" + driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept(); 
		driver.switchTo().alert().dismiss();
		
		
		
		// ### Case 2: This tests alerts: click me ###
		driver.findElement(By.xpath("//a[@id='empty-alert']")).click();
        driver.switchTo().alert().accept();
		
        
        
        // ### Case 3: Let's make the prompt happen ###
        driver.findElement(By.xpath("//a[@id='prompt']")).click();
        driver.switchTo().alert().sendKeys("Vinit");
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        
        
        
        // ### Case 4:Let's make the prompt with default happen ###
        driver.findElement(By.xpath("//a[@id='prompt-with-default']")).click();
        driver.switchTo().alert().sendKeys("djklfdjskaf");
        driver.switchTo().alert().accept();
        // Get the entered text for verification
        String enterdValue = driver.findElement(By.xpath("//div[@id='text']")).getText();
        System.out.println("override the default value is:" + enterdValue);
        
        
        
        // ### Case 5: Let's make TWO prompts happen ###
        driver.findElement(By.xpath("//a[@id='double-prompt']")).click();
        String firstPromptValue = driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("Vinit");
        driver.switchTo().alert().accept();
        
        String secondPromptValue = driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("Kulkarni");
        driver.switchTo().alert().accept();
        
        // Get the entered text for verification
        String value1 = driver.findElement(By.xpath("//div[@id='text1']")).getText();
        System.out.println(firstPromptValue + ":" + value1);
        
        String value2 = driver.findElement(By.xpath("//div[@id='text2']")).getText();
        System.out.println(secondPromptValue + ":" + value2);
        
        driver.quit();
	}
}
