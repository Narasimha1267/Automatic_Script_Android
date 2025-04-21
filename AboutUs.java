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

public class AboutUs extends Server
{
	@Test
	
	 public void LoginsReport() throws Exception, Throwable {
		
LoginB2B();
		
   findElementByIDs("com.android.permissioncontroller:id/permission_allow_button").click();
   findElementByXpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   
   findElementByXpath("(//android.view.View[@content-desc=\"menu_icon\"])[2]").click();
   findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[6]").click();
   ScrollToEndAction();
   
   findElementByAccessibilityId("tool_bar_icon").click();
   findElementByXpath("//android.view.View[@content-desc=\"tool_bar_icon\"]").click();
   
   findElementByXpath("(//android.view.View[@content-desc=\"menu_icon\"])[2]").click();
   findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[7]").click();
   Thread.sleep(5000);
   
   findElementByAccessibilityId("tool_bar_icon").click();
   //p
   findElementByXpath("//android.view.View[@content-desc=\"tool_bar_icon\"]").click();
   findElementByXpath("(//android.view.View[@content-desc=\"menu_icon\"])[2]").click();
   
   findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[8]").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   //p
   findElementByXpath("//android.view.View[@content-desc=\"tool_bar_icon\"]").click();
   findElementByXpath("(//android.view.View[@content-desc=\"menu_icon\"])[2]").click();
   findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[9]").click();
   
   findElementByXpath("//android.view.View[@content-desc=\"tool_bar_icon\"]").click();
	}
	
}