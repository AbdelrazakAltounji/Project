package testing;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.junit.Test;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.Console;

import java.net.MalformedURLException;



public class test {
	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public static String url = "http://localhost:4445/wd/hub";
	public static void main(String[] args) throws InterruptedException{
	
		//Test_ID="16399591";
	
	System.setProperty("webdriver.gecko.driver","C:\\Abdelrazak\\geckodriver.exe");
   // WebDriver driver = new FirefoxDriver();

	
	FirefoxOptions options = new FirefoxOptions();
	try {
	driver.set(new RemoteWebDriver(new URL(url), options));}catch (MalformedURLException e) {
        e.printStackTrace();
    }
	
	
	WebDriver webdriver = driver.get();
    webdriver.navigate().to("https://www.facebook.com");
    webdriver.manage().window().maximize();
    //webdriver.manage().window().maximize();
    System.out.println("Started session");
	//driver.get("https://www.google.com/");
    //String status_du_test="0";
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Thread.sleep(1000);
    
    //json_str = "{" + " \"data\" : { \"type\" : \"instances\", \"attributes\" : {" + "\"instance-id\":"+ Test_ID +",\"exit-code\": " + status_du_test +  ",\"automated-execution-output\": \"THIS IS MY OUTPUT\" }}}";
    //System.out.println(json_str);
    
    //webdriver.quit();

	
}
}
