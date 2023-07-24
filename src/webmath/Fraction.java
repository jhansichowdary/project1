package webmath;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fraction {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\seleniumdownloads\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			Properties prop = new Properties();
			

			FileInputStream Input = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice\\Webmath\\src\\webmath\\kmath.properties");
			prop.load(Input);
			String url = prop.getProperty("url");
			String kmath = prop.getProperty("kmath");
			String fraction = prop.getProperty("fraction");
			String fractionText1 = prop.getProperty("fractiontext1");
			String fractionText2 = prop.getProperty("fractiontext2");
			String fractionValue1 =prop.getProperty("fractiontextvalue");
			String fractionValue2 = prop.getProperty("fractiontextvalue2");
			
			
			driver.get(url);
			driver.findElement(By.xpath(kmath)).click();
			driver.findElement(By.xpath(fraction)).click();
			driver.findElement(By.xpath(fractionText1)).sendKeys(fractionValue1);
			driver.findElement(By.xpath(fractionText2)).sendKeys(fractionValue2);
			
		
			
			
			
			
			driver.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		

	}

}
