package com.qa.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript
{
	public static WebDriver driver;
	Properties prop;
	
	public DriverScript()
	{
		try
		{
			File src = new File("./acnofig/config.properties");
			FileInputStream fis = new FileInputStream(src);
			 prop = new Properties();	
		prop.load(fis);
			
		}
	catch(Exception e)
		{
		System.out.println("Unable to load the file "+e.getMessage());
		
	}
	}
	
	
	public void initApplication()
	{
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))

{
	System.setProperty("webdriver.chrome.driver","./acbrowsers/chromedriver.exe");
	driver = new ChromeDriver();
}
		else	if (browser.equalsIgnoreCase("Firefox"))

		{
			System.setProperty("webdriver.gecko.driver","./acbrowsers/geckodriver.exe");
			driver = new FirefoxDriver();
		
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url = prop.getProperty("qaurl");
		driver.get(url);
}
	public void closeApplication()
	{
		driver.close();
	}
   }
