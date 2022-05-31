package com.jenkinswithparameter.parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParameterTest {
		@Test
		public void parameterTest()
		{
			WebDriver driver = null;
			String url=System.getProperty("url");
			String browser=System.getProperty("browser");
			switch(browser)
			{
				case "chrome":
					driver=new ChromeDriver();
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
