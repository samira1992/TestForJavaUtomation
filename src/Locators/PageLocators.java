package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLocators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\almira\\Desktop\\TestForJavaAtomation\\OLX-Locators\\executable\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("https://www.olx.ba/");
	      
	     
	      driver.findElement(By.id("piklogo"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"searchinput\"]"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"headergore\"]/div/div/div/ul/li[5]/a"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"mainsearch\"]/div/form/button"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.id("loginbtn"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/header/div/div[1]/div/div[3]/div/a[1]"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("/html/body/div[4]/div/h1"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"pocetna-meni-lijevo\"]/li[4]/a"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"pocetna-meni-lijevo\"]/li[7]/a"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@id=\"pocetna-meni-lijevo\"]/li[9]/a"));
	      Thread.sleep(3000);
	      
	      
	      driver.close();

	}
       

}
