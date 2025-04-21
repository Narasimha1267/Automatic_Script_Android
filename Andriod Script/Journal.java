package SyraHealth;

import java.awt.Desktop.Action;
import java.io.File;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Journal extends Server
{
	@Test
	
	 public void AskEcho() throws Exception, Throwable {
		
LoginB2B();
		
   findElementByIDs("com.android.permissioncontroller:id/permission_allow_button").click();
   findElementByXpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button").click();
   
   
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]").click();
   findElementByAccessibilityId("guardian_info_icon").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button").click();
   
   findElementByAccessibilityId("Previous Entry Icon").click();
   Thread.sleep(2000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button").click();
   
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText").sendKeys("Hello");
   findElementByXpath("(//android.view.View[@content-desc=\"Ask Syra\"])[2]").click();
   Thread.sleep(3000);
   findElementByAccessibilityId("done_icon").click();
   
   findElementByAccessibilityId("tool_bar_icon").click();
   findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[2]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView").click();
   findElementByAccessibilityId("diary_history_right_arrow_icon").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.TextView").click();	
	
   findElementByAccessibilityId("download_report_icon").click();
   
   //Open
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button").click();
   Thread.sleep(5000);
   //close
   //findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}