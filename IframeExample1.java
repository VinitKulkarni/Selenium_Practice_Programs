import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");

        driver.manage().window().maximize();

        //1.Switch to iframe using name or id
        driver.switchTo().frame("a077aa5e");

        //2.now you are able to click on the image. bcz it is inside the iframe
        driver.findElement(By.xpath("//img")).click();
        
        Thread.sleep(10000);

        //3.go back to main page
        driver.switchTo().defaultContent();

        //Close browser
        //driver.quit();
    }
}
