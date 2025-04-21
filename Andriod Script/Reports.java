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

public class Reports extends Server
{
	@Test
	
	 public void LoginsReport() throws Exception, Throwable {
		
LoginB2B();
		
   findElementByIDs("com.android.permissioncontroller:id/permission_allow_button").click();
   findElementByXpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();

   
   findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[2]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView").click();	
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View").click();
   
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[1]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.TextView").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.widget.TextView").click();
   Thread.sleep(4000);
   ScrollToEndAction();
   findElementByAccessibilityId("tool_bar_icon").click();
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[1]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TextView").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.TextView").click();
   findElementByAccessibilityId("download_report_icon").click();
   Thread.sleep(4000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   //Insomnia
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[2]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.TextView").click();
   findElementByAccessibilityId("download_report_icon").click();
   Thread.sleep(4000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   //Depression
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[3]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.TextView").click();
   findElementByAccessibilityId("download_report_icon").click();
   Thread.sleep(4000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   //Anger
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[4]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.TextView").click();
   findElementByAccessibilityId("download_report_icon");
   Thread.sleep(4000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   //Anxiety
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[5]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.TextView").click();
   findElementByAccessibilityId("download_report_icon").click();
   Thread.sleep(4000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   
   //Substance use
   findElementByXpath("(//android.view.View[@content-desc=\"diary_history_right_arrow_icon\"])[6]").click();
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.TextView").click();
   findElementByAccessibilityId("download_report_icon").click();
   Thread.sleep(4000);
   findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
   findElementByAccessibilityId("tool_bar_icon").click();
   Thread.sleep(1000);
   
	}
}
		
		
		


		
		
		
		
		
		




















