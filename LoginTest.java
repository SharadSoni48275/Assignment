import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginTest {
	

	    WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("WebDriver.Chrome.Driver", "C:\\selenium web driver\\chromedriver_win32.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/login.php");
	    }

	    @Test
	    public void loginTest() {
	        
	        WebElement usernameField = driver.findElement(By.cssSelector("#email"));
	        WebElement passwordField = driver.findElement(By.cssSelector("div[class='_55r1 _1kbt']"));
	        WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));

	        
	        usernameField.sendKeys("sharad");
	        passwordField.sendKeys("123456");

	       
	        loginButton.click();
	        

	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}

