package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\main\\java\\com\\config\\config.properties");
		prop.load(fin);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialize() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Course\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName.contentEquals("firefox")) {
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOADTIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
