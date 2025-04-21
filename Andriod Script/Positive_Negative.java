package SyraHealth;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.poi.xssf.usermodel.*
;

public class Positive_Negative extends Server
{
	@Test
	
	 public void povN() throws Exception, Throwable {
	    
//		Driver.findElement(AppiumBy.className("android.widget.Button")).click();
//		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText")).sendKeys("nani0001@yopmail.com");
//		Driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText")).sendKeys("Test@123");
//		Driver.findElement(AppiumBy.accessibilityId("password_image")).click();
//		Thread.sleep(9000);
//		Driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
//		Thread.sleep(3000);
		
		String  Path=".\\Data\\TestData.xlsx";
		FileInputStream FIS=new FileInputStream(Path);
		XSSFWorkbook wk=new XSSFWorkbook(FIS);
		XSSFSheet Sheet=wk.getSheet("Sheet1");
		
		int rows=Sheet.getLastRowNum();
		int cols=Sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			  XSSFRow row=Sheet.getRow(r);
			
			  for(int c=0;c<=cols;c++)
			       {
				        XSSFCell cell=row.getCell(c);
				        
				        switch(cell.getCellType())
				        {
				        case STRING: System.out.println(cell.getStringCellValue()); break;
				        case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				        case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				        }
		        	}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		