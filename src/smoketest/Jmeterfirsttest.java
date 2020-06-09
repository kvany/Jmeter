package smoketest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jmeterfirsttest {
	WebDriver driver = null;


@Before

public void beforetest() {
	System.out.println("Before Test");
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}

@After
public void aftertest() {
	System.out.println("After Test");
}

@Test

public void test1() {
	  driver.get("https://www.google.com/"); 
	  driver.close();
}

@Test

public void test2() {
	  driver.get("https://www.yahoo.com/"); 
	  driver.close();
}
}
