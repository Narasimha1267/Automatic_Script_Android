package SyraHealth;

import java.io.File;
import java.net.URI;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DataDriven extends Server
{
	@Test(dataProvider="getData")
	
	 public void Logins(String User,String Password) throws Exception, Throwable {
	    
		Driver.findElement(AppiumBy.className("android.widget.Button")).click();
		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText")).sendKeys(User);
		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText")).sendKeys(Password);
		Driver.findElement(AppiumBy.accessibilityId("password_image")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
		Thread.sleep(1000);
	}
	
	
		@DataProvider
		public Object [] [] getData()
		{
			 return new Object[] [] {{"nani0001@yopmail.com","Test@123"} };
		}
	
	}