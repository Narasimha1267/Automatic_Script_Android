
package SyraHealth;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
//import io.appium.java_client.appiumDriver;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;


public class Profile extends Server
{
	@Test
	
	 public void SignnewProfile() throws InterruptedException {
		
		LoginB2B();
		
	    findElementByIDs("com.android.permissioncontroller:id/permission_allow_button").click();
	    findElementByXpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button").click();
	    findElementByAccessibilityId("tool_bar_icon").click();
	    
	    
        findElementByXpath("(//android.view.View[@content-desc=\"drawer_icon\"])[1]").click();
        findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[1]").click();
        findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
        
        
        findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[2]").click();
        findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[3]").click();
	    
	    
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]/android.widget.TextView").click();
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[4]").click();
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[7]").click();
	    
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[5]").click();
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[6]").click();
	    
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[7]").click();
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]\r\n").click();
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[8]").click();
	    String Test=findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[6]/android.widget.TextView").getText();
	    System.out.println("Value:"+Test);
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[6]/android.widget.TextView").click();
	    ScrollToEndAction();
	    
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[4]").click();
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
	    
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[5]").click();
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
	    
	    findElementByXpath("(//android.view.View[@content-desc=\"profile_drop_down_icon\"])[6]").click();
	    findElementByXpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView").click();
	    ScrollToEndAction();
	    
	    
//	    findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[5]/android.view.View[2]/android.widget.Button").click();
//	    Thread.sleep(1000);
//        findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.widget.EditText/android.view.View/android.widget.TextView").sendKeys("Testing");
//	    findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.widget.EditText/android.view.View/android.view.View[1]/android.widget.Button").click();
//	    
	    findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[6]/android.view.View").click();
	    findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[7]/android.widget.Button").click();
	    Thread.sleep(3000);
	    findElementByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button").click();
	    
	}

}
