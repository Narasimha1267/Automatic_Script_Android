package SyraHealth;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Server {
	
	public AndroidDriver Driver;
	public AppiumDriverLocalService S;
	
	@BeforeClass
	public void AppiumConfigure() throws MalformedURLException, URISyntaxException   {
		
		
		        S= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\VinceKramer\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();	
				S.start();
				
				UiAutomator2Options OP=new UiAutomator2Options();
				//OP.setDeviceName("Pixel 3a API 35");
				OP.setDeviceName("Nani");
				//OP.setDeviceName("Vivoy50 API 29");
				//OP.setDeviceName("Pixel Tablet API 35");
				//OP.setApp("C:\\Narasimha\\Andriod Script\\Syrenity App\\app-uat-dec-13.apk");
				OP.setApp("C:\\Narasimha\\Andriod Script\\Syrenity App\\app-lamda-uat-mar-25.apk");
				 Driver= new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), OP);
				 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
	}
	public void LoginB2B() throws InterruptedException
	{
		Driver.findElement(AppiumBy.className("android.widget.Button")).click();
		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText")).sendKeys("henrys@syrahealth.com");
		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText")).sendKeys("Password@123");
		Driver.findElement(AppiumBy.accessibilityId("password_image")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
		Thread.sleep(1000);
	}
	protected WebElement findElementByClass(String xp) {
		return Driver.findElement(AppiumBy.className(xp));	
	}
	protected WebElement findElementByAccessibilityId(String acid) {
		return Driver.findElement(AppiumBy.accessibilityId(acid));		
	}
	protected WebElement findElementByXpath(String xpath) {
		return Driver.findElement(By.xpath(xpath));
	}
	protected WebElement findElementByIDs(String ID) {
		return Driver.findElement(By.id(ID));
	}
	public void ScrollToEndAction()
	{
		
		 boolean canScrollMore = (Boolean) ((JavascriptExecutor) Driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 500, "top", 500, "width", 1000, "height", 1000,
			    "direction", "down",
			    "percent", 7.0
			));
		 
	}
public void ScrollToEndPoint()
{
    for (int i = 0; i < 8; i++) {
        ScrollToEndAction();
    }
}
public void NextPage()
{
    findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.widget.Button").click();
}

    public void ScrollToVertical()
    {
    WebElement Scorce=Driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[3]"));
((JavascriptExecutor) Driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		 "elementId", ((RemoteWebElement) Scorce).getId(),
		 "endX", 100,
		 "endY", 100
		 
		));
WebElement Scorce2=Driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[3]"));
((JavascriptExecutor) Driver).executeScript("mobile: dragGesture", ImmutableMap.of(
 "elementId", ((RemoteWebElement) Scorce2).getId(),
 "endX", 100,
 "endY", 100
));
WebElement Scorce3=Driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[3]"));
((JavascriptExecutor) Driver).executeScript("mobile: dragGesture", ImmutableMap.of(
 "elementId", ((RemoteWebElement) Scorce3).getId(),
 "endX", 100,
 "endY", 100
));
	
    }

			public void Pin1()
			{
				
				findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button\r\n").click();
	        }
			public void schedulenewActivity()
			{
				findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.widget.Button").click();
	        }
			
	
	@AfterClass
	public void close() throws Exception {
		Thread.sleep(2000);
		Driver.quit();
		S.stop();
	}

}
