
package firstTest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.MobileElement;

public class TestonSimulator2 {

	public IOSDriver<IOSElement> driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("platformVersion", "14.3");
		desiredCapabilities.setCapability("deviceName", "iPad Air");
		desiredCapabilities.setCapability("automationName", "XCUITest");
		desiredCapabilities.setCapability("udid", "2C656E3B-1827-42A9-9A05-A920816D80F4");
		desiredCapabilities.setCapability("bundleId", "com.apple.MobileAddressBook");

		driver = new IOSDriver<IOSElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
	}

	@Test
	public void addContact() {

		System.out.println("Navigated Contacts");
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Contacts");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Add");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("First name");
		el3.sendKeys("ABC");
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Last name");
		el4.sendKeys("XYZ");
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Done");
		el5.click();
		System.out.println("Adding Contact Successful");
	}

	@Test
	public void verifyAddedContact() {

		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Contacts");
		el1.click();

		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("ABC XYZ");
		el2.isDisplayed();

		System.out.println("Verifying Contact Successful");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}