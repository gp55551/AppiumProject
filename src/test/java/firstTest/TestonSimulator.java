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

public class TestonSimulator {

	static IOSDriver<IOSElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		System.out.println("Gaurav");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		
		capabilities.setCapability("bundleId", "com.jeppesen.Aviator");

		
		driver = new IOSDriver<IOSElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Toolbars']")).click();
		//driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByAccessibilityId("Okay / Cancel").click();
		
		driver.findElementByAccessibilityId("OK").click();
		driver.findElement(By.xpath("XCUIElementTypeButton[@name=\"UICatalog\"]")).click();

		
		
		
		//
		
		//driver.findElementByXPath("//*[@value='Text Entry']").click();
		//driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
		//driver.findElementByName("OK").click();
		//driver.navigate().back();

	}
	/*
	 * public void switches()
	 * 
	 * {
	 * 
	 * driver.scrollTo("Switches").click();
	 * 
	 * System.out.println(driver.findElements(By.className("UIASwitch")).get(0).
	 * getAttribute("value"));
	 * 
	 * driver.findElements(By.className("UIASwitch")).get(0).click();
	 * 
	 * System.out.println(driver.findElements(By.className("UIASwitch")).get(0).
	 * getAttribute("value"));
	 * 
	 * }
	 * 
	 * 
	 * public void Pickers()
	 * 
	 * {
	 * 
	 * driver.scrollTo("Picker View").click();
	 * 
	 * System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0)
	 * .getAttribute("value"));
	 * 
	 * driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("85");
	 * 
	 * driver.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("215");
	 * 
	 * System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0)
	 * .getAttribute("value"));
	 * 
	 * }
	 * 
	 * 
	 * public void Alerts()
	 * 
	 * {
	 * 
	 * driver.scrollTo("Alert Views").click();
	 * 
	 * driver.findElementByName("Simple").click();
	 * 
	 * driver.switchTo().alert().accept();
	 * 
	 * }
	 * 
	 */

}
