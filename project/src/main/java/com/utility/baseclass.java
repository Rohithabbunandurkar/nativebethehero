package com.utility;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseclass {
	public AndroidDriver dri;
	
	@Test
	@BeforeClass
	public void opencode() throws FileNotFoundException, MalformedURLException {
		 DesiredCapabilities 	cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability("avd", "Pixel_4_API_30");
	    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.robinqapitol.bethehero");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"host.exp.exponent.LauncherActivity");
		dri = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		dri.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	}
	@AfterClass
	public void teardown() {
		dri.quit();
	}
		
	
		//dri.findElement(By.xpath("//android.widget.TextView[@text='Account']")).click();
//    	WebElement getid=dri.findElement(By.xpath("//android.widget.EditText[@text='a8525676']"));
//	  System.out.println("value is: "+getid.getAttribute("value"));
//	dri.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']")).click();
//	dri.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Rohit");
//	dri.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("rohitnandurkar@gmail.com");
//	dri.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("7020515334");
//	dri.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("Pune");
//	dri.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("41");
//	dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
//    WebElement successmessage= dri.findElement(By.id("android:id/alertTitle"));
//	successmessage.click();
//	String msg=successmessage.getText();
//	System.out.println(msg);
//	dri.findElement(By.id("android:id/button1")).click();
//    String name= dri.findElement(By.xpath("//android.widget.TextView[@text='Rohit']")).getText();
//	assertEquals(name, "Rohit");
//	System.out.println(name);
//	   dri.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
//			dri.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
//			dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
//			dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();


}
        
	
		
	
		
		
		
		
			
		
		
	


