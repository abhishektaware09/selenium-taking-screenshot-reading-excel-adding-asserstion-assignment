package AddingAsserstions;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takingSc {
	
	WebDriver driver;
	String url="https://api.jquery.com/dblclick/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
	try {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File demo = new File("C:\\Users\\Abhishek\\Desktop\\SeleniumAssignment06.jpg");
		Files.copy(screenshot,demo);
	}catch (IOException e) {
		System.out.println("Message : "+e.getMessage());
	}
	}
}
