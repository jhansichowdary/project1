package webmath;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kmath {

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
			String add = prop.getProperty("add");
			String addText1 = prop.getProperty("addtext1");
			String addText2 = prop.getProperty("addtext2");
			String addTextValue1 = prop.getProperty("add_text_value");
			String addTextValue2 = prop.getProperty("add_text_value1");
			String addButton = prop.getProperty("add_button");
			String subText1 = prop.getProperty("subtext1");
			String subText2 = prop.getProperty("subtext2");
			String subValue1 =prop.getProperty("sub_value1");
			String subValue2 = prop.getProperty("sub_value2");
			String sub_button = prop.getProperty("sub_button");
			driver.get(url);
			driver.findElement(By.xpath(kmath)).click();
			driver.findElement(By.xpath(add)).click();
			driver.findElement(By.xpath(addText1)).sendKeys(addTextValue1);
			driver.findElement(By.xpath(addText2)).sendKeys(addTextValue2);
			driver.findElement(By.xpath(addButton)).click();
			driver.navigate().back();
			driver.findElement(By.xpath(subText1)).sendKeys(subValue1);
			driver.findElement(By.xpath(subText2)).sendKeys(subValue2);
			driver.findElement(By.xpath(sub_button)).click();
			driver.navigate().back();
			
			
			
			
		
			
			
			
			
			driver.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	
		

	}

}
