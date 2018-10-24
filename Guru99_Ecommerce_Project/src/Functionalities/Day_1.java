package Functionalities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day_1 {

	@Test
	public void Verifying_MobileNames() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String Title=driver.getTitle();
        if(driver.getTitle().equalsIgnoreCase(Title)) {
        	System.out.println("Title matched");
        	
        }else {
        	System.out.println("Title not matched expected title is"+driver.getTitle());
        }
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
        driver.getTitle();
        WebElement element=driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
        Select sel=new Select(element);
        sel.selectByIndex(1);
        List<WebElement> names =driver.findElements(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li/a"));
      //  System.out.println(names.size());
        String[] s = new String[names.size()];
        for(int i=0;i<=names.size();i++)
        {
        	s[i] = names.get(i).getAttribute("title");
        	
        
        }
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("IPhone");
        al.add("Samsung Galaxy");
        al.add("Sony Xperia");
        
        
       // System.out.println(al);
      //System.out.println( s.equalsIgnoreCase(al.toString()));
        
        
        
	}
	
	
}
