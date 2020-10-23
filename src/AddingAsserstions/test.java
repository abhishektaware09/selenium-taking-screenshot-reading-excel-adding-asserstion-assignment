package AddingAsserstions;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";


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
		String expectedTitle="Welcome to OpenClinic";
		String actualResult = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		
		assertEquals(expectedTitle,actualResult);
	}
	}