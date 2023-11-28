package MyAppsTest;

 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 

public class AbhiBus {

 

    public static void main(String[] args) throws InterruptedException {
    	
    	//Launch browser
    	
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser   
        driver.manage().window().maximize();
        
        // Load the url
        driver.get("https://www.abhibus.com/");
        
        // Add implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Actions act = new Actions(driver);
        
        // Click on the bus
        driver.findElement(By.id("pills-home-tab")).click();
        
        // Type from in chennai
        driver.findElement(By.id("source")).sendKeys("chennai");
        // Choose first result in the suggestion
        driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
        
        // Type bangalore
        driver.findElement(By.id("destination")).sendKeys("Bangalore");
        //Choose first result in the suggestion
        driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
        
        // Click on the date of journey
        driver.findElement(By.id("datepicker1")).click();
        // Choose the tomorrow date
        driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
        
        // Click on the search bus button
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        
        // Print first resulting bus
        String text = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();
        System.out.println(text);
        
        // Click sleeper on the bus type
        driver.findElement(By.id("Bustypes4")).click();
        
        // No of seats available in the first resulting bus
        String text2 = driver.findElement(By.xpath("//p[@class='noseats AvailSts ng-binding']")).getText();
        System.out.println(text2);
        
        // Click on select seat
        driver.findElement(By.xpath("//span[@class='book']")).click();
        
        //Select available seat
        driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
        
        // print selected seat number
        String text3 = driver.findElement(By.id("seatnos")).getText();
        System.out.println(text3);
        
        // print ticket fare
        String text4 = driver.findElement(By.id("ticketfare")).getText();
        System.out.println(text4);
//        Thread.sleep(2000);
        
        // Choose boarding point
        WebElement drop1 = driver.findElement(By.id("boardingpoint_id"));
        Select board =new Select(drop1);
        board.selectByIndex(1);
        
        // Choose dropping point
        WebElement drop2 = driver.findElement(By.id("droppingpoint_id"));
        Select dropping =new Select(drop2);
        dropping.selectByIndex(1);
        
        // Print the title
        System.out.println(driver.getTitle());
        
        // close the browser
        driver.close();
    }

 

}