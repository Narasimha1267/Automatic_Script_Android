package SyraHealth;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class First {
	
	@Test
	
	 public void appiumF() throws Exception, Throwable {
		
		//Service Host
		AppiumDriverLocalService S= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\VinceKramer\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();	
		S.start();
		
		UiAutomator2Options OP=new UiAutomator2Options();
		OP.setDeviceName("Pixel 3a API 35");
		OP.setApp("C:\\Narasimha\\Andriod Script\\Syrenity App\\app-uat.apk");
		
		AndroidDriver D= new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), OP);
		D.quit();
		S.stop();
	}

}
