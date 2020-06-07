package test1;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;


public class AmazonMob {
	
	public void amazonMobTest() throws Exception {
		
		CommonFunctions c = new CommonFunctions();		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","10");
		dc.setCapability("deviceName","motorola one power");
		dc.setCapability("udid","ZF6223S8L4");
		dc.setCapability("browser","Chrome");
		dc.setCapability("appPackage","in.amazon.mShop.android.shopping");
		dc.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity"); 
		//dc.setCapability("autoWebview","true");
		dc.setCapability("noReset","true");
		dc.setCapability("uiautomator2ServerInstallTimeout","40000");
		//dc.setCapability("fullReset","true");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);
		
		Set<String> contextNames = driver.getContextHandles();
		System.out.println(contextNames);
		c.sleep(2);
		driver.context("NATIVE_APP");
		c.sleep(5);
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").click();
		c.sleep(5);
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("modem");
		c.sleep(5);
		
		TouchAction action = new TouchAction((MobileDriver)driver);
		action.tap(PointOption.point(1009, 2016)).perform();
		
		c.sleep(3);
		
		//driver.findElementByXPath("//android.view.View[@text='Netgear R6350 AC1750 Smart WiFi Router (Black)']").click();
		action.tap(PointOption.point(666,1609)).perform();
		
		c.sleep(3);
		
		Set<String> contextNames2 = driver.getContextHandles();
		System.out.println(contextNames2);
		
	
		
		action.press(PointOption.point(512,2127)).moveTo(PointOption.point(613,270)).release().perform();
		c.sleep(3);
		action.press(PointOption.point(453,2076)).moveTo(PointOption.point(552,497)).release().perform();
				
		c.sleep(3);
		driver.findElementByXPath("//android.widget.Button[@text='Add to Cart']").click();
		
		c.sleep(3);
		driver.findElementByAccessibilityId("Cart").click();
		
		c.sleep(5);
		action.press(PointOption.point(684,1854)).moveTo(PointOption.point(653,604)).release().perform();

		c.sleep(3);
		driver.findElementByXPath("//android.widget.Button[@text='Delete']").click();
		
		c.sleep(3);
		action.press(PointOption.point(680,533)).moveTo(PointOption.point(640,2059)).release().perform();
		c.sleep(3);
		action.tap(PointOption.point(477,900)).perform();
		
		c.sleep(3);
		driver.findElementByXPath("//android.widget.Button[@text='Deliver to this pickup store 437/ 38']").click();
		
		c.sleep(3);
		driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
		
		}

}
