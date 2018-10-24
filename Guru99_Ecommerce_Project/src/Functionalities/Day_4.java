package Functionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_4 {
	 WebDriver driver;
     @BeforeTest
	public void setup() {
   	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
 		 driver=new ChromeDriver();
 		driver.get("http://live.guru99.com/index.php/");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
     @Test
     public void CompareTwoProduct() {
   		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
   		//Add to compare sony xperia
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
        //Add to compare on iphone
    	 driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > ul > li:nth-child(2) > a")).click();
    	 //click on compare
    	 driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button/span/span")).click();
    	 // switching to new window
    	Actions act=new Actions(driver);
    	
     }
     @AfterTest
 	public void teardown() throws Exception  {
     	  Thread.sleep(2000);
     	  driver.quit();
       }
}
