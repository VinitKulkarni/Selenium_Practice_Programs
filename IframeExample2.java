import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IframeExample2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//open the web page
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// now first you find out the id of the iframe which you want to go inside
		//id = "singleframe"
		// now you switch from main frame to child frame
		driver.switchTo().frame("singleframe");
		
		//add the data to child frame text box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("good");
		
		//return to parent frame or one step up
		driver.switchTo().parentFrame();
		
		//select the nested frame button
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		//no id for this frame. so use webelement to switch to child frame
		WebElement outerFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerFrame);
		
		// switch from child frame to inner frame
		WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wooow");
		
		
		// one step up. now you are in outer frame
		driver.switchTo().parentFrame();
		
		// to validate the outer frame name
		String outerFrameValue = driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText();
		System.out.println("Outer Frame Name:" + outerFrameValue);
		
		
		//now you are in main page frame
		driver.switchTo().parentFrame(); //or use driver.switchTo().defaultContent();
		
		
		//now you can do click on button to verify you are in main page
		driver.switchTo().frame("singleframe");
		String singleIframValue = driver.findElement(By.xpath("/html/body/section/div/h5")).getText();
		System.out.println("Single Frame Name: " + singleIframValue);	
	}
}
