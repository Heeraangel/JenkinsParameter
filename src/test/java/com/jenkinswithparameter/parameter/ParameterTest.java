package com.jenkinswithparameter.parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParameterTest {
		@Test
		public void parameterTest()
		{
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = null;
			String url=System.getProperty("url");
			String browser=System.getProperty("browser");
			switch(browser)
			{
				case "chrome":
					driver=new ChromeDriver(options);
					break;
				case "edge":
					driver=new EdgeDriver();
					break;
			}
			driver.get(url);
			System.out.println("Opened");
			driver.quit();
		}
}
