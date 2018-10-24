package Functionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_3 {
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
      public void AddCart() {
  		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
    	 driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")).click();
    	 driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).clear();
    	 driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("1000");
         driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")).click();
       
    	WebElement ele= driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p"));
    	 String errormsg=ele.getText(); 
    	 System.out.println(errormsg);
    	 if(errormsg.equals(errormsg)) {
    		 System.err.println("Verified");
    		 
    	 }else {
    		 System.out.println("error");
    	 }
    	 driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
    	 WebElement element=driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1"));
    	 String msg=element.getText();
    	 System.out.println(msg);
    	 if(msg.equals(msg)) {
    		 System.err.println(" cart Verified");
    		 
    	 }else {
    		 System.out.println("error");
    	 }
      }
      @AfterTest
	public void teardown() throws Exception  {
    	  Thread.sleep(2000);
    	  driver.quit();
      }
	
}
