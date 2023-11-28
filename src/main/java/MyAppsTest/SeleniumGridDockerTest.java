package MyAppsTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDockerTest {

    public static void main(String[] args) throws MalformedURLException {
        // Define the desired capabilities for the browser and platform
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.ANY);

            // Specify the URL of the Selenium Grid hub
            String SeleniumGridUrl = "http://20.40.56.250:4444/wd/hub"; // Replace with your actual hub URL

            // Create a RemoteWebDriver instance to connect to the hub
            RemoteWebDriver driver = new RemoteWebDriver(new URL(SeleniumGridUrl), capabilities);

            // Navigate to Google.com
            driver.get("https://www.google.com");
            
            //orint title
            System.out.println("Page title is : " + driver.getTitle());

            // Get and print the browser version
            String browserVersion = driver.getCapabilities().getBrowserName();
            System.out.println("Browser Version: " + browserVersion);

            // Close the browser
            driver.quit();
      
    }
}
