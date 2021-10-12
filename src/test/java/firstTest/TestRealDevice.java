package firstTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestRealDevice { 

	static IOSDriver<IOSElement> driver;

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		System.out.println("Gaurav");

		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.5");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad mini 4");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.UDID, "6F81BB8B-611F-48CF-A247-85001592D714" );
		capabilities.setCapability(MobileCapabilityType.APP, "com.apple.mobileslideshow");	

	

		driver = new IOSDriver<IOSElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
	
		}
	

}
