package MyAppsTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MyGrid {
	
    public static void main(String[] args) {	
        try {
        	
        	//FirefoxOptions options = new FirefoxOptions();
            //URL url = new URL("http://20.40.56.250:4455/wd/hub");
        	ChromeOptions options = new ChromeOptions();
            URL url = new URL("http://localhost:4444/wd/hub");
            RemoteWebDriver driver = new RemoteWebDriver(url, options);
            driver.get("http://leaftaps.com/opentaps/");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    		
    		System.out.println("Page title is : " + driver.getTitle());
    	    		
    		driver.findElement(By.id("username")).sendKeys("Demo");
    		driver.findElement(By.id("password")).sendKeys("crmsfa");
    		Thread.sleep(5000);
    		driver.findElement(By.className("decorativeSubmit")).click();
    		driver.findElement(By.linkText("CRM/SFA")).click();
    		driver.findElement(By.linkText("Leads")).click();
    		driver.findElement(By.linkText("Create Lead")).click();
    		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
    		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
    		driver.findElement(By.name("submitButton")).click();
    		
    		 System.out.println("Page title is : " + driver.getTitle());

             // Get and print the browser version
             String browserVersion = driver.getCapabilities().getBrowserName();
             System.out.println("Browser Version: " + browserVersion);
    		driver.close();
        } catch (MalformedURLException e) {
            System. out.println("Invalid Selenium URL: " + e.getMessage());
        } catch (Exception e) {
            System. out.println("An error occurred: " + e.getMessage());
        }
    }
}
