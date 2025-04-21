package SyraHealth;

import java.io.File;
import java.net.URI;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Login extends Server
{
	@Test
	
	 public void Logins() throws Exception, Throwable {
	    
		Driver.findElement(AppiumBy.className("android.widget.Button")).click();
		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText")).sendKeys("nani0001@yopmail.com");
		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText")).sendKeys("Test@123");
		Driver.findElement(AppiumBy.accessibilityId("password_image")).click();
		Thread.sleep(9000);
		Driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
		Thread.sleep(3000);
		
		
	}
}
		
		
		


		
		
		
		
		
		




















