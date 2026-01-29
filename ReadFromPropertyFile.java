package DemoTest.Test1;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromPropertyFile {
	//fetching data from data.properties file in the program
	public static void main(String args[]) throws IOException {
		Properties props = new Properties();
		FileInputStream reader = new FileInputStream("C:\\Users\\vinit\\eclipse-workspace\\Test1\\src\\test\\java\\DemoTest\\Test1\\data.properties");
		props.load(reader);
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(props.getProperty("URL"));
        
        String actualTitle = props.getProperty("Title");
        String expectedTitle = driver.getTitle();
        
        assertEquals(actualTitle, expectedTitle);
	}
}
