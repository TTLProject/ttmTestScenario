package Functionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day_2 
{
	@Test
	public void sonyXperia_cost()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.manage().window().maximize();
		System.out.println("browser maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Mobile")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
		WebElement cost =driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
		String s =cost.getText();
		System.out.println(s);
		driver.findElement(By.xpath("//*[@id=\"product-collection-image-1\"]")).click();
		WebElement detail =driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[1]/span"));
		String s1=mobile.getText();
		System.out.println(s1);
		if(s.equalsIgnoreCase(detail.getText()))
	    {
			System.out.println("both are equal");
	    }
		else
		{
			System.out.println("not equal...");
		}
	}
      
	
}
