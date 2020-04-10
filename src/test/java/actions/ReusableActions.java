package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableActions {
	
	static WebDriver driver=null; 
	
	 
	static{
		launch();
	}
	
	/**
	 * @Description: this method returns the driver objects
	 * @return
	 */
	 
	public static WebDriver driver(){
		return driver;
	}
	
	/**
	 * @Description: this method launches the browser and navigates to the provided URL
	 */
	public static void launch(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	
	public void teardown(){
		driver.quit();
	}

}
